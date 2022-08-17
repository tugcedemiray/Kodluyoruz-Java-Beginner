public class ThreeDigitArmstrongNumber {
    public static void main(String[] args) {
        int  tempNumber, startValue = 100, endValue = 999, digitNumber = 3, sum;
        int digitValue,digitPower;
        System.out.println ("Armstrong number between " + startValue + " and " + endValue);
        for (int i = startValue; i <= endValue ; i++) {
            tempNumber = i;
            sum = 0;
            while (tempNumber != 0) {
                digitValue = tempNumber % 10;
                digitPower = 1;
                for (int j = 1; j <= digitNumber ; j++) {
                    digitPower *= digitValue;
                }
                sum += digitPower;
                tempNumber /= 10;
            }
            if(i == sum) {
                System.out.print (i + " ");
            }
        }
    }
}
