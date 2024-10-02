import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class trust {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Trust"));
		int y = sc.nextInt();
		sc.nextLine();
		for(int x = 0; x < y; x++) {
			String a = sc.nextLine().toLowerCase();
			String b = a.replace(" ", "");		
			if(b.contains("forest")) {
				System.out.println("TWO-TWELVE!");
		}
		
			else {
	
		System.out.println("Glory to Stroudonia...");
	
	
			}
			
		}
		
	}
}
