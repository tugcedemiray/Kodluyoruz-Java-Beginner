import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number,factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Factorial number : ");
        number = input.nextInt();

        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }
        System.out.println(number + "!" + " = " + factorial);
    }
}
