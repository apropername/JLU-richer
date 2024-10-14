package JLUDesignPattern.menu;

import static JLUDesignPattern.menu.MenuType.*;

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
            MenuMgr.menuMgr.setActivedMenu(SAVE_MENU);
        } else if (choice == 2) {
            MenuMgr.menuMgr.setActivedMenu(MAIN_MENU);
        } else {
            MenuMgr.menuMgr.setActivedMenu(PLAY_MENU);
        }
        return true;
    }
}
