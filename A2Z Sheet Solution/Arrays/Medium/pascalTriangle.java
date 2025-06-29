
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> finalAns = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {
            finalAns.add(result(row));
        }

        return finalAns;
    }

    private List<Integer> result(int row) {

        List<Integer> ans = new ArrayList<>();

        ans.add(1);

        int res = 1;

        for (int col = 1; col < row; col++) {
            res *= (row - col);
            res /= (col);
            ans.add(res);
        }

        return ans;
    }
}
