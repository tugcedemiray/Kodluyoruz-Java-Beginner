import java.util.Scanner;

public class PrimeNumberWithRecursiveMethod {
    static int counter = 0;
    static void isPrimeNumber(int a, int b) {
        if (a == 1) {
            counter = 0;
        }
        else if (a == 2 || a % b != 0) {
            counter++;
        }
        if (a==b || a!=2) {
            if (counter > 0) {
                System.out.println(a + " is a prime number");
            } else {
                System.out.println(a + " is not a prime number");
            }
            return;
        }
        isPrimeNumber(a,b+1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number : ");
        number = input.nextInt();
        isPrimeNumber(number,2);
    }
}
