import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;


        // top and bottom is for traversing rows
        // left and right is for traversing columns
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        int i = 0;

        while(top<=bottom && left<=right){

            for(i = left; i<= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            for(i=top;i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;


            if(top<=bottom){
                for(i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(i=bottom; i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }

        }

        return ans;
    }
}