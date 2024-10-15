package JLUDesignPattern.menu;

import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.NEW_MENU;

public class PlayerCountMenu extends ConsoleMenu {
    @Override
    protected void display() {
        // 打印菜单
        System.out.println();
        System.out.println("\t 玩家数量");
        System.out.println("\t1.玩家数量(1)");
        System.out.println("\t2.玩家数量(2)");
        System.out.println("\t3.玩家数量(3)");
        System.out.println("\t4.玩家数量(4)");
        System.out.println("\t5.玩家数量(5)");
        System.out.println("\t0.返回");
        System.out.println();
        System.out.print("\t请选择(0-5): ");
    }

    @Override
    protected boolean doAction(int choice) {
        if (choice >= 1 && choice <= 5) {
            //记录玩家数量
// (to be done)
        }
        if (choice >= 0 && choice <= 5)
            MenuMgr.getInstance().setActivedMenu(NEW_MENU);
        return true;
    }

}
