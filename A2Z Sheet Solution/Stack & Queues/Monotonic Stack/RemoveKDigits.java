import java.util.*;

public class RemoveKDigits {
    public String removeKdigits(String nums, int k) {

        // Edge case
        if (k == 0) {

            int i = 0;

            while (i < nums.length() && nums.charAt(i) == '0'){
                i++;
            }
            return i == nums.length() ? "0" : nums.substring(i);
        }


        Stack<Character> st = new Stack<>();


        // Remove digits and form number
        for (int i = 0; i < nums.length(); i++) {

            char digit = nums.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
                st.pop();
                k--;
            }

            st.push(digit);
        }


        /*
            Edge Case - 2:

            Say input is 123456 and k == 3,
            then no digits are removed, if above logic is applied.
            In such a case remove last last three digits 4, 5, 6
        */
        while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }

        if (st.isEmpty()) return "0";

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        // Remove last 0 (i.e, leading 0 in reversed string)
        while (res.length() > 0 && res.charAt(res.length() - 1) == '0') {
            res.deleteCharAt(res.length() - 1);
        }

        res.reverse();

        return res.length() == 0 ? "0" : res.toString();
    }
}
