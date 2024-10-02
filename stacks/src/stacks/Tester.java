package stacks;
import java.util.*;

public class Tester {
	
	public static void main(String[] args) {
		Stack<Integer> Stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("---Menu---/n");
			System.out.println("1. Print");
			System.out.println("2. Size");
			System.out.println("3. Empty");
			System.out.println("4. Get");
			System.out.println("5. Push");
			System.out.println("6. Peek");
			System.out.println("7. Pop");
			System.out.println("8. Exit");
			
			System.out.println("Enter the number corresponding with the action:");
			int num = sc.nextInt();
			
			
			if (num == 1) {
	         System.out.println("What's in the Stack is: ");
				System.out.println(Stack);
				}
			 else if (num == 2) {
	         System.out.print("The size of the Stack: ");
	          System.out.println(Stack.size());
	            }
			
	          else if (num == 3) {
	            System.out.println("True if empty False if not empty");
	            System.out.println(Stack.isEmpty());
	            }
			
	            else if (num == 4) {
	                System.out.println("Enter an Index to print ");
	                int x = sc.nextInt();
	                
	                if( x > Stack.size()) {
	                	System.out.println("Invalid request");
	                } else {
	                	for(int y = Stack.size(); y > x; y--) {
	                		Stack.pop();
	                	}
	                	System.out.println(Stack.pop());
	                	}
	            }
			
	            else if (num == 5) {
	                System.out.println("Enter an item to add to the top of the stack: ");
	                Stack.push(sc.nextInt());
	                System.out.println(Stack);
	            }
			
	            else if (num == 6) {
	            	System.out.println("The item at the top of the stack is: ");
	                System.out.println(Stack.peek());
	                
	            }
			
	            else if (num == 7) {
	            	System.out.println("The item removed at the top of the stack is: ");
	                System.out.println(Stack.pop());
	            }
			
	            else if (num == 8) {
	                System.out.println("Goodbye");
	                break;
	}
  }
}
}
