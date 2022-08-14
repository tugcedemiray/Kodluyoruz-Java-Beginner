import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a boundary number : ");
        number = input.nextInt();
        System.out.println("Power of 4 up to the " + number + " : ");
        for (int i = 1; i <= number ; i *= 4) {
            System.out.print(i + " ");
        }
        System.out.println("\nPower of 5 up to the " + number + " : ");
        for (int i = 1; i <= number ; i *= 5) {
            System.out.print(i + " ");
        }
    }
}
