import java.util.Scanner;

public class TriangleWithStarsWhileExample {
    public static void main(String[] args) {
        int number, height, space, stars;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        height = 1;
        while (height <= number) {
            space = 1;
            while (space <= (number - height)) {
                System.out.print(" ");
                space++;
            }
            stars = 1;
            while (stars <= (2 * height - 1)) {
                System.out.print("*");
                stars++;
            }
            height++;
            System.out.println();
        }

    }
}
