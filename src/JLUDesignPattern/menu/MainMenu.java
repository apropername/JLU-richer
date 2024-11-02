package JLUDesignPattern.menu;

import JLUDesignPattern.IO;
import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.*;

public class MainMenu extends ConsoleMenu {
    @Override
    protected void display() {
        // 打印菜单
        IO.println("\n\t 主菜单");
        IO.println("\t--------");
        IO.println("\t1.新的游戏");
        IO.println("\t2.载入游戏");
        IO.println("\t3.选 项");
        IO.println("\t0.退 出\n");
        IO.print("\t请选择(0-3): ");
    }


    @Override
    protected boolean doAction(int choice) {

        if (choice == 0) {
            return false;
        } else if (choice == 1) {
            MenuMgr.getInstance().setActivedMenu(NEW_MENU);
        } else if (choice == 2) {
            MenuMgr.getInstance().setActivedMenu(LOAD_MENU);
        } else if (choice == 3) {
            MenuMgr.getInstance().setActivedMenu(OPTION_MENU);
        }
        return true;
    }
};