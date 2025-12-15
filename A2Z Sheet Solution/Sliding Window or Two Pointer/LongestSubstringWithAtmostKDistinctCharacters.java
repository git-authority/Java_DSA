import java.util.*;

public class LongestSubstringWithAtmostKDistinctCharacters {
    public int kDistinctChar(String s, int k) {

        Map<Character, Integer> mpp = new HashMap<>();

        int l = 0, r = 0, maxLen = 0;

        int n = s.length();

        while(r<n){

            char ch = s.charAt(r);

            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);

            if(mpp.size()>k){
                while(mpp.size()>k){
                    mpp.put(s.charAt(l), mpp.get(s.charAt(l)) - 1);

                    if(mpp.get(s.charAt(l)) == 0){
                        mpp.remove(s.charAt(l));
                    }

                    l++;
                }
            }

            maxLen = Math.max(maxLen, r-l+1);

            r++;
        }
        return maxLen;
    }
}