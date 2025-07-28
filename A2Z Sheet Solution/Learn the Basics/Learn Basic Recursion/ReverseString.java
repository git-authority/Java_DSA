public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        reverse(s, left, right);
    }

    private void reverse(char[] s, int left, int right){
        if(left>=right)    return;

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverse(s, left+1, right -1);

    }
}
