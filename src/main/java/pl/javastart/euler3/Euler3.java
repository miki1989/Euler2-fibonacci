package pl.javastart.euler3;

public class Euler3 {
    // Returns sum of even Fibonacci numbers which are
    // less than or equal to given limit.
    static int evenFibSum(int limit)
    {

        // Initialize first two even prime numbers
        // and their sum
        long number1 = 0, number2 = 2;
        long sum = number1 + number2;

        // calculating sum of even Fibonacci value
        while (number2 <= limit)
        {
            // get next even value of Fibonacci sequence
            long number3 = 4 * number2 + number1;

            // If we go beyond limit, we break loop
            if (number3 > limit)
                break;

            // Move to next even number and update sum
            number1 = number2;
            number2 = number3;
            sum += number2;
        }

        return(int) sum;
    }

    // Driver code
    public static void main (String[] args)
    {
        int limit = 4000000;
        System.out.println(evenFibSum(limit));

    }
}