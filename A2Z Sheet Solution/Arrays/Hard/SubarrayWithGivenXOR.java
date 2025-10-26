import java.util.*;

class SubarrayWithGivenXOR {
    public int subarraysWithXorK(int[] nums, int k) {

        Map<Integer, Integer> preXOR = new HashMap<>();

        int xr = 0;
        int xor = 0;

        preXOR.put(0,1);

        int cnt = 0;

        for(int i = 0; i<nums.length; i++){
            xor^=nums[i];

            xr = xor^k;


            cnt+=preXOR.getOrDefault(xr, 0);

            preXOR.put(xor, preXOR.getOrDefault(xor, 0)+1);
        }

        return cnt;

    }
}