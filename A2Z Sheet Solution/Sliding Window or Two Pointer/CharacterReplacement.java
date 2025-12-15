public class CharacterReplacement {
    public int characterReplacement(String s, int k) {

        int maxLen = 0;

        /*
            Variable to store the count of
            the most frequent character in
            the current window
        */
        int maxFreq = 0;

        int l = 0, r = 0;

        int[] hash = new int[26];

        while (r < s.length()) {

            hash[s.charAt(r) - 'A']++;

            maxFreq = Math.max(maxFreq, hash[s.charAt(r) - 'A']);

            while ((r - l + 1) - maxFreq > k) {

                hash[s.charAt(l) - 'A']--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }

        return maxLen;
    }
}