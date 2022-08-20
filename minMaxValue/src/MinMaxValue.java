import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        int numberCounter, number, smallestNumber = 0, biggestNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many number you want to enter : ");
        numberCounter = input.nextInt();

        for (int i = 1; i <= numberCounter ; i++) {
            System.out.print(i + ". number : ");
            number = input.nextInt();
            if (number <= smallestNumber) {
                smallestNumber = number;
            }
            if (number >= biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.println("Biggest number is " + biggestNumber);
        System.out.println("Smallest number is " + smallestNumber);
    }
}
