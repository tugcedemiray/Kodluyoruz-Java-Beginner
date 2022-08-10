import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature : ");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("You can go skiing");
        } else if (temperature <= 25) {
            if (temperature < 10) {
                System.out.println("You can go the cinema");
            }
            else if (temperature <= 15) {
                System.out.println("You can go the cinema or picnic");
            }
            else {
                System.out.println("You can go the picnic");
            }
        } else {
            System.out.println("You can go swimming");
        }
    }
}
