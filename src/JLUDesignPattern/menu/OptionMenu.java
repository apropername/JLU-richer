package JLUDesignPattern.menu;

import JLUDesignPattern.IO;
import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.*;

public class OptionMenu extends ConsoleMenu {
    @Override
    protected void display() {
        IO.println("\n\t 选项菜单\n");
        IO.println("\t1.动画开关");
        IO.println("\t2.音乐开关");
        IO.println("\t0.回主菜单\n");
        IO.print("\t请选择(0-2):");
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
