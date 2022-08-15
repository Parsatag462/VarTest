import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        if (age >= 21) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

        System.out.println("Do you have a driver's license? (y or n)");
        String dl = sc.next();

        if (age >= 21 && dl.equalsIgnoreCase("y")) {
            System.out.println("You can hire a car");
        } else {
            System.out.println("You cannot hire a car");
        }
    }
}
