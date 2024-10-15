package JLUDesignPattern.menu;

import static JLUDesignPattern.menu.MenuType.PLAY_MENU;

public class LoadMenu extends ConsoleMenu {
    @Override
    protected void display() {//const
        System.out.println();
        System.out.println("\t 载入进度菜单");
        System.out.println();
        System.out.println("\t1.xxxx");
        System.out.println("\t2.xxxx");
        System.out.println("\t3.xxx");
        System.out.println("\t0.返回游戏");
        System.out.println();
        System.out.println("\t请选择(0-3):");
    }

    @Override
    protected boolean doAction(int choice) {
        MenuMgr.getInstance().setActivedMenu(PLAY_MENU);
        return true;
    }
}