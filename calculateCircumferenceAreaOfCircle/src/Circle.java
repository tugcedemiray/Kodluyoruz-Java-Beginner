import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        double pi = 3.14, radius, angle,circumference, area,segmentArea;
        System.out.print("Enter the radius of circle : ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        System.out.print("Enter the angle of circle : ");
        angle = input.nextDouble();
        circumference = 2 * pi * radius;
        System.out.println("Circumference of circle is : " + circumference);
        area = pi * radius * radius;
        System.out.println("Area of the circle is : " + area);
        segmentArea = (pi * radius * radius * angle) / 360;
        System.out.println("Area of the segment is : " + segmentArea);

    }
}
