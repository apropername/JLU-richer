package JLUDesignPattern;

import JLUDesignPattern.menu.Menu;
import static JLUDesignPattern.menu.MenuMgr.menuMgr;//TODO:限制性更强

public class App {
    public void init() {
    }

    public void run() {
        boolean running = true;
        while (running) {
            Menu pMenu = menuMgr.activedMenu();
            running = pMenu.process();
        }
    }

    public void term() {
    }
}
