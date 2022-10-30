public class ArrayElementFrequency {
    static boolean isExist(int[] array, int value) {
        for (int arrayElement:array) {
            if (arrayElement == value) {
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicateArray = new int[arr.length];
        int indexValue = 0;
        for (int i = 0; i < arr.length; i++) {
            int iteration = 1;
            if (!isExist(duplicateArray,arr[i])) {
                for (int j = i+1; j < arr.length; j++) {
                    if ((i != j) && (arr[i] == arr[j])) {
                        iteration++;
                        duplicateArray[indexValue++] = arr[i];
                    }
                }
                System.out.println("Number " + arr[i] + " repeated " + iteration + " times");
            }
        }
    }
}
