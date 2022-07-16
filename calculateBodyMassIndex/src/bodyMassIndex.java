import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args){
        double height, weight, bodyMassIndex;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height in meters : ");
        height = input.nextDouble();
        System.out.print("Please enter your weight : ");
        weight = input.nextDouble();
        bodyMassIndex = weight / (height * height);
        System.out.print("Your body mass index is : " + bodyMassIndex);
    }
}
