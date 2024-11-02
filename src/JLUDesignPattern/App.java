package JLUDesignPattern;

import JLUDesignPattern.Player.util.PlayerMgr;
import JLUDesignPattern.block.util.BlockFactory;
import JLUDesignPattern.map.util.MapFactory;
import JLUDesignPattern.map.util.MapID;
import JLUDesignPattern.map.util.MapMgr;
import JLUDesignPattern.menu.Menu;
import JLUDesignPattern.menu.util.MenuMgr;


public class App {
    public void init() {
        // 确定使用的Map工厂
        MapFactory mapFac = MapFactory.INSTANCE;
        // 确定使用的Block工厂
        BlockFactory blockFac = BlockFactory.INSTANCE;
        // 加载地图
//        MapMgr.INSTANCE.setActiveMap( MapID.TOWN_MAP, mapFac, blockFac);
        MapMgr.INSTANCE.setActiveMap( MapID.CITY_MAP, mapFac, blockFac);
        PlayerMgr.getInstance( ).resetPlayers( 2 );

    }

    public void run() {
        boolean running = true;
        while (running) {
            Menu pMenu = MenuMgr.getInstance().activedMenu();
            running = pMenu.process();
        }
    }

    public void term() {
    }
}
