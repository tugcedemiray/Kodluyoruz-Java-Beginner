import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        double sum = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N number for harmonic series : ");
        number = input.nextInt();
        for (int i = 1; i <= number ; i++) {
            sum += (double)1 / i;
        }
        System.out.println("Result is : " + sum);
    }
}
