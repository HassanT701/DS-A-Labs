import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Objection {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("objection"));
		int io = sc.nextInt();
		
		
		for(int x = 0; x < io; x++) {
			int obj = sc.nextInt();
			if(obj <= 0) {
				System.out.println("GUILTY!");
		}
		
			else {
	for(int i = 0; i < obj; i++) {
		System.out.println("OBJECTION!");
	}
	System.out.println("Hold it!");
			}
			
		}
	
	
	}
}
	
	
	
