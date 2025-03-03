class countSetBits{

    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBit(int n){
        int c=0;
        // Your code here
        for(int i = 1;i<=n;i++){
            int num = i;
            while(num>1){
                if((num & 1) == 1){  //does same operation as num%2==1, this step is used for checking the binary digits of a decimal number
                    c++;
                }
                num=num>>1;     //does same operation as num/=2
            }
            if(num==1){
                c++;
            }
        }
        return c;
    }
}