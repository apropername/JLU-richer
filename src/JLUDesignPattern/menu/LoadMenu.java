package JLUDesignPattern.menu;

import JLUDesignPattern.IO;
import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.PLAY_MENU;

public class LoadMenu extends ConsoleMenu {
    @Override
    protected void display() {//const
        IO.println("\n\t 载入进度菜单\n");
        IO.println("\t1.xxxx");
        IO.println("\t2.xxxx");
        IO.println("\t3.xxx");
        IO.println("\t0.返回游戏\n");
        IO.print("\t请选择(0-3):");
    }

    @Override
    protected boolean doAction(int choice) {
        //暂时，全部继续游戏
        MenuMgr.getInstance().setActivedMenu(PLAY_MENU);
        return true;
    }
}