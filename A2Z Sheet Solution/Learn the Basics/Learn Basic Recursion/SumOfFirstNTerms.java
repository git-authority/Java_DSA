class SumOfFirstNTerms {
    public int sumOfSeries(int n) {
        // code here
        if(n==0){
            return 0;
        }
        return((int)Math.pow(n, 3) + sumOfSeries(n-1));
    }
}