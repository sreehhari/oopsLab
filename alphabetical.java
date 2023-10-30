import java.util.*;
public class alphabetical
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int s=sc.nextInt();
		String str[]=new String[s];
		System.out.println("Enter string:");
		for(int i=0;i<s;i++)
		{
			str[i]=sc.next();
		}

		for(int i=0;i<s-1;i++)
		{
			for(int j=0;j<s-i-1;j++)
			{
				if(str[j].compareTo(str[j+1])<0)
				{
					String temp=str[j+1];
					str[j+1]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("Sorted array ");
		for(int i=s-1;i>=0;i--)
		{
			System.out.print(str[i]);
			System.out.print("\n");
		}
	}
}
