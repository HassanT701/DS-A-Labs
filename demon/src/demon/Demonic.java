package demon;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack; 

public class Demonic {
	
	public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("demonic.dat"));

        int x = sc.nextInt();
        sc.nextLine();
        for (int l = 0; l < x; l++){
            String line = sc.nextLine();
            if (line.endsWith("+") || line.endsWith("-") || line.endsWith("*") || line.endsWith("/") || line.endsWith("^")){
                System.out.println(Post(line));
            }else if (line.startsWith("+") || line.startsWith("-") || line.startsWith("*") || line.startsWith("/") || line.startsWith("^")){
                System.out.println(pre(line));
            }else {
                System.out.println(Post(IntoPost(line)));
            }
        }
            
        }
        
        public static int pre(String a){
            Stack<Integer> x = new Stack<>();
            String[] line = a.split("\\s+");

            for (int l = line.length - 1; l >= 0; l--) {
                if (Character.isDigit(line[l].charAt(0))) {
                    x.push(Integer.parseInt(line[l]));
                } else {
                    int num1 = x.pop();
                    int num2 = x.pop();

                    if ("+".equals(line[l])) {
                        x.push(num1 + num2);
                    } else if ("-".equals(line[l])) {
                        x.push(num1 - num2);
                    } else if ("*".equals(line[l])) {
                        x.push(num1 * num2);
                    } else if ("/".equals(line[l])) {
                        x.push(num1 / num2);
                    } else if ("^".equals(line[l])) {
                        x.push((int) Math.pow(num1, num2));
                    }
                }
            }
            return x.pop();
        }
        
        public static int Post(String a){
            Stack<Integer> x = new Stack<>();
            String[] line = a.split("\\s+");

            for (int l = 0; l < line.length; l++){
                if (Character.isDigit(line[l].charAt(0))){
                    x.push(Integer.parseInt(line[l]));
                }
                else {
                    int num2 = x.pop();
                    int num1 = x.pop();
                    if (line[l].equals("+")) {
                        x.push(num1 + num2);
                    } else if (line[l].equals("-")) {
                        x.push(num1 - num2);
                    } else if (line[l].equals("*")) {
                        x.push(num1 * num2);
                    } else if (line[l].equals("/")) {
                        x.push(num1 / num2);
                    } else if (line[l].equals("^")) {
                        x.push((int) Math.pow(num1, num2));
                    }
                }

            }
            return x.pop();
        }
	
        public static String IntoPost(String a){
            Stack<Character> x = new Stack<>();
            String ans = "";
            String[] line = a.split("\\s+");
            for (int l = 0; l < line.length; l++){
                if (Character.isDigit(line[l].charAt(0))){
                    ans += line[l] + " ";
                } else if (line[l].equals("+") || line[l].equals("-") ||  line[l].equals("*") ||  line[l].equals("/") ||  line[l].equals("^")  ) {
                    while (!x.isEmpty() && isOperator(x.peek()) && c(x.peek()) >= c(line[l].charAt(0))){
                        ans += x.pop() + " ";
                    }
                    x.push(line[l].charAt(0));
                } else if (line[l].equals("(")) {
                    x.push(line[l].charAt(0));
                } else if (line[l].equals(")")) {
                    while (!x.isEmpty() && x.peek() != '('){
                        ans += x.pop() + " ";
                    }
                    x.pop();
                }
            }
            while (!x.isEmpty()){
                ans += x.pop() + " ";
            }
            return ans;
        }
	
        public static int c (char i) {
        	if (i == '^') {
                return 3;
            } else if (i == '*' || i == '/') {
                return 2;
            } else if (i == '+' || i == '-') {
                return 1;
            } else {
                return 0;
            }
        }
        
        public static boolean isOperator(char c) {
            return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
        }


}

