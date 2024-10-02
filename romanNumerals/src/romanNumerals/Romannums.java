package romanNumerals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Romannums {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("roman.dat"));
		
		int y = sc.nextInt();
		sc.nextLine();
		
		for(int x = 0; x < y; x++) {
			String line = sc.nextLine();
			if(line.matches("[0-9]+")) {
				
				 int number = Integer.parseInt(line);
				 
				 if (number <= 0 || number > 3888) {
				        System.out.println("Invalid number");				    
				 }

				 int[] values =     {1000, 900, 500, 400,  100,  90,  50,   40,  10,   9,    5,   4,    1};
				 String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

				 String ans = "";

				 for (int i = 0; i < values.length; i++) {
					 while (number >= values[i]) {
				            ans += (symbols[i]);
				            number -= values[i];
					 }
				 }
				 System.out.println(ans);
				
			}else {
				String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
				int[] values =     {1000, 900, 500, 400,  100,  90,  50,   40,  10,   9,    5,   4,    1};
				
				int a = 0;
				
				for (int i = 0; i < symbols.length; i++) {
					int b = symbols[i].length();
					if(line.startsWith(symbols[i])) {
						while(line.startsWith(symbols[i])){
							a += (values[i]);
							line = line.substring(b);
						}
					}
				}
				System.out.println(a);
			}
		}
	}
}
