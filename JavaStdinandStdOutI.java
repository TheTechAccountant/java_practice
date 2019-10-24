import java.util.*;

public class JavaStdinandStdOutI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        keyboard.close();

    }
}