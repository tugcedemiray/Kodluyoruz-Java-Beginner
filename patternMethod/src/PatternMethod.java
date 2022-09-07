import java.util.Scanner;

public class PatternMethod {

    static void pattern(int a) {

        if (a > 0) {
            System.out.print(a + " ");
            pattern(a-5);
            //System.out.print("a values " + a + "==> ");
        }
        System.out.print(a + " ");
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N number : ");
        number = input.nextInt();
        System.out.print("Result : ");
        pattern(number);
    }
}
