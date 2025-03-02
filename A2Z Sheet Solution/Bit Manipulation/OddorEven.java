class OddorEven {
    static boolean isEven(int n) {
        // code here
        if((n & 1) == 1)
            return false;
        else
            return true;
    }
}