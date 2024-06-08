package practice;

public class JumpStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Break statement
		
		/*int i;
		
		for(i=1; i<=10; i++) {
			
			if(i==5) {
				break;
			}
			
			System.out.println("Value of i : " + i);
		}
		
		System.out.println("After For Loop");*/
		
		
		// Continue statement
		
		int i;
		
		for(i=1; i<=10; i++) {
			
			if(i==5) {
				continue;
			}
			
			System.out.println("Value of i : " + i);
		}
		
		System.out.println("After For Loop");

	}

}
