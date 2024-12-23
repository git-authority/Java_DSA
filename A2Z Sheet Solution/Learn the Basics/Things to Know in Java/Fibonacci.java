
import java.util.*;
class Fibonacci {


	public static void main(String[] args) {

		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		int f=1,l=1,s=0,n=0,c=0;
		Scanner in = new Scanner(System.in);
		// System.out.println("Enter N :");
		n=in.nextInt();
		if(n==1)
			{
				System.out.println(f);
			}
			else if(n==2)
			{
				System.out.println(l);
				// break;
			}
		for(int i=3;i<=n;i++)
		{
			s=f+l;
			f=l;
			l=s;
			c++;
		}
		if(c>0)
			System.out.println(s);
	}

}