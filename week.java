import java.util.*;
class Week{
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	System.out.println("enter the number");
	int a = in.nextInt();
		
		String day;
		switch(a){
			case(1):
			day="sunday";
				
			break;	
			case(2):
			day="monday";
				
			break;	
			case(3):
			day="tuesday";
			
			break;			
			case(4):
			day="wednesday";
			
			break;				
			case(5):
			day="thursday";
				
			break;	
			case(6):
			day="friday";
			
			break;			
			case(7):
			day="saturday";
			
			break;	
			default:
			day = "invalid day";		
		
		
		}
		System.out.println(day);
		
		}
	}
			
