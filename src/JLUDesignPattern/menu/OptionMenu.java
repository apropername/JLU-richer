package JLUDesignPattern.menu;

import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.*;

public class OptionMenu extends ConsoleMenu {
    @Override
    protected void display() {
        System.out.println();
        System.out.println("\t 选项菜单");
        System.out.println();
        System.out.println("\t1.动画开关");
        System.out.println("\t2.音乐开关");
        System.out.println("\t0.回主菜单");
        System.out.println();
        System.out.println("\t请选择(0-2):");
    }

    @Override
    protected boolean doAction(int choice) {
        if (choice == 1) {
            MenuMgr.getInstance().setActivedMenu(ANIMATE_MENU);
        } else if (choice == 2) {
            MenuMgr.getInstance().setActivedMenu(MUSIC_MENU);
        } else if (choice == 0) {
            MenuMgr.getInstance().setActivedMenu(MAIN_MENU);
        }
        return true;
    }
}
