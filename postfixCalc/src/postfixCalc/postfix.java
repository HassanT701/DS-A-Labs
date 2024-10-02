package postfixCalc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class postfix {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("postfix.dat"));
		
		String a = sc.nextLine();
		
		 Stack<Integer> stack = new Stack<>();
	        String[] tokens = a.split("\\s+");

	        for (String token : tokens) {
	            if (token.equals("quit")) {
	                break;
	            } else if (token.equals("+")) {
	                if (stack.size() > 1) {
	                    int num2 = stack.pop();
	                    int num1 = stack.pop();
	                    stack.push((num1 + num2) % 256);
	                }
	            } else if (token.equals("*")) {
	                if (stack.size() > 1) {
	                    int num2 = stack.pop();
	                    int num1 = stack.pop();
	                    stack.push((num1 * num2) % 256);
	                }
	            } else if (token.equals("=")) {
	                if (!stack.isEmpty()) {
	                    System.out.println(stack.peek());
	                }
	            } else {
	                int num = Integer.parseInt(token);
	                stack.push(num);
	            }
	        }
	        
	}
}
