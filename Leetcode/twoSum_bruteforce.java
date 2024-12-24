class Solution {
    public int[] twoSum_bruteforce(int[] nums, int target) {
        int i = 0, j = 0, k = 0;
        for(i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                else
                {
                    if(nums[i] + nums[j] == target)
                    {
                        k=1;
                        break;
                    }
                }
            }
            if(k==1)
            {
                break;
            }
        }
        return new int[] {i, j};
    }
}
