package JLUDesignPattern.menu.util;

import JLUDesignPattern.menu.*;
import JLUDesignPattern.menu.Menu;

import static JLUDesignPattern.menu.util.MenuType.*;

public enum MenuFactoryImpl implements MenuFactory {
    INSTANCE;
    @Override
    public Menu createMenu(MenuType menuType) {
        if ( menuType == MAIN_MENU )
            return new MainMenu( );
        else if ( menuType == NEW_MENU )
            return new NewMenu( );
        else if ( menuType == LOAD_MENU )
            return new LoadMenu( );
        else if ( menuType == OPTION_MENU )
            return  new OptionMenu( );
        else if ( menuType == PLAY_MENU )
            return  new PlayMenu( );
        else if ( menuType == SAVE_MENU )
            return  new SaveMenu( );
        else if ( menuType == PAUSE_MENU )
            return  new PauseMenu( );
        else if ( menuType == ANIMATE_MENU )
            return  new AnimateMenu( );
        else if ( menuType == MUSIC_MENU )
            return  new MusicMenu( );
        else if ( menuType == PLAYER_COUNT_MENU )
            return  new PlayerCountMenu( );
        else if ( menuType == DIFFICULTY_MENU )
            return  new DifficultyMenu( );
        assert false;
        return null;
    }
}
