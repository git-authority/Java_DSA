class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        if( ( ( n>>k ) & 1) == 1 )
            return true;
        else
            return false;
    }
}