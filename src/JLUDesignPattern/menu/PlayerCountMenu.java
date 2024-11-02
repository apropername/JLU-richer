package JLUDesignPattern.menu;

import JLUDesignPattern.IO;
import JLUDesignPattern.Player.util.PlayerMgr;
import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.NEW_MENU;

public class PlayerCountMenu extends ConsoleMenu {
    @Override
    protected void display() {
        // 打印菜单
        IO.println("\n\t 玩家数量");
        IO.println("\t1.玩家数量(1)");
        IO.println("\t2.玩家数量(2)");
        IO.println("\t3.玩家数量(3)");
        IO.println("\t4.玩家数量(4)");
        IO.println("\t5.玩家数量(5)");
        IO.println("\t0.返回\n");
        IO.print("\t请选择(0-5): ");
    }

    @Override
    protected boolean doAction(int choice) {
        if (choice >= 1 && choice <= 5) {
            //记录玩家数量
            PlayerMgr.getInstance().resetPlayers(choice);
        }
        if (choice >= 0 && choice <= 5)
            MenuMgr.getInstance().setActivedMenu(NEW_MENU);
        return true;
    }

}
