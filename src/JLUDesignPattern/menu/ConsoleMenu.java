package JLUDesignPattern.menu;

import java.io.*;

import static JLUDesignPattern.menu.ClearScreen.clearScreen;


abstract class ConsoleMenu implements Menu {
    @Override
    public boolean process() {
        clearScreen();
        display();
        try {
            int choice = selectMenuItem();
            return doAction(choice);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    protected abstract boolean doAction(int choice);
    protected abstract void display();//const

    protected int selectMenuItem() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digital = -1;

        // 读取用户输入直到满足条件
        while (digital < 0 || digital > 9) {
            String input = reader.readLine();

            // 确保输入有效并且是一个数字
            if (input != null && !input.isEmpty()) {
                try {
                    digital = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    digital = -1;
                }
            }
        }

        System.out.print(digital);
        return digital;
    }

}
