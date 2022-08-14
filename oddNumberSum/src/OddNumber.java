import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        int number, sum = 0, sum2 = 0;
        boolean isPositive = true;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number : ");
            number = input.nextInt();
            if (number % 2 == 1) {
                sum += number;
            }
        } while (number > 0);
        System.out.print("Do while example -> ");
        System.out.println("Sum of odd numbers is " + sum);

        while (isPositive) {
            System.out.print("Enter a number : ");
            number = input.nextInt();
            if (number < 0) {
                isPositive = false;
            } else {
                if (number % 2 != 0) {
                    sum2 += number;
                }
            }
        }
        System.out.print("While example -> ");
        System.out.println("Sum of odd numbers is " + sum2);
    }
}
