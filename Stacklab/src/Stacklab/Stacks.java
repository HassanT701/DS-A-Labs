package Stacklab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Stacks {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("Stack.dat"));
		
		while (sc.hasNextLine()){
            String line = sc.nextLine();
            
            System.out.print(line + " = ");
            System.out.println(Post(line));
            	
        	}
        }
	
		public static Double Post(String a){
            Stack<Double> x = new Stack<>();
            String[] line = a.split("\\s+");

            for (int l = 0; l < line.length; l++){
                if (Character.isDigit(line[l].charAt(0))){
                    x.push(Double.parseDouble(line[l]));
                }
                else {
                    Double num2 = x.pop();
                    Double num1 = x.pop();
                    if (line[l].equals("+")) {
                        x.push(num1 + num2);
                    } else if (line[l].equals("-")) {
                        x.push(num1 - num2);
                    } else if (line[l].equals("*")) {
                        x.push(num1 * num2);
                    } else if (line[l].equals("/")) {
                        x.push(num1 / num2);
                    } else if (line[l].equals("^")) {
                        x.push((double) Math.pow(num1, num2));
                    }
                }

            }
            return x.pop();
        } 

}
