package JLUDesignPattern.menu.util;

import JLUDesignPattern.menu.Menu;

public interface MenuFactory{
    Menu createMenu(MenuType menuType);
}
