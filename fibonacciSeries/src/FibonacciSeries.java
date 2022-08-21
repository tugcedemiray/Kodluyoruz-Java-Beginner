import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number, firstValue, secondValue, thirdValue;
        //0 1 1 2 3 5
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements of the Fibonacci series : ");
        number = input.nextInt();
        firstValue = 0;
        secondValue = 1;
        System.out.print(firstValue + " " + secondValue + " ");
        for (int i = 0; i <= (number-2)  ; i++) {
            thirdValue = firstValue + secondValue;
            System.out.print(thirdValue + " ");
            //System.out.println(firstValue + " + " + secondValue + " = " + thirdValue);
            firstValue = secondValue;
            secondValue = thirdValue;
        }
    }
}
