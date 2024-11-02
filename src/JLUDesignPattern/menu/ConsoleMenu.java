package JLUDesignPattern.menu;

import JLUDesignPattern.IO;

import java.io.*;

import static JLUDesignPattern.ClearScreen.clearScreen;


abstract class ConsoleMenu extends Menu {
    @Override
    final public boolean process() {
        IO.cls();//与文档不同，将此重复语句抽出，导致要求子类不得覆写
        display();
        try {
            int choice = selectMenuItem();
            return doAction(choice);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    protected abstract boolean doAction(int choice);
    protected abstract void display();

    protected int selectMenuItem() throws IOException {
        return IO.readDigital();
    }

}
