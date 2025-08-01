import java.util.*;

class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        //your code goes here

        List<String> current = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();

        helper(0, s, current, result);
        return result;
    }

    private void helper (int i, String s, List<String> current, List<List<String>> result){
        if(i == s.length()){
            result.add(new ArrayList<>(current));
        }

        for(int end = i; end<s.length(); end++){

            if(isPalindrome(s, i, end)){

                current.add(s.substring(i, end+1));

                helper(end + 1, s, current, result);

                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right){

        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}