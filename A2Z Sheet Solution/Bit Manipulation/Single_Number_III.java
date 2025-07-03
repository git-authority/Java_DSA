
public class Single_Number_III {

    public int[] singleNumber(int[] nums) {
        // your code goes here

        // The rightmost set bit in a ^ b identifies a bit where a and b differ.
        // So, grouping by this bit ensures a and b are separated,
        // and all pairs cancel within their groups.
        int xor = 0;
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }

        // Unset the rightmost set bit
        int unset = xor & (xor - 1);

        // Only keep the rightmost set bit of earlier xor and rest all to zero
        int rightmostSetBit = unset ^ xor;

        for (int i = 0; i < nums.length; i++) {
            if ((rightmostSetBit & nums[i]) != 0) {
                xor1 ^= nums[i];
            } else {
                xor2 ^= nums[i];
            }
        }

        return new int[]{Math.min(xor1, xor2), Math.max(xor1, xor2)};
    }
}
