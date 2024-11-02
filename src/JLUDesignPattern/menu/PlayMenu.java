package JLUDesignPattern.menu;


import JLUDesignPattern.IO;
import JLUDesignPattern.Player.Player;
import JLUDesignPattern.Player.util.PlayerMgr;
import JLUDesignPattern.map.util.MapMgr;
import JLUDesignPattern.menu.util.MenuMgr;
import JLUDesignPattern.menu.util.MenuType;

import static JLUDesignPattern.ClearScreen.clearScreen;
import static JLUDesignPattern.menu.util.MenuType.*;

public class PlayMenu extends ConsoleMenu {
    @Override
    protected void display() {
        clearScreen();
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
            Player player = PlayerMgr.getInstance( ).getActivePlayer( );
            player.forceAdvance( ); //强制UserPlayer前进
            //设置下一个为AcivePlayer
            PlayerMgr.getInstance( ).nextPlayer( );
            //继续开始新一轮前进
            PlayerMgr.getInstance( ).startRound();

            MenuMgr.getInstance( ).setActivedMenu( MenuType.PLAY_MENU );
        }
        return true;
    }
}
