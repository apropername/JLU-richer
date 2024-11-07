package JLUDesignPattern;

import JLUDesignPattern.Player.util.PlayerMgr;
import JLUDesignPattern.block.util.BlockProtoFactory;
import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.util.*;


public class App {
    private GameState gameState;
    public void changeState(GameState state) {
        gameState = state;
    }
    public void init() {
        Welcome.INSTANCE.setContext(this);
        Playing.INSTANCE.setContext(this);
        changeState(Welcome.INSTANCE);

        // 确定使用的Map工厂
        MapFactory mapFac = MapFactory.INSTANCE;
        MapFactory.INSTANCE.setMapDataSelector(new MapDataSelector());
        // 确定使用的Block工厂
//        IBlockFactory blockFac = BlockFactory.INSTANCE;
        IBlockFactory blockFac = BlockProtoFactory.getInstance( );
        // 加载地图
//        MapMgr.INSTANCE.setActiveMap( MapID.TOWN_MAP, mapFac, blockFac);

/*        MapMgr.INSTANCE.setActiveMap( MapID.CITY_MAP, mapFac, blockFac);//myTEST
        MapFactory.INSTANCE.setMapDataSelector(new MapDataSelectorTest());//myTEST
        */
        MapMgr.INSTANCE.setActiveMap( MapID.CITY_MAP, mapFac, blockFac);
        PlayerMgr.getInstance( ).resetPlayers( 2 );

    }

    public void run() {
        do{
            gameState.process();
        }while(gameState!= GameOver.INSTANCE);
        gameState.process();
    }

    public void term() {
    }
}
