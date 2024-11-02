package JLUDesignPattern.menu;

import JLUDesignPattern.IO;
import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.*;

public class PauseMenu extends ConsoleMenu {
    @Override
    protected void display() {
        IO.println("\n\t 暂停菜单\n");
        IO.println("\t1.保存进度");
        IO.println("\t2.回主菜单");
        IO.println("\t0.继续游戏\n");
        IO.print("\t请选择(0-2):");
    }

    @Override
    protected boolean doAction(int choice) {
        if (choice == 1) {
            MenuMgr.getInstance().setActivedMenu(SAVE_MENU);
        } else if (choice == 2) {
            MenuMgr.getInstance().setActivedMenu(MAIN_MENU);
        } else {
            MenuMgr.getInstance().setActivedMenu(PLAY_MENU);
        }
        return true;
    }
}
