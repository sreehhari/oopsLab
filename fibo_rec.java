import java.util.*;
class fibo{
	 static int fib(int n){
		if(n<=1){
			return n;
		
		}
		else{
		return fib(n-1)+fib(n-2);
		}
	
	}
	public static void main(String[] args){
		System.out.println("enter the number");
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		for(int i=0;i<n;i++){
			System.out.println(fib(n) + " ");
		}

		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}













