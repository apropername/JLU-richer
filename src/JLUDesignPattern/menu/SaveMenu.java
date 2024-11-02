package JLUDesignPattern.menu;


import JLUDesignPattern.IO;
import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.PLAY_MENU;

public class SaveMenu extends ConsoleMenu {
    @Override
    protected void display() {
        IO.println("\n\t 保存进度菜单\n");
        IO.println("\t1.xxxx");
        IO.println("\t2.xxxx");
        IO.println("\t3.xxx\n");
        IO.print("\t请选择(1-3):");
    }

    @Override
    protected boolean doAction(int choice) {
        if (choice >= 1 && choice <= 3) {
            //保存到对应存档
            // (to be done)

            //直接继续游戏
            MenuMgr.getInstance().setActivedMenu(PLAY_MENU);
        }
        return true;
    }

}
