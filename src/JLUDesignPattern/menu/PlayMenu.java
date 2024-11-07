package JLUDesignPattern.menu;


import JLUDesignPattern.IO;
import JLUDesignPattern.Player.Player;
import JLUDesignPattern.Player.util.PlayerMgr;
import JLUDesignPattern.map.util.MapMgr;
import JLUDesignPattern.menu.util.MenuMgr;
import JLUDesignPattern.menu.util.MenuType;

import static JLUDesignPattern.menu.util.MenuType.*;

public class PlayMenu extends ConsoleMenu {
    @Override
    protected void display() {
        IO.cls();
        // 显示界面
        MapMgr.INSTANCE.activedMap().show( );
        // 显示菜单
        IO.print("\n\t1.前进  0.暂停 \t请选择(0-1):");
    }

    @Override
    protected boolean doAction(int choice) {
        if (choice == 0) {
            MenuMgr.getInstance().setActivedMenu(PAUSE_MENU);
        } else if (choice == 1) {
            Player player = PlayerMgr.getInstance( ).getActivePlayer( );//因为startRound的停止条件,总是UserPlayer,
            player.forceAdvance( ); //强制UserPlayer前进
            //设置下一个(firstAutoPlayer)为ActivePlayer
            PlayerMgr.getInstance( ).nextPlayer( );
            //继续开始新一轮前进   目前就是让电脑玩家即其它所有玩家走完
            PlayerMgr.getInstance( ).startRound();

            MenuMgr.getInstance( ).setActivedMenu( MenuType.PLAY_MENU );
        }
        return true;
    }
}
