import java.util.Scanner;

public class EbobEkokWhileLoop {
    public static void main(String[] args) {
        int number1, number2,smallestNumber,biggestNumber,ebobCounter,ebob = 1;
        int ekok = 1, ekokCounter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        number1 = input.nextInt();
        System.out.print("Enter n2 : ");
        number2 = input.nextInt();
        smallestNumber = number1 < number2 ?  number1 : number2;
        biggestNumber = number1 > number2 ? number1 : number2;

        // First method
        ebobCounter = 1;
        while (ebobCounter <= smallestNumber) {
            if(number1 % ebobCounter == 0 && number2 % ebobCounter == 0) {
                ebob = ebobCounter;
            }
            ebobCounter++;
        }
        System.out.println("Ebob of " + number1 + " and " + number2 + " is ");
        System.out.println("First method ebob value is : " + ebob);

        //Second method
        ebobCounter = smallestNumber;
        while (ebobCounter >= 1) {
            if (number1 % ebobCounter == 0 && number2 % ebobCounter == 0) {
                ebob = ebobCounter;
                break;
            }
            ebobCounter--;
        }
        System.out.println("Second method ebob value is : " + ebob);

        ekokCounter = biggestNumber;
        while (ekokCounter <= (number1 * number2)) {
            if (ekokCounter % number1 == 0 && ekokCounter % number2 == 0) {
                ekok = ekokCounter;
                break;
            }
            ekokCounter++;
        }
        System.out.println("Ekok of " + number1 + " and " + number2 + " is : " + ekok);
        System.out.println("Verification of formula ==> ebob * ekok = number1 * number2");
        int newEkok = (number1 * number2) / ebob;
        System.out.println("Calculation of ekok with formula : " + newEkok);
    }
}
