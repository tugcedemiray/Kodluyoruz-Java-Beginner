import java.util.Scanner;

public class DigitValuesSum {
    public static void main(String[] args) {
        int number, sum = 0, digitValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        while(number != 0) {
            digitValue = number % 10;
            sum += digitValue;
            number /= 10;
        }
        System.out.println("Sum of digit values of the entered number : " + sum);
    }
}
