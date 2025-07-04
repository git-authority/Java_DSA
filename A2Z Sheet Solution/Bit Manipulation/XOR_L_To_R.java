// User function Template for Java

class XOR_L_To_R {
    public int findXOR(int l, int r) {
         //your code goes here
        return xorTillN(l-1)^xorTillN(r);
    }

    private int xorTillN(int n){
        if(n%4==1)  return 1;
        if(n%4==2)  return n+1;
        if(n%4==3)  return 0;
        return n;
    }
}