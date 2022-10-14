import java.util.Arrays;
import java.util.Scanner;

public class NearestMinMaxValue {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Given array : " + Arrays.toString(list));
        int minValue = list[0];
        int maxValue = list[0];

        for (int i: list) {
            if (i < minValue) {
                minValue = i;
            }
            if (i > maxValue) {
                maxValue = i;
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = input.nextInt();

        for (int j: list) {
            if (j < number && j > minValue) {
                minValue = j;
            }
            if (j > number && j < maxValue) {
                maxValue = j;
            }
        }
        Arrays.sort(list);
        System.out.println("Sorted array : " + Arrays.toString(list));
        System.out.println("The nearest number smaller than the entered number among the array elements : " + minValue);
        System.out.println("The nearest number greater than the entered number among the array elements : " + maxValue);
    }
}
