package JLUDesignPattern.menu.util;

import JLUDesignPattern.menu.*;
import JLUDesignPattern.menu.Menu;

import static JLUDesignPattern.menu.util.MenuType.*;

public enum MenuFactory implements IMenuFactory {
    INSTANCE;
    @Override
    public Menu createMenu(MenuType menuType) {
        switch (menuType) {
            case MAIN_MENU -> {return new MainMenu();
            }
            case NEW_MENU -> {return new NewMenu();
            }
            case LOAD_MENU -> {return new LoadMenu();
            }
            case OPTION_MENU -> {return new OptionMenu();
            }
            case PLAY_MENU -> {return new PlayMenu();
            }
            case SAVE_MENU -> {return new SaveMenu();
            }
            case PAUSE_MENU -> {return new PauseMenu();
            }
            case ANIMATE_MENU -> {return new AnimateMenu();
            }
            case MUSIC_MENU -> {return new MusicMenu();
            }
            case PLAYER_COUNT_MENU -> {return new PlayerCountMenu();
            }
            case DIFFICULTY_MENU -> {return new DifficultyMenu();
            }
            case null, default -> {assert false;
            }
        }
        return null;
    }
}
