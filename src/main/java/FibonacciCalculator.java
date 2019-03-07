public class FibonacciCalculator {

        public static int calculate( int limit) {


            int sum = 0;
            int firstNumber = 1;
            int secondNumber = 2;
            int sumNumbers = firstNumber + secondNumber;
            while (secondNumber < limit) {
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
