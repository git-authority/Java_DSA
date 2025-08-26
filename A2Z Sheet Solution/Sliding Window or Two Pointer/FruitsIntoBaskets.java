import java.util.*;
public class FruitsIntoBaskets {

    public int totalFruits(int[] fruits) {

        int n = fruits.length;

        int maxLen = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        int l = 0, r = 0;

        while (r < n) {

            mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0) + 1);


            if (mpp.size() > 2) {

                while (mpp.size() > 2) {

                    mpp.put(fruits[l], mpp.get(fruits[l]) - 1);

                    if (mpp.get(fruits[l]) == 0) {
                        mpp.remove(fruits[l]);
                    }

                    l++;
                }

            }

            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }

        return maxLen;
    }
};