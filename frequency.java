import java.util.*;
class Frequency
{
	public static void main(String args[])
	{
		System.out.println("Enter the string and character");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		int l=s.length();
		int k=0;
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)==c)
			{
				k++;
			}
		}
		System.out.println("Frequency of given character is "+k);
	}
}
