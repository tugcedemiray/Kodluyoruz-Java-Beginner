import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n, nFactorial = 1, r, rFactorial = 1, subtraction, sFactorial = 1, formula;
        Scanner input = new Scanner(System.in);
        System.out.println("r combination of N");
        System.out.print("Enter N number : ");
        n = input.nextInt();
        for (int i = 1; i <= n ; i++) {
            nFactorial *= i;
        }
        System.out.print("Enter r number : ");
        r = input.nextInt();
        for (int i = 1; i <= r ; i++) {
            rFactorial *= i;
        }
        subtraction = n - r;
        for (int i = 1; i <= subtraction ; i++) {
            sFactorial *= i;
        }
        formula = nFactorial / (rFactorial * sFactorial);
        System.out.println("C(" + n + "," + r + ") = " + formula);
    }
}
