
public class CheckPalindrome {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        if (s.length() < 2) {
            return true;
        }

        return palindromeCheck(s, 0, s.length() - 1);
    }

    private boolean palindromeCheck(String s, int left, int right) {

        if (left > right) {
            return true;
        }

        if (!Character.isLetterOrDigit(s.charAt(left))) {
            return palindromeCheck(s, left + 1, right);
        }

        if (!Character.isLetterOrDigit(s.charAt(right))) {
            return palindromeCheck(s, left, right - 1);
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return palindromeCheck(s, left + 1, right - 1);

    }
}
