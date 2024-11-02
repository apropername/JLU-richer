package JLUDesignPattern;

public class ClearScreen {
    private ClearScreen() {
        throw new UnsupportedOperationException("Cannot instantiate ClearScreen");
    }
    // 清屏方法
    public static void clearScreen() {
        // 使用 ANSI escape code 清屏
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
