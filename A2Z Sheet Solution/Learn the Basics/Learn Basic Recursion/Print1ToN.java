class Print1ToN {

    public void printNos(int n) {
        // Your code here

        if(n == 0){
            return;
        }
        else{
            printNos(n-1);
            System.out.print(n+" ");
        }
    }
}
