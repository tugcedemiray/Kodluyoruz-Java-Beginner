public class MinMaxValue {
    public static void main(String[] args) {
        int[] list = {56,34,1,8,101,-2,-33};
        int min = list[0];
        int max = list[0];

        for (int i: list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Minimum value of the given array : " + min);
        System.out.println("Maximum value of the given array : " + max);
    }
}
