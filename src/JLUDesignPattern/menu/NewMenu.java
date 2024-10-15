package JLUDesignPattern.menu;

import static JLUDesignPattern.menu.MenuType.*;

public class NewMenu extends ConsoleMenu {
    @Override
    protected void display() {
        System.out.println();
        System.out.println("\t 开始菜单");
        System.out.println();
        System.out.println("\t1.玩家数量");
        System.out.println("\t2.难度等级");
        System.out.println("\t0.开始游戏");
        System.out.println();
        System.out.println("\t请选择(0-2):");
    }

    @Override
    protected boolean doAction(int choice) {

        if (choice == 1) {
            MenuMgr.getInstance().setActivedMenu(PLAYER_COUNT_MENU);
        } else if (choice == 2) {
            MenuMgr.getInstance().setActivedMenu(DIFFICULTY_MENU);
        } else if (choice == 0) {
            MenuMgr.getInstance().setActivedMenu(PLAY_MENU);
        }
        return true;
    }
};