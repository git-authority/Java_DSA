class PassByValueAndReference {
    static int[] passedBy(int a, int b) {
        // code here
        int result[] = new int[2];
        result[0] = a + 1;
        result[1] = b + 2;
        return result;
    }
}
