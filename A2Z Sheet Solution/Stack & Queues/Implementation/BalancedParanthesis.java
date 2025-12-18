import java.util.*;

public class BalancedParanthesis {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        int i = 0;

        while(i<str.length()){

            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                st.push(str.charAt(i));
            }
            else{

                if(st.isEmpty()){
                    return false;
                }

                char ch = st.peek();
                st.pop();

                if(!isMatched(ch, str.charAt(i))){
                    return false;
                }

            }

            i++;
        }

        return st.isEmpty();
    }


    private boolean isMatched(char open, char close) {

        if((open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}')){
            return true;
        }

        return false;
    }
}