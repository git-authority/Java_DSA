
public class ValidParenthesisChecker {
    public boolean checkValidString(String s) {

        // minOpen -> Min no. of open paranthesis
        // maxOpen -> Max no. of open paranthesis

        /*
            As '*' is treated as both '(' and ')'
            so encountering '*' will lead to
            decrementing minOpen and incrementing maxOpen
        */

        int minOpen = 0, maxOpen = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                minOpen++;
                maxOpen++;
            }
            else if (c == ')') {
                minOpen--;
                maxOpen--;
            }
            else if (c == '*') {
                minOpen--;
                maxOpen++;
            }

            if (maxOpen < 0){
                return false;
            }

            // Ensure that minOpen never goes below zero
            if (minOpen < 0){
                minOpen = 0;
            }

        }

        return minOpen == 0;
    }
}