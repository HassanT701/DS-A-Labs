package stringreview;
import java.util.Scanner;

public class stringReview {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" ---All four letter words are bad words--- \n");
		
		System.out.println("Enter a phrase/sentence with a period at the end: ");
		String x = sc.nextLine();
		String[] i = x.split(" ");
		if(x.endsWith(".")) {
			
		
		
		
		
		
		
		
			for (int y = 0; y < i.length; y++) {
				if(i[y].length() == 4) {
					i[y] = "****";
					
					
				}
			
			}
		
			

				System.out.println(x);
				for(String y : i) {
					System.out.print(y+ " ");
					
				}
		}
		
	}
	}

