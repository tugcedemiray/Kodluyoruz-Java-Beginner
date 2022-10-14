public class HarmonicAverageOfArrayElements {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        double sum = 0.0;
        for (int elements: list) {
            sum += 1f/elements;
        }
        double harmonicAverage = list.length/sum;
        System.out.println(harmonicAverage);
    }
}
