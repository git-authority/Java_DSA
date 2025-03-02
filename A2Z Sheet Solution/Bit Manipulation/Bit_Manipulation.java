class Bit_Manipulation {
    static void bitManipulation(int num, int i) {
        // code here
        int new_num = (num & (1 << (i - 1)));
        System.out.print((new_num >> (i - 1)) + " ");
        System.out.print((num | (1 << (i - 1))) + " ");
        System.out.print((num ^ (1 << (i - 1))));
    }
}
