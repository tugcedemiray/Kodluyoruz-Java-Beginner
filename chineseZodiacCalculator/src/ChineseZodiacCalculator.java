import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        int birthDate, mod;
        String zodiac = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the date of birth : ");
        birthDate = input.nextInt();
        mod = birthDate % 12;

        switch (mod) {
            case 0 -> zodiac = "Monkey";
            case 1 -> zodiac = "Rooster";
            case 2 -> zodiac = "Dog";
            case 3 -> zodiac = "Pig";
            case 4 -> zodiac = "Mouse";
            case 5 -> zodiac = "Ox";
            case 6 -> zodiac = "Tiger";
            case 7 -> zodiac = "Rabbit";
            case 8 -> zodiac = "Dragon";
            case 9 -> zodiac = "Snake";
            case 10 -> zodiac = "Horse";
            case 11 -> zodiac = "Sheep";
            default -> System.out.println("You entered an invalid year!");
        }
        System.out.println("Your zodiac sign is : " + zodiac);
    }
}
