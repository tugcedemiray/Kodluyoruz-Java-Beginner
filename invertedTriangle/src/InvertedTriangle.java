import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int height;
        Scanner input = new Scanner(System.in);
        System.out.print("Number of digits : ");
        height = input.nextInt();
        for (int i = height; i >= 1 ; i--) {
            for (int j = (height - i); j >= 1 ; j--) {
                System.out.print(" ");
            }
            for (int j = (2 * i - 1); j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
