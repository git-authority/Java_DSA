class PrintNTimes {

    void printGfg(int N) {
        // code here
        if(N==0)
            return;
        printGfg(N-1);
        System.out.print("GFG ");
    }
}