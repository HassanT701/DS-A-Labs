import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class safeHouses {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("safehouse"));
		int y = sc.nextInt();
		sc.nextLine();
		for(int x = 0; x < y; x++) {
			String c = sc.nextLine();
			String oi = c.replaceAll("\\D+", "");
			int io = Integer.parseInt(oi);
			if(io % 7 == 0) {
				System.out.println("" + c + "");
		}
		
			else {
	
		System.out.println("DANGER!");
	
	
			}
			
		}
		
	}
}