import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number, digitNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();
        int tempNumber = number, digitValue, sum = 0, digitPower;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digitNumber++;
        }
        System.out.println("Number of digits : " + digitNumber);
        tempNumber = number;
        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            //System.out.println("Value of digits : " + digitValue);
            digitPower = 1;
            for (int i = 1; i <= digitNumber; i++) {
                digitPower *= digitValue;
            }
            sum += digitPower;
            tempNumber /= 10;
        }
        System.out.println("Sum of the exponents of the digit values according to the number of digits : " + sum);
        if (sum == number) {
            System.out.println(number + " " + "is an Armstrong number");
        } else {
            System.out.println(number + " " + "is not an Armstrong number");
        }
    }
}
