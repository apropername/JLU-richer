package JLUDesignPattern.menu;

import JLUDesignPattern.IO;

import java.io.*;



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

    private int selectMenuItem() throws IOException {//原文当中是protected，这里我认为private就够了
        return IO.readDigital();
    }

}
