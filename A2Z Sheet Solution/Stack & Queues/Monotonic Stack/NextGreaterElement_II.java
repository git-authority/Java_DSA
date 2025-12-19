import java.util.*;

class NextGreaterElement_II {
    public int[] nextGreaterElements(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 2*n-1; i>=0; i--){

            int ind = i%n;

            while(!st.isEmpty() && arr[ind]>=st.peek()){
                st.pop();
            }

            if(i<n){
                if(st.isEmpty()){
                    ans[i] = -1;
                }
                else{
                    ans[i] = st.peek();
                }
            }

            st.push(arr[ind]);
        }

        return ans;
    }

}
