import java.util.Scanner;

public class CalculateVAT {
    public static void main(String[] args) {
        double amountOfMoney, percentageOfVAT, amountOfVAT, moneyWithVAT;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money : ");
        amountOfMoney = input.nextDouble();
        percentageOfVAT = 0 < amountOfMoney && amountOfMoney <= 1000 ? 0.18 : 0.08;
        amountOfVAT = amountOfMoney * percentageOfVAT;
        moneyWithVAT = amountOfMoney + amountOfVAT;
        System.out.println("Without VAT : " + amountOfMoney);
        System.out.println("Percentage of VAT : " + percentageOfVAT);
        System.out.println("Amount of VAT : " + amountOfVAT);
        System.out.println("With VAT : " + moneyWithVAT);
    }
}
