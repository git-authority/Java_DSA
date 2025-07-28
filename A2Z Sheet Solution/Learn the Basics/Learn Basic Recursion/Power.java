class Power {
    public double myPow(double x, int n) {
          //your code goes here
          if(n<0){
            return 1.0/(calculate(x, -(long)n));
          }
          else{
            return calculate(x, n);
          }
    }

    public double calculate(double x, long n){
        if(n==0){
            return 1;
        }

        if(n % 2 == 1){
            return x*calculate(x, n-1);
        }
        else{
            return calculate(x*x, n/2);
        }
    }
}