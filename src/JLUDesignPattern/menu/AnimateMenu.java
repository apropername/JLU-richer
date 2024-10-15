package JLUDesignPattern.menu;

import JLUDesignPattern.menu.util.MenuMgr;

import static JLUDesignPattern.menu.util.MenuType.OPTION_MENU;

public class AnimateMenu extends ConsoleMenu {
    @Override
    protected void display() {//const
        System.out.println();
        System.out.println("\t 动画菜单");
        System.out.println();
        System.out.println("\t1.开");
        System.out.println("\t2.关");
        System.out.println();
        System.out.println("\t请选择(1-2):");
    }

    @Override
    protected boolean doAction(int choice) {
        if(choice == 1) {
            //处理开动画
        } else if (choice == 2) {
            //处理关闭动画
        }
        MenuMgr.getInstance().setActivedMenu(OPTION_MENU);//TODO:思考能否抽象,不过这几乎已经就是 给了个参数而已
        return true;
    }

}
