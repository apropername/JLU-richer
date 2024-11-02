package JLUDesignPattern.menu;
import JLUDesignPattern.IO;
import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.OPTION_MENU;

public class MusicMenu extends ConsoleMenu {
    @Override
    protected void display() {
        IO.println("\n\t 音乐菜单\n");
        IO.println("\t1.开");
        IO.println("\t2.关\n");
        IO.print("\t请选择(1-2):");

    }

    @Override
    protected boolean doAction(int choice) {
        if (choice == 1) {
            //处理开音乐
        } else if (choice == 2) {
            //处理关闭音乐
        }
        MenuMgr.getInstance().setActivedMenu(OPTION_MENU);
        return true;
    }
}
