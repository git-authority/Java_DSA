
class SumOfDivisors{
    public static int sumOfDivisors(int n) {
        // code here
        int div = 0;
        for(int i = 1; i<=n; i++){
            div+=(n/i)*i;
        }
        return div;
    }
}