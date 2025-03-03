
class minBitFlips {

    public int solution(int start, int goal) {
        int ans = start ^ goal;
        int c = 0;
        for (int i = 0; i <= 31; i++) {
            if ((ans & (1 << i)) == 1) {
                c++;
            }
        }
        return c;
    }
}
