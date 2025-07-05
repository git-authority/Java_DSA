import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i =0,j=0;

        int n1 = nums1.length, n2 = nums2.length;

        List<Integer> result = new ArrayList<>();

        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }

            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        i=0;
        int[] finalResult = new int[result.size()];
        for(int nums:result){
            finalResult[i++] = nums;
        }

        return finalResult;
    }
}
