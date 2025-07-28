public class SumOfDigits {
    // Method to compute the digital root of a number
    public int addDigits(int num) {
        // Base case: if the number is a single digit, return it
        if (num < 10) {
            return num;
        }

        // Recursive case: sum the digits and continue
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }
}
