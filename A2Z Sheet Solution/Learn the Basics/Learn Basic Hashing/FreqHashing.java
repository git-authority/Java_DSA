import java.util.ArrayList;
import java.util.List;
class FreqHashing {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static List<Integer> frequencyCount(int[] arr) {

        ArrayList<Integer> store = new ArrayList<>();
        int[] hash = new int[arr.length + 1];


        for (int i = 0; i < arr.length; i++) {
                hash[arr[i]]++;
        }

        for (int i = 1; i <= arr.length; i++) {
            store.add(hash[i]);
        }

        return store;
    }
}
