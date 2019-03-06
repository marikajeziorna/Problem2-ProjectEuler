public class FibonacciCalculator {

        public static int calculate(int firstNumber, int secondNumber) {


            int sum = 0;
            int sumNumbers = firstNumber + secondNumber;
            while (secondNumber < 4000) {
                if (secondNumber % 2 == 0) {
                    sum += secondNumber;
                }

                firstNumber = secondNumber;
                secondNumber = sumNumbers;
                sumNumbers = firstNumber + secondNumber;
            }
            System.out.println(sum);
            return sum;
        }
}
