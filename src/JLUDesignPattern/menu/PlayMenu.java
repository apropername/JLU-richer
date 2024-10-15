package JLUDesignPattern.menu;


import static JLUDesignPattern.menu.MenuType.*;

public class PlayMenu extends ConsoleMenu {
    @Override
    protected void display() {
        //显示界面
        // (to be done)
        System.out.println();
        System.out.print("\t1.前进  0.暂停 \t请选择(0-1):");
    }

    @Override
    protected boolean doAction(int choice) {
        if (choice == 0) {
            MenuMgr.getInstance().setActivedMenu(PAUSE_MENU);
        } else if (choice == 1) {
            //玩家前进
// (to be done)
            MenuMgr.getInstance().setActivedMenu(PLAY_MENU);
        }
        return true;
    }
}
