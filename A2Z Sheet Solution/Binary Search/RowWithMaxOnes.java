public class RowWithMaxOnes{
  public int rowWithMax1s(int[][] mat) {

    int rowNumber = -1, flag = -1;
    int count = 0;

    for (int[] row:mat) {

      int countOnes = row.length;
      rowNumber++;
      int low = 0, high = row.length - 1;

      while (low <= high) {
        int mid = low + ((high - low) >> 1);

        if (row[mid] == 1) {
          countOnes = mid;
          high = mid - 1;
        }else {
          low = mid + 1;
        }

      }

      if ((row.length-countOnes) > count) {
        flag = rowNumber;
        count = row.length-countOnes;
      }

    }
    return flag;
  }
}