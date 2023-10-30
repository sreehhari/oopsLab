import java.util.*;

public class palindrome{
	static boolean check(String n){
	//n = n.replaceAll("\\s","").toLowercase();
	int left =0;
	int right = n.length() - 1;
	
	while(left<right){
		if(n.charAt(left)!=n.charAt(right)){
			return false;
		}
		left++;
		right--;
		}return true;
	
	}
	
	
	
	
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter the word to check ");
		String word = in.nextLine();
		if(check(word)){
			System.out.println("the word is a palindrome");
		}
		else{
		System.out.println("not a palindrome");
		}
	
	
	
	
	
	
	
	
	}



}
