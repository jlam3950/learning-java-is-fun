package unit1_fundamentals;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {

        // exercise 1 a
            // Scanner scanner = new Scanner(System.in);
            // System.out.println("What is your age?");
            // int age = scanner.nextInt();
            // int doubleAge = age * 2;
            // System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + doubleAge + " old.");
            // scanner.close();
        // exercise 1 b
            // Scanner scanboi = new Scanner(System.in);
            // System.out.println("What is your name?");
            // String name = scanboi.next();
            // int nameLength = name.length();
            // System.out.println("Your name is " + nameLength + " characters long.");
            // scanboi.close();

        // exercise 2 
            Scanner scanBot = new Scanner(System.in);
            System.out.println("What is the bill total?");
            double bill = scanBot.nextDouble();
            System.out.println("How many people are there?");
            int numOfPeople = scanBot.nextInt();
            Double eachBill = bill/numOfPeople; 
            scanBot.close();
            System.out.format("You each owe " + eachBill + " dollars", eachBill);
    }
}
