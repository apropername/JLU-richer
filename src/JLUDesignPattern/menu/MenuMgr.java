package JLUDesignPattern.menu;

import java.util.EnumMap;
import java.util.Map;

import static JLUDesignPattern.menu.MenuType.*;

public class MenuMgr {
    private static final MenuMgr instance=new MenuMgr();
    public static MenuMgr getInstance() {return instance;}

    private Map<MenuType,Menu> mMapMenus = new EnumMap<>(MenuType.class);
    private MenuMgr() {
        mMapMenus.put(MAIN_MENU,new MainMenu());
        mMapMenus.put(NEW_MENU,new NewMenu());
        mMapMenus.put(LOAD_MENU,new LoadMenu());
        mMapMenus.put(OPTION_MENU,new OptionMenu());
        mMapMenus.put(PLAY_MENU,new PlayMenu());
        mMapMenus.put(SAVE_MENU,new SaveMenu());
        mMapMenus.put(PAUSE_MENU,new PauseMenu());
        mMapMenus.put(ANIMATE_MENU,new AnimateMenu());
        mMapMenus.put(MUSIC_MENU,new MusicMenu());
        mMapMenus.put(PLAYER_COUNT_MENU,new PlayerCountMenu());
        mMapMenus.put(DIFFICULTY_MENU,new DifficultyMenu());

        setActivedMenu(MAIN_MENU);

    }

    public Menu activedMenu() {
        return mCurMenu;
    }//const

    private Menu mCurMenu = null; // 当前菜单
    public void setActivedMenu(MenuType menuType) {
        mCurMenu = mMapMenus.get(menuType);
    }

};