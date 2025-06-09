import java.util.ArrayList;

public class FindUnion {
    public int[] unionArray(int[] nums1, int[] nums2) {

        // i is the pointer at nums1 and j is the pointer at nums2
        int i = 0, j = 0;

        int n1 = nums1.length, n2 = nums2.length;

        ArrayList<Integer> union = new ArrayList<>();

        while(i<n1 && j<n2){

            if(nums1[i]<=nums2[j]){

                // Add elements only if the list is empty or
                // the element to be added is not equal to the last element in the list
                if(union.isEmpty() || union.get(union.size()-1) != nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            }

            else{

                // Add elements only if the list is empty or
                // the element to be added is not equal to the last element in the list
                if(union.isEmpty() || union.get(union.size()-1) != nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }

        }

        // If nums2 is exhausted add the remaining unique elements of nums1
        while(i<n1){

            // Add elements only if the list is empty or
            // the element to be added is not equal to the last element in the list
            if(union.isEmpty() || union.get(union.size()-1) != nums1[i]){
                union.add(nums1[i]);
            }
            i++;
        }

        // If nums1 is exhausted add the remaining unique elements of nums2
        while(j<n2){

            // Add elements only if the list is empty or
            // the element to be added is not equal to the last element in the list
            if(union.isEmpty() || union.get(union.size()-1) != nums2[j]){
                union.add(nums2[j]);
            }
            j++;
        }

        int[] finalUnion =  new int[union.size()];
        i = 0;

        for(int nums: union){
            finalUnion[i++] = nums;
        }

        return finalUnion;
    }
}
