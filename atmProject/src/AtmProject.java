import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        String userName, password;
        int right = 3, balance = 1500, selection;
        while (right > 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter username : ");
            userName = input.nextLine();
            System.out.print("Enter password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, welcome to Kodluyoruz Bank!");
                do {
                    System.out.println("""
                            1- Cash Deposit
                            2- Withdraw
                            3- Balance Inquiry
                            4- Log out""");
                    System.out.print("Please choose the operation that you want to do : ");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.print("Amount of money : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (selection == 2) {
                        System.out.print("Amount of money : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= price;
                        }
                    } else if (selection == 3) {
                        System.out.println("Balance : " + balance);
                    }
                } while (selection != 4);
                System.out.println("See you again");
                break;
            } else {
                right--;
                System.out.println("Password or username is not correct. Please try again");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank");
                } else {
                    System.out.println("Remaining right : " + right);
                }
            }
        }
    }
}
