public class FibonacciCalculator {

    public static int calculate(int firstNumber, int secondNumber) {

        int sum = 0;

        do {
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;

            if (secondNumber % 2 == 0)
                sum += secondNumber;
        }
        while (secondNumber < 4000000);
        System.out.println("Sum of the even-valued terms: " + sum);
        return sum;
    }
}
