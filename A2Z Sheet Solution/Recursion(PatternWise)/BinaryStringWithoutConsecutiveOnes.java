import java.util.ArrayList;
import java.util.List;

public class BinaryStringWithoutConsecutiveOnes {
    public List<String> generateBinaryStrings(int n) {
        // Your code goes here
        List<String> ans = new ArrayList<>();

        generate(0, n, "", ans, false);
        return ans;
    }

    public void generate(int i, int n, String result, List<String> ans, boolean prevOne){
        if(result.length()==n){
            ans.add(result);
            return;
        }


        generate(i+1, n, result+"0", ans, false);

        if(!prevOne){
            generate(i+1, n, result+"1", ans, true);
        }
    }
}
