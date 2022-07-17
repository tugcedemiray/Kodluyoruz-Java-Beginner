import java.util.Scanner;

public class CalculatorWithSwitchCase {
    public static void main(String[] args) {
        int number1, number2, choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        number1 = input.nextInt();
        System.out.print("Enter the second number : ");
        number2 = input.nextInt();
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("What is your choice ? : ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sum : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Difference : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication : " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("Division : " + (number1 / number2));
                } else {
                    System.out.println("A number cannot be divided by zero!");
                }
                break;
            default:
                System.out.println("You made a wrong decision! Please try again.");
        }
    }
}
