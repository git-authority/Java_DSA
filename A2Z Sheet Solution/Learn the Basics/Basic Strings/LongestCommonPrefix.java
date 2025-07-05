import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] str) {
        //your code goes here

        Arrays.sort(str);

        String first = str[0], last = str[str.length-1];
        int i = 0;

        for(i=0;i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i)!=last.charAt(i))
                break;
        }

        return last.substring(0, i);
    }
}
