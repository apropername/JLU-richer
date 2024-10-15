package JLUDesignPattern.menu;

import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.*;

public class PauseMenu extends ConsoleMenu {
    @Override
    protected void display() {
        System.out.println();
        System.out.println("\t 暂停菜单");
        System.out.println();
        System.out.println("\t1.保存进度");
        System.out.println("\t2.回主菜单");
        System.out.println("\t0.继续游戏");
        System.out.println();
        System.out.println("\t请选择(0-2):");
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
