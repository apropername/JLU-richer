package JLUDesignPattern;

import JLUDesignPattern.menu.Menu;
import JLUDesignPattern.menu.MenuMgr;

public class App {
    public void init() {
    }

    public void run() {
        boolean running = true;
        while (running) {
            Menu pMenu = MenuMgr.getInstance().activedMenu();
            running = pMenu.process();
        }
    }

    public void term() {
    }
}
