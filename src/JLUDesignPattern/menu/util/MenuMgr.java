package JLUDesignPattern.menu.util;

import JLUDesignPattern.ConsoleFactory;
import JLUDesignPattern.menu.*;

import java.util.EnumMap;
import java.util.Map;

import static JLUDesignPattern.menu.util.MenuType.*;

public class MenuMgr {
    private static final MenuMgr instance=new MenuMgr();
    public static MenuMgr getInstance() {return instance;}

    private final Map<MenuType, Menu> mMapMenus = new EnumMap<>(MenuType.class);
    private MenuMgr() {

        for(MenuType menuType : MenuType.values()) {//todo:当前初始化放在构造函数中，有背文档指示
            mMapMenus.put(menuType, ConsoleFactory.getInstance().createMenu(menuType));
        }

        setActivedMenu(MAIN_MENU);

    }

    public Menu activedMenu() {
        return mCurMenu;
    }//const

    private Menu mCurMenu = null; // 当前菜单
    public void setActivedMenu(MenuType menuType) {
        mCurMenu = mMapMenus.get(menuType);
    }

}