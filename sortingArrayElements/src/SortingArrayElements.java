import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension of the array n : ");
        int dimension = input.nextInt();
        int[] arr = new int[dimension];
        int temp;

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < dimension; i++) {
            System.out.print((i+1)+". Element : ");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < dimension; i++) {
            for (int j = i+1; j < dimension; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
