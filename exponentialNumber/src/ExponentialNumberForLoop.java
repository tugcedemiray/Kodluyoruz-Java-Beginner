import java.util.Scanner;

public class ExponentialNumberForLoop {
    public static void main(String[] args) {
        int base, power, exponentialNumber = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Exponential number calculation ");
        System.out.print("Enter the base number : ");
        base = input.nextInt();
        System.out.print("Enter the exponent number : ");
        power = input.nextInt();

        for (int i = 1; i <= power ; i++) {
            exponentialNumber *= base;
        }
        System.out.println(base + " over " + power + " = " + exponentialNumber);
    }
}
