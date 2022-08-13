import java.util.Scanner;
public class AverageCalculation {
    public static void main(String[] args) {
        int number, sum = 0, counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();
        System.out.print("Numbers divided by 12 are : ");
        for (int i = 0; i <= number; i++) {
            if (i % 12 == 0) {
                System.out.print(i + " ");
                sum += i;
                counter++;
            }
        }
        System.out.println("\nSum of numbers : " + sum);
        System.out.println("Counter of numbers : " + counter);
        double average = (double)sum / counter;
        System.out.println("Average of numbers : " + average);
    }
}
