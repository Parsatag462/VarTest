import java.util.Scanner;

public class ValueChecker {
    public static void main(String[] args) {
        Scanner lk = new Scanner(System.in);
        int i=0;
        do {
            System.out.println("Enter a number: ");
            int num = lk.nextInt();

            if (num == 7) {
                System.out.println("That's lucky!");
            } else if (num == 13) {
                System.out.println("That's unlucky!");
            } else if (num == 0) {
                i = 1;
            } else {
                System.out.println("That number is neither lucky nor unlucky");
            }
        } while (i != 1);
    }
}
