import java.util.*;
class ValidParenthesis {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        generate(0, 0, n, "", result);
        return result;
    }

    private void generate(int open, int close, int n, String current, List<String> result) {

        //   open   - The number of open parentheses used so far.
        //   close  - The number of close parentheses used so far.
        //     n    - The total number of pairs of parentheses.
        //  current - The current string being built.
        //  result  - The list storing all valid combinations.


        if (open == close && open + close == 2 * n) {
            result.add(current);
            return;
        }


        if (open < n) {
            generate(open + 1, close, n, current + '(', result);
        }


        if (close < open) {
            generate(open, close + 1, n, current + ')', result);
        }
    }
};
