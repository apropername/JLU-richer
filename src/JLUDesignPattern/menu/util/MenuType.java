package JLUDesignPattern.menu.util;

import JLUDesignPattern.block.util.BlockType;

public enum MenuType {
        MAIN_MENU,
        NEW_MENU,
        LOAD_MENU,
        OPTION_MENU,
        PLAY_MENU,
        SAVE_MENU,
        PAUSE_MENU,
        ANIMATE_MENU,
        MUSIC_MENU,
        PLAYER_COUNT_MENU,
        DIFFICULTY_MENU;
        public static final int TOTAL_COUNT= MenuType.values().length;
}
