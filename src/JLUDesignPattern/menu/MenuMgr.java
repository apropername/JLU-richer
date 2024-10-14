package JLUDesignPattern.menu;

import java.util.Vector;

import static JLUDesignPattern.menu.MenuType.MAIN_MENU;

public class MenuMgr {
    public static MenuMgr menuMgr = new MenuMgr();

    public MenuMgr() {//TODO: check enum
        mVctMenus.add(new MainMenu());
        mVctMenus.add(new NewMenu());
        mVctMenus.add(new LoadMenu());
        mVctMenus.add(new OptionMenu());
        mVctMenus.add(new PlayMenu());
        mVctMenus.add(new SaveMenu());
        mVctMenus.add(new PauseMenu());
        mVctMenus.add(new AnimateMenu());
        mVctMenus.add(new MusicMenu());
        mVctMenus.add(new PlayerCountMenu());
        mVctMenus.add(new DifficultyMenu());
        setActivedMenu(MAIN_MENU);

    }

    public Menu activedMenu() {
        return mCurMenu;
    }//const

    public void setActivedMenu(MenuType menuType) {
        mCurMenu = mVctMenus.get(menuType.ordinal());
    }

    private Menu mCurMenu = null; // 当前菜单
    private Vector<Menu> mVctMenus = new Vector<>();
};