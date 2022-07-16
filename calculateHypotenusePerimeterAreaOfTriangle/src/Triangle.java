import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int edge1,edge2,edge3,perimeter;
        double hypotenuse,u,area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first edge of triangle : ");
        edge1 = input.nextInt();
        System.out.print("Enter the second edge of triangle : ");
        edge2 = input.nextInt();
        System.out.print("Enter the third edge of triangle : ");
        edge3 = input.nextInt();
        hypotenuse = Math.sqrt(edge1*edge1 + edge2*edge2);
        System.out.println("Hypotenuse of first and second edge of right-angled triangle is : " + hypotenuse);
        perimeter = edge1 + edge2 + edge3;
        System.out.println("Perimeter of the given triangle is : " + perimeter);
        u = (double)perimeter / 2;
        System.out.println("Half of the perimeter is : " + u);
        area = Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));
        System.out.println("Area of the given triangle is : " + area);

    }



}
