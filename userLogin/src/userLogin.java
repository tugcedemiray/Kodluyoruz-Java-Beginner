import  java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
        String userName,userPassword,changePassword,newPassword;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your user name : ");
        userName = input.nextLine();
        System.out.print("Enter your password : ");
        userPassword = input.nextLine();

        if (userName.equals("patika") && userPassword.equals("java123")) {
            System.out.println("Congratulations! You have successfully logged in.");
        } else if (!userPassword.equals("java123")) {
            System.out.print("Do you want to change your password ? If yes press Y otherwise press N : ");
            changePassword = input.nextLine();
            if(changePassword.equals("Y")) {
                System.out.print("Please enter new password: ");
                newPassword = input.nextLine();
                if(newPassword.equals(userPassword) || newPassword.equals("java123")) {
                    System.out.println("Your password could not been created,please enter new password!");
                } else {
                    System.out.println("Your password has been created!");
                }
            } else {
                System.out.println("You will redirect login page");
            }
        } else {
            System.out.println("Username or password is not correct");
        }
    }
}
