public class PrimeNumber {
    public boolean checkPrime(int num) {
        //your code goes here
        if(num<=1)  return false;

        int i = (int)Math.sqrt(num);
        int c = 0;

        int result = prime(num, c, i);

        return result==1;
    }

    public int prime(int n, int c, int i){

        if(i == 0){
            return c;
        }

        if(n%i==0){
            c++;
        }

        return prime(n, c, i-1);
    }
}
