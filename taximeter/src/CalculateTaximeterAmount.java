import java.util.Scanner;

public class CalculateTaximeterAmount {
    public static void main(String[] args){
        double kilometer, amountPerKilometer=2.20,totalAmount;
        int openingFee = 10;
        System.out.print("Enter the kilometer of travel : ");
        Scanner input = new Scanner(System.in);
        kilometer = input.nextDouble();
        totalAmount = openingFee + kilometer*amountPerKilometer;
        totalAmount = totalAmount < 20 ? 20 : totalAmount;
        System.out.println("Total travel fee is : " + totalAmount);

    }
}
