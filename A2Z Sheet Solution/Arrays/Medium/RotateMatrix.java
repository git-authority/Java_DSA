class RotateMatrix {
    public void rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Perform Transpose
        for(int i = 0;i<rows;i++){
            for(int j = i+1;j<cols;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Swap Columns
        int left = 0;
        int right = cols-1;
        while(left<=right){
            for(int i = 0;i<rows;i++){
                int temp = matrix[i][right];
                matrix[i][right] = matrix[i][left];
                matrix[i][left] = temp;
            }
            left++;
            right--;
        }


    }
}