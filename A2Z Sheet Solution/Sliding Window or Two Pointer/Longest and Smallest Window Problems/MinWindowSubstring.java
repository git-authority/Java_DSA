public class MinWindowSubstring {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()){
            return "";
        }

        int[] required = new int[128];
        int[] window   = new int[128];

        // t may have duplicates
        for (char c : t.toCharArray()) {
            required[c]++;
        }

        int requiredCount = t.length();

        // Tracks how many characters from t (including duplicates) are currently satisfied in the window
        int formed = 0;

        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int start = -1;

        while (r < s.length()) {

            char c = s.charAt(r);
            window[c]++;


            if (required[c] > 0 && window[c] <= required[c]) {      // t may have duplicates
                formed++;
            }


            // If we have found the target string in the current window
            while (formed == requiredCount) {

                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                char leftChar = s.charAt(l);
                window[leftChar]--;

                if (required[leftChar] > 0 && window[leftChar] < required[leftChar]) {
                    formed--;
                }

                l++;
            }

            r++;
        }

        return start == -1 ? "" : s.substring(start, start + minLen);
    }
}
