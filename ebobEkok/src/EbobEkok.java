import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int number1, number2, smallestNumber, ebob = 1, ekok = 1, biggestNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        number1 = input.nextInt();
        System.out.print("Enter n2 : ");
        number2 = input.nextInt();
        smallestNumber = Math.min(number1, number2);
        biggestNumber = Math.max(number1,number2);

        // First method
        for (int i = 1; i <= smallestNumber ; i++) {
            if (number1 % i == 0 && number2 % i == 0 ) {
                ebob = i;
            }
        }
        System.out.println("Ebob of " + number1 + " and " + number2 + " is ");
        System.out.println("First method ebob value is : " + ebob);

        //Second method
        for (int j = smallestNumber; j >= 1 ; j--) {
            if (number1 % j == 0 && number2 % j == 0) {
                ebob = j;
                break;
            }
        }
        System.out.println("Second method ebob value is : " + ebob);

        for (int i = biggestNumber; i <= (number1 * number2) ; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                ekok = i;
                break;
            }
        }
        System.out.println("Ekok of " + number1 + " and " + number2 + " is : " + ekok);
        System.out.println("Verification of formula ==> ebob * ekok = number1 * number2");
        int newEkok = (number1 * number2) / ebob;
        System.out.println("Calculation of ekok with formula : " + newEkok);
    }
}
