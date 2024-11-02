package JLUDesignPattern.menu;

import JLUDesignPattern.IO;
import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.OPTION_MENU;

public class AnimateMenu extends ConsoleMenu {
    @Override
    protected void display() {//const
        IO.println("\n\t 动画菜单\n");
        IO.println("\t1.开");
        IO.println("\t2.关\n");
        IO.print("\t请选择(1-2):");
    }

    @Override
    protected boolean doAction(int choice) {
        if(choice == 1) {
            //处理开动画
        } else if (choice == 2) {
            //处理关闭动画
        }
        MenuMgr.getInstance().setActivedMenu(OPTION_MENU);
        return true;
    }

}
