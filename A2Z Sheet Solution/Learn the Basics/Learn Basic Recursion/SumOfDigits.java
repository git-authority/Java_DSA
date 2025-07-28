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

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example number
        int num = 529;

        // Call the addDigits method and print the result
        int result = solution.addDigits(num);
        System.out.println("Sum of digits: " + result);  // Expected output: 7
    }
}
