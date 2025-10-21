import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for(int i =0;i<n;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
            if(freq.get(nums[i])>n/3 && !result.contains(nums[i])){
                result.add(nums[i]);
            }
        }

        return result;

    }
}
