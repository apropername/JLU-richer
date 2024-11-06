package JLUDesignPattern;

import JLUDesignPattern.Player.util.Dir;
import JLUDesignPattern.block.*;
import JLUDesignPattern.block.util.BlockType;
import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.Map;
import JLUDesignPattern.map.util.MapID;
import JLUDesignPattern.menu.*;
import JLUDesignPattern.menu.util.MenuType;

import java.util.List;

public class ConsoleFactory implements AbstractFactory {
    private static final ConsoleFactory instance=new ConsoleFactory();
    public static ConsoleFactory getInstance() {
        return instance;
    }
    @Override
    public Block createBlock(BlockType type) {
        return switch (type) {
            case NORMAL_BLOCK -> new NormalBlock();
            case MONEY_BLOCK -> new MoneyBlock();
            case TRIP_BLOCK -> new TripBlock();
            case BAR_BLOCK -> new BarBlock();
        };
    }

    @Override
    public Map createMap(List<List<Integer>> mapData, IBlockFactory fac) {
        Map map = new Map( );
        final var enumValues=BlockType.class.getEnumConstants();//todo:想不这么麻烦只能改变data容器声明的类型
        for ( var row : mapData ) {
            Block b = fac.createBlock(enumValues[row.get(1)]);
            b.setXY(row.get(7), row.get(8));
            map.addBlock( b );
        }
        // 遍历各Blcok，并指定邻居
        for ( var row : mapData ) {
            //由于是push_back存入vector，所以index就是创建的顺序
            int index = row.get(0) - 1;   // Blocks在Map中的序号
            Block  center = map.getBlockByIndex(index); //中心Blcok
            Block  neighbor = null;
            //左邻居
            neighbor = row.get(2) > 0 ? map.getBlockByIndex( row.get(2) - 1 ):null;
            center.setNeightbor( Dir.LEFT, neighbor );
            //右邻居
            neighbor = row.get(3) > 0 ? map.getBlockByIndex( row.get(3) - 1 ) :
                    null;
            center.setNeightbor( Dir.RIGHT, neighbor );
            //上邻居
            neighbor = row.get(4) > 0 ? map.getBlockByIndex( row.get(4) - 1 ) :
                    null;
            center.setNeightbor( Dir.UP, neighbor );
            //下邻居
            neighbor = row.get(5) > 0 ? map.getBlockByIndex( row.get(5) - 1 ) :
                    null;
            center.setNeightbor( Dir.DOWN, neighbor );
        }
        return map;
    }

    @Override
    public Menu createMenu(MenuType menuType) {
        return switch (menuType) {
            case MAIN_MENU -> new MainMenu();
            case NEW_MENU -> new NewMenu();
            case LOAD_MENU -> new LoadMenu();
            case OPTION_MENU -> new OptionMenu();
            case PLAY_MENU -> new PlayMenu();
            case SAVE_MENU -> new SaveMenu();
            case PAUSE_MENU -> new PauseMenu();
            case ANIMATE_MENU -> new AnimateMenu();
            case MUSIC_MENU -> new MusicMenu();
            case PLAYER_COUNT_MENU -> new PlayerCountMenu();
            case DIFFICULTY_MENU -> new DifficultyMenu();
        };
    }
}
