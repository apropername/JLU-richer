package JLUDesignPattern.menu.util;

import JLUDesignPattern.menu.Menu;

public interface IMenuFactory{
    Menu createMenu(MenuType menuType);
}
