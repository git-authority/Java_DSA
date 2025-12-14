public class Candy {
    public int candy(int[] ratings) {

        int n = ratings.length;

        int i = 1;

        int sum = 1;

        while (i < n) {

            if (ratings[i] == ratings[i - 1]) {

                sum = sum + 1;
                i++;
                continue;
            }

            int peak = 1;

            while (i < n && ratings[i] > ratings[i - 1]) {

                peak += 1;
                sum += peak;
                i++;
            }

            int down = 1;

            while (i < n && ratings[i] < ratings[i - 1]) {

                sum += down;
                i++;
                down++;
            }

            if (down > peak) {
                sum += (down - peak);
            }
        }

        return sum;
    }
}