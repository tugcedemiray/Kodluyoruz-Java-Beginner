import java.util.Scanner;

public class MarketCashDesk {
    public static void main(String[] args) {
        double pearPrice = 2.14, pearKg,
                applePrice = 3.67, appleKg,
                tomatoPrice = 1.11, tomatoKg,
                bananaPrice = 0.95, bananaKg,
                eggplantPrice = 5.00, eggplantKg,
                totalPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilograms of pear ? : ");
        pearKg = input.nextDouble();
        System.out.print("Kilograms of apple ? : ");
        appleKg = input.nextDouble();
        System.out.print("Kilograms of tomato ? : ");
        tomatoKg = input.nextDouble();
        System.out.print("Kilograms of banana ? : ");
        bananaKg = input.nextDouble();
        System.out.print("Kilograms of eggplant ? : ");
        eggplantKg = input.nextDouble();
        totalPrice = pearPrice*pearKg + applePrice*appleKg + tomatoPrice*tomatoKg + bananaPrice*bananaKg + eggplantPrice*eggplantKg;
        System.out.println("Total Price: " + totalPrice + " " + "TL");
    }
}
