import java.util.Scanner;

public class InputVariables {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter next int value: ");
        int Int = sn.nextInt();

        System.out.println("Enter next double value: ");
        double Doub = sn.nextDouble();

        System.out.println("Enter next char(but it's a string) vaule: ");
        String Car = sn.next();

        System.out.println("Int value: " + Int+ "\nDouble value: " + Doub + "\nChar(although it's really a string) value: "+ Car);
        sn.close();
    }
}
