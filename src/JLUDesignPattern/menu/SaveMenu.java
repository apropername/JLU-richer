package JLUDesignPattern.menu;


import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.PLAY_MENU;

public class SaveMenu extends ConsoleMenu {
    @Override
    protected void display() {
        System.out.println();
        System.out.println("\t 保存进度菜单");
        System.out.println();
        System.out.println("\t1.xxxx");
        System.out.println("\t2.xxxx");
        System.out.println("\t3.xxx");
        System.out.println();
        System.out.println("\t请选择(1-3):");
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
