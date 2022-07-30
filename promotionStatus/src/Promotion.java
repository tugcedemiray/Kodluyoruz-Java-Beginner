import java.util.Scanner;

public class Promotion {
    public static void main(String[] args) {
        int mathematics,physics,turkish,chemistry,music;
        int lessonCount=0,totalGrade=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Your mathematics grade : ");
        mathematics = input.nextInt();
        if (mathematics > 0 && mathematics < 100) {
            totalGrade += mathematics;
            lessonCount += 1;
        }
        System.out.print("Your physics grade : ");
        physics = input.nextInt();
        if (physics > 0 && physics < 100) {
            totalGrade += physics;
            lessonCount += 1;
        }
        System.out.print("Your turkish grade : ");
        turkish = input.nextInt();
        if (turkish > 0 && turkish < 100) {
            totalGrade += turkish;
            lessonCount += 1;
        }
        System.out.print("Your chemistry grade : ");
        chemistry = input.nextInt();
        if (chemistry > 0 && chemistry < 100) {
            totalGrade += chemistry;
            lessonCount += 1;
        }
        System.out.print("Your music grade : ");
        music = input.nextInt();
        if (music > 0 && music < 100) {
            totalGrade += music;
            lessonCount += 1;
        }

        double average = (float)totalGrade / lessonCount;
        if (average <= 55) {
            System.out.println("Unfortunately! You failed the class :(");
        } else {
            System.out.println("Congrats! You passed the class :)");
        }
        System.out.println("Your average grade is : " + average);
    }
}
