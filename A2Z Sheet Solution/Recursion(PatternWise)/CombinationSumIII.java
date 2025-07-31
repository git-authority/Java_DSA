import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        //your code goes here
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        // k is the no. of parameters
        // n is the sum
        findSum(1, k, n, current, result);

        return result;
    }

    public void findSum(int nos, int k, int n, List<Integer> current, List<List<Integer>> result){

            if(n==0 && k==0){
                result.add(new ArrayList<>(current));
                return;
            }

            // Number list has crossed 1 and no more numbers can be added
            if(n<0 || k<0 || nos>9){
                return;
            }

            // Take
            current.add(nos);
            findSum(nos+1, k-1, n-nos, current, result);

            current.remove(current.size()-1);

            // Don't Take
            findSum(nos+1, k, n, current, result);
    }
}
