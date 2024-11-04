package JLUDesignPattern;

import java.util.Scanner;


public class IO {
    private static Scanner scanner = new Scanner(System.in);

    public static short readDigital( ) {
        short  digital = -1 ;
        while ( digital < 0 || digital>9 ) {
            // Read single character
            String input = scanner.nextLine();
            if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
                digital = (short) (input.charAt(0) - '0');
            }
        }
        System.out.println(digital); // Echo the correct input
        return digital;
    }
    public static void cls( ) {
        // 使用 ANSI escape code 清屏
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Print single value
    public static <T> void print(T value) {
        System.out.print(value);
    }
    // Print multiple values
    public static <T> void print(T value, T... args) {
        System.out.print(value);
        if (args.length > 0) {
            System.out.print(" ");
            print(args);// Recursive call to print additional arguments
        }
    }
    public static <T> void println(T value, T... args) {
        print(value, args); // Call print with the value and additional arguments
        System.out.println(); // Print a newline
    }

}
