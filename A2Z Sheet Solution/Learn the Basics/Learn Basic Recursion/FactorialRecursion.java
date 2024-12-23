import java.util.ArrayList;
class FactorialRecursion {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();
        long factorial = 1; // Start with 1 (0! = 1)

        for (long i = 1; i <= n; i++) {
            factorial *= i; // Calculate the factorial
            if (factorial > n) break; // Stop if factorial is greater than n
            list.add(factorial); // Add the factorial to the list
        }

        return list;
    }
}
