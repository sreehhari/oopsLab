class Palindrome{
	static int reversen(int n){
		int reverse=0;
		while(n>0){
		reverse = reverse * 10 + n%10;
		n = n/10;
	
	}
	
	return reverse;
	
	}
	public static void main(String args[]){

	int n=121;
	int reversem=reversen(n);
	
	System.out.println("the reverse is " +reversem);
	if(n==reversem){
		System.out.println("palindrome");
	
	}
	else{
		System.out.println("not palindrome");
		
	}

	}
}
