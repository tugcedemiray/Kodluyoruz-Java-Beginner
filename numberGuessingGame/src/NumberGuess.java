import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrongGuess = false;
        System.out.println("number : "+number);
        while (right < 5) {
            System.out.print("Please enter your guess : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter the number between 0-100");
                if (isWrongGuess) {
                    right++;
                    System.out.println("You have made too much wrong guess, remaining guess is : " + (5-right));
                } else {
                    isWrongGuess = true;
                    System.out.println("If you make one more wrong guess outside of the range, you will lose a right");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Congrats! Your prediction is true. The number is : " + selected);
                isWin = true;
                break;
            } else {
                System.out.println("Your prediction is wrong !");
                if (selected > number) {
                    System.out.println(selected + " is greater than secret number.");
                } else {
                    System.out.println(selected + " is less than secret number.");
                }
                wrong[right] = selected;
                right++;
                System.out.println("Remaining guess right is " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("You lost !");
            if (!isWrongGuess) {
                System.out.println("Your guess : " + Arrays.toString(wrong));
            }
        }
    }
}
