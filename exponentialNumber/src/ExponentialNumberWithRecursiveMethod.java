import java.util.Scanner;

public class ExponentialNumberWithRecursiveMethod {
    static int exponential(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * exponential(a,b-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base,power;

        System.out.print("Enter the base number : ");
        base = input.nextInt();
        System.out.print("Enter the exponent number : ");
        power = input.nextInt();
        System.out.println("Result : " + exponential(base,power));
    }
}
