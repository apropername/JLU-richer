package JLUDesignPattern;

import JLUDesignPattern.Player.util.PlayerMgr;
import JLUDesignPattern.block.util.BlockProtoFactory;
import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.util.*;
import JLUDesignPattern.menu.Menu;
import JLUDesignPattern.menu.util.IMenuFactory;
import JLUDesignPattern.menu.util.MenuMgr;


public class App {
    public void init() {
        // 确定使用的Map工厂
        IMapFactory mapFac = ConsoleFactory.getInstance( );
        // 确定使用的Block工厂
        IBlockFactory blockFac = BlockProtoFactory.getInstance( );
//        IBlockFactory blockFac = ConsoleFactory.getInstance( );

        // 加载地图
        MapMgr.INSTANCE.setActiveMap( MapID.TOWN_MAP, mapFac, blockFac);
//        MapMgr.INSTANCE.setActiveMap( MapID.CITY_MAP, mapFac, blockFac);


        PlayerMgr.getInstance( ).resetPlayers( 2 );

    }

    public void run() {
        boolean running = true;
        while (running) {//todo 状态模式
            Menu pMenu = MenuMgr.getInstance().activedMenu();
            running = pMenu.process();
        }
    }

    public void term() {
    }
}
