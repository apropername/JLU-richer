package JLUDesignPattern.menu;

import JLUDesignPattern.IO;
import JLUDesignPattern.Player.util.PlayerMgr;
import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.*;

public class NewMenu extends ConsoleMenu {
    @Override
    protected void display() {
        IO.println("\n\t 开始菜单");
        IO.println("\n\t1.玩家数量");
        IO.println("\t2.难度等级");
        IO.println("\t0.开始游戏\n");
        IO.print("\t请选择(0-2):");
    }

    @Override
    protected boolean doAction(int choice) {

        if (choice == 1) {
            MenuMgr.getInstance().setActivedMenu(PLAYER_COUNT_MENU);
        } else if (choice == 2) {
            MenuMgr.getInstance().setActivedMenu(DIFFICULTY_MENU);
        } else if (choice == 0) {
            // 开始游戏
            PlayerMgr.getInstance( ).startRound( );
            MenuMgr.getInstance().setActivedMenu(PLAY_MENU);
        }
        return true;
    }
};