package unit1_fundamentals;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println("What is your age?");
        int userAge = scanner.nextInt();
        System.out.println(userName + " you are " + userAge + " years old." );
        scanner.close();
    }
} 
