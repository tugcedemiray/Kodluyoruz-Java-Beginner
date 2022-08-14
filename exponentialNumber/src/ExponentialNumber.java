import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        int base, power, exponentialNumber = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Exponential number calculation ");
        System.out.print("Enter the base number : ");
        base = input.nextInt();
        System.out.print("Enter the exponent number : ");
        power = input.nextInt();

        // 3 ^ 4 = 3 * 3 * 3 * 3
        int i = 1;
        while (i <= power) {
            exponentialNumber *= base;
            i++;
        }
        System.out.println(base + " over " + power + " = " + exponentialNumber);
    }
}
