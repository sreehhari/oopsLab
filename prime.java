import java.util.*;
public class prime{
	public static void main(String[] args){
		int i,m=0,flag=0;
		int a=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number to be checked");
		a = in.nextInt();
		m=a/2;
		if(a==0||a==1){
			System.out.println(a+"is not a prime number");
		}
		
		else{
			for(i=2;i<=m;i++){
				if(a%i==0){
					
					flag=0;
					break;
					
				}
				else{
					flag =1;
				}
				
			}
		
		if(flag ==0){
			System.out.println("its  prime");
		}
		else{
			System.out.println("not prime");
		}
		}
		
	
	
	
	
	
	
	
	
	
	
	}



























}
