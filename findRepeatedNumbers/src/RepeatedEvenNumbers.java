import java.util.Arrays;
public class RepeatedEvenNumbers {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {6, 7, 6, 8, 2, 2, 1, 0, 8, 3, 4, 4, 10, 1, 33, 9, 2};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        int loopCount = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if ((list[i] % 2 == 0) && list[i] == list[j] ) {
                    if (!isFind(duplicate,list[i])) {
                        /*initial elements of duplicate array is 0
                        therefore this function return true
                        so 0 is not added into the array, I will review this part!*/
                        loopCount++;
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println("Integer Array: "
                + Arrays.toString(Arrays.copyOfRange(duplicate, 0, loopCount)));
    }
}
