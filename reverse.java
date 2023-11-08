import java.util.*;
public class reverse
{
	public static void main(String args[])
	{
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev;
		int l=s.length();
		l--;
		rev="";
		for(int i=l;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println("Reversed string= "+rev);
	}

}
