import java.util.*;
class strMod
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("string:");
		String s=sc.nextLine();
		StringBuffer st=new StringBuffer(s);
		System.out.println("original string:"+st);
		while(true)
		{
			System.out.println("1.insert string\n2.modify char\n3.append string\n4.exit");
			System.out.println("choice:");
			int c=sc.nextInt();
			if(c==1)
			{
				System.out.println("pos:");
				int p=sc.nextInt();
				System.out.println("string:");
				String s1=sc.next();
				System.out.println("modified string:"+s.substring(0, p) + s1 + s.substring(p));	
			}
			else if(c==2)
			{
				System.out.println("pos:");
				int p=sc.nextInt();
				System.out.println("char:");
				char s1=sc.next().charAt(0);
				st.setCharAt(p,s1);
				System.out.println("modified string:"+st);
			}
			else if(c==3)
			{
				System.out.println("string:");
				String s1=sc.nextLine();
				s1=sc.nextLine();
				st.append(" "+s1+" ");
				System.out.println("modified string:"+st);
			}
		else
			break;
		
		}
	
	}

}
