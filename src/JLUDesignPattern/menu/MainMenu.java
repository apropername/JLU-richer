package JLUDesignPattern.menu;

import static JLUDesignPattern.menu.ClearScreen.clearScreen;
import static JLUDesignPattern.menu.MenuType.*;

public class MainMenu extends ConsoleMenu {
    @Override
    protected void display() {
        // 打印菜单
        System.out.println();
        System.out.println("\t 主菜单");
        System.out.println("\t--------");
        System.out.println("\t1.新的游戏");
        System.out.println("\t2.载入游戏");
        System.out.println("\t3.选 项");
        System.out.println("\t0.退 出");
        System.out.println();
        System.out.print("\t请选择(0-3): ");
    }


    @Override
    protected boolean doAction(int choice) {

        if (choice == 0) {
            return false;
        } else if (choice == 1) {
            MenuMgr.menuMgr.setActivedMenu(NEW_MENU);
        } else if (choice == 2) {
            MenuMgr.menuMgr.setActivedMenu(LOAD_MENU);
        } else if (choice == 3) {
            MenuMgr.menuMgr.setActivedMenu(OPTION_MENU);
        }
        return true;
    }
};