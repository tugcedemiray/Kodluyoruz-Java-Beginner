import java.util.Scanner;

public class TicketPriceCalculation {
    public static void main(String[] args) {
        int distance, age, typeOfTravel;
        double totalPrice, distancePrice,pricePerKM = 0.1;
        double ageDiscountRate = 0.0, travelTypeDiscountRate = 0.0, ageDiscountPrice, ticketDiscountPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in km : ");
        distance = input.nextInt();
        System.out.print("Enter your age : ");
        age = input.nextInt();
        System.out.print("Enter the type of travel (1 => One Way Ticket, 2 => Round-trip Ticket) : ");
        typeOfTravel = input.nextInt();

        if (distance > 0 && age > 0 && (typeOfTravel == 1 || typeOfTravel == 2)) {
            distancePrice = distance * pricePerKM;
            if (age < 12) {
                ageDiscountRate = 0.5;
            } else if (age < 25) {
                ageDiscountRate = 0.1;
            } else if (age > 65) {
                ageDiscountRate = 0.3;
            }
            if(typeOfTravel == 2) {
                travelTypeDiscountRate = 0.2;
            }
            ageDiscountPrice = distancePrice - distancePrice*ageDiscountRate;
            ticketDiscountPrice = ageDiscountPrice * travelTypeDiscountRate;
            totalPrice = (ageDiscountPrice - ticketDiscountPrice) * typeOfTravel;
            System.out.println("Total price is : " + totalPrice + " " + "TL");
        } else {
            System.out.println("You have entered incorrect data!");
        }
    }
}
