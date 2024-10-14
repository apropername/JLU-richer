package JLUDesignPattern.menu;
import static JLUDesignPattern.menu.MenuType.OPTION_MENU;

public class MusicMenu extends ConsoleMenu {
    @Override
    protected void display() {
        System.out.println();
        System.out.println("\t 音乐菜单");
        System.out.println();
        System.out.println("\t1.开");
        System.out.println("\t2.关");
        System.out.println();
        System.out.println("\t请选择(1-2):");

    }

    @Override
    protected boolean doAction(int choice) {
        if (choice == 1) {
            //处理开音乐
        } else if (choice == 2) {
            //处理关闭音乐
        }
        MenuMgr.menuMgr.setActivedMenu(OPTION_MENU);
        return true;
    }
}
