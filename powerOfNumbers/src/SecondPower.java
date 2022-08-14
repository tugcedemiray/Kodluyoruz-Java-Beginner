import java.util.Scanner;

public class SecondPower {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a boundary number : ");
        number = input.nextInt();
        System.out.println("Power of 2 up to the " + number + " : ");
        for (int i = 1; i <= number ; i *= 2 ) {
            System.out.print(i + " ");
        }
    }
}
