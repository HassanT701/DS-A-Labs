package alph;

public class alphonso {

	public static void main(String[] args) {
	
		String a = "ACEGIKMOQSUWY";
		for(int x = 0; x < 6; x++) {
			for(int y = 0; y < a.length(); y++) {
				System.out.println(a.substring(y));
			}
			a = a.substring(2);
		}
		System.out.println("Y");
	}
}
