import java.util.Scanner;

public class AdvancedCalculator {
    static int sum(int a, int b) {
       int result = a + b;
       System.out.println("Addition : " + result);
       return result;
    }
    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction : " + result);
        return result;
    }
    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication : " + result);
        return result;
    }
    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("Second number should be different from 0");
            return 0;
        }
        int result = a / b;
        System.out.println("Division : " + result);
        return result;
    }
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <=b ; i++) {
            result *= a;
        }
        System.out.println(a + " over " + b + " : " + result);
        return result;
    }
    static int mod(int a, int b) {
        int result = a % b;
        return result;
    }
    static void rectangle(int a, int b) {
        System.out.println("Perimeter : " + (2 * (a + b)));
        System.out.println("Area : " + (a *b));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection, number1, number2;
        String menu = "1- Addition\n" +
                "2- Subtraction\n" +
                "3- Multiplication\n" +
                "4- Division\n" +
                "5- Exponential Number\n" +
                "6- Mod\n" +
                "7- Calculation of area and perimeter of rectangle\n" +
                "0- Exit";
        System.out.println(menu);
        while (true) {
            System.out.print("Enter an operation : ");
            selection = input.nextInt();
            if (selection == 0) {
                break;
            }
            System.out.print("Enter the first number : ");
            number1 = input.nextInt();
            System.out.print("Enter the second number : ");
            number2 = input.nextInt();
            switch (selection) {
                case 1:
                    sum(number1,number2);
                    break;
                case 2:
                    minus(number1,number2);
                    break;
                case 3:
                    times(number1,number2);
                    break;
                case 4:
                    divided(number1,number2);
                    break;
                case 5:
                    power(number1,number2);
                    break;
                case 6:
                    System.out.println("Mod : " + mod(number1,number2));
                    break;
                case 7:
                    rectangle(number1,number2);
                    break;
                default:
                    System.out.println("You have entered an invalid operation");
            }
        }
        System.out.println("Good bye!");
    }
}
