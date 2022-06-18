import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //define variable
        int math, physics, chemistry, turkish, history, music;

        //define Scanner class
        Scanner input = new Scanner(System.in);

        //take variable from users
        System.out.print("Mathematics Grade : ");
        math = input.nextInt();

        System.out.print("Physics Grade : ");
        physics = input.nextInt();

        System.out.print("Chemistry Grade : ");
        chemistry = input.nextInt();

        System.out.print("Turkish Grade : ");
        turkish = input.nextInt();

        System.out.print("History Grade : ");
        history = input.nextInt();

        System.out.print("Music Grade : ");
        music = input.nextInt();

        int sum = math + physics + chemistry + turkish + history + music;
        double result = sum / 6.0;
        String average = result > 60 ? "You passed the class" : "You failed the class";
        System.out.println("Your result is : " + result + "! " + average);
    }
}
