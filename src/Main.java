import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type password to hash: ");

        String password = new String(scanner.nextLine());

        System.out.println("Your hashed password is:  " + password.hashCode());
    }
}
