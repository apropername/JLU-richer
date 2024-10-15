package JLUDesignPattern.menu;

import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.NEW_MENU;

public class DifficultyMenu extends ConsoleMenu {
    @Override
    protected void display() {
        // 打印菜单
        System.out.println();
        System.out.println("\t 难度等级菜单");
        System.out.println("\t1.菜鸟");
        System.out.println("\t2.普通");
        System.out.println("\t3.困难");
        System.out.println("\t4.骨灰");
        System.out.println("\t0.返回");
        System.out.println();
        System.out.print("\t请选择(0-4): ");
    }

    @Override
    protected boolean doAction(int choice) {
        if (choice >= 1 && choice <= 4) {
            //记录难度等级
            // (to be done)
        }
        if (choice >= 0 && choice <= 5)
            MenuMgr.getInstance().setActivedMenu(NEW_MENU);
        return true;
    }
}
