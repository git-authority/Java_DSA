import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        String[] map = new String[]{
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        helper(digits, ans, 0, "", map);

        return ans;
    }


    private void helper(String digits, List<String> ans, int index, String current, String[] map) {

        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        String s = map[digits.charAt(index) - '0'];

        for (int i = 0; i < s.length(); i++) {
            helper(digits, ans, index + 1, current + s.charAt(i), map);
        }

    }
}
