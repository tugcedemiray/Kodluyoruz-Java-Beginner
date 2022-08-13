import java.util.Scanner;

public class EvenNumberFinder {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();
        System.out.println("Even numbers : ");
        System.out.println("For loop example");
        for (int i = 0; i <= number; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nWhile loop example");
        int sayac = 0;
        while (sayac <= number) {
            if(sayac % 2 == 0) {
                System.out.print(sayac + " ");
            }
            sayac++;
        }
    }
}
