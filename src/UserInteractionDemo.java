import java.util.Scanner;

public class UserInteractionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please specify a value");
        if (scanner.nextInt() > 100) {
            System.out.println("HIGH");
        } else {
            System.out.println("LOW");
        }
    }
}
