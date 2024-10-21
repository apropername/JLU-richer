package JLUDesignPattern.menu;


import JLUDesignPattern.map.util.MapMgr;
import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.ClearScreen.clearScreen;
import static JLUDesignPattern.menu.util.MenuType.*;

public class PlayMenu extends ConsoleMenu {
    @Override
    protected void display() {
        clearScreen();
        // 显示界面
        MapMgr.INSTANCE.activedMap().show( );
        // 显示菜单
        System.out.println();
        System.out.print("\t1.前进  0.暂停 \t请选择(0-1):");
    }

    @Override
    protected boolean doAction(int choice) {
        if (choice == 0) {
            MenuMgr.getInstance().setActivedMenu(PAUSE_MENU);
        } else if (choice == 1) {
            //玩家前进
// (to be done)
            MenuMgr.getInstance().setActivedMenu(PLAY_MENU);
        }
        return true;
    }
}
