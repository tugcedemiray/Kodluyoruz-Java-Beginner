import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        year = input.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeapYear = true;
        }
        else {
            isLeapYear = false;
        }
        if(isLeapYear) {
            System.out.println(year + " " + "is leap year");
        } else {
            System.out.println(year + " " + "is not leap year");
        }
    }
}
