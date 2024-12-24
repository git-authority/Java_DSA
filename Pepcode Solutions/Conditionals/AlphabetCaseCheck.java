import java.util.*;
public class AlphabetCaseCheck
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char ch = in.next().charAt(0);
        if(ch>='A'&&ch<='Z')
            System.out.println("Uppercase Character");
        else if(ch>='a' && ch<='z')
            System.out.println("Lowercase Character");
        else
            System.out.println("Not an alphabet.");
    }
}