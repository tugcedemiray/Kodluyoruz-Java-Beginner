public class PrimeNumber {
    public static void main(String[] args) {
        int counter;
        String primeNumbers = "";
        for (int i = 2; i <= 100 ; i++) {
            counter = 0;
            for (int j = 2; j < i ; j++) {
                if(i % j == 0) {
                    counter++;
                    break;
                }
            }
            if (counter == 0) {
                primeNumbers += i + " ";
            }
        }
        System.out.println("Prime numbers : " + primeNumbers);
    }
}
