public class HighestElement {
    public int mostFrequentElement(int[] nums) {
        int max = nums[0];
        for(int i = 1; i<nums.length;i++){
            if(nums[i]>max)
                max = nums[i];
        }

        int[] hashTable = new int[max + 1];

        for(int num : nums){
            hashTable[num]++;
        }

        int target = hashTable[0], targetInd = 0;

        for(int i = 0;i<hashTable.length;i++){
            if(hashTable[i]>target){
                target=hashTable[i];
                targetInd = i;
            }
        }

        return targetInd;

    }
}
