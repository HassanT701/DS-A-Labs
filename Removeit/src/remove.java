import java.util.*;
public class remove {

	public static void main(String[] args) {
		// Mr. Beck this is my work this time (Last time we coded together and i forgot to remove it)
		
		String[] list1 = "a b c a b c a".split(" ");
		String[] list2 = "a b c d e f g h i j x x x x".split(" ");
		String[] list3 = "1 2 3 4 5 6 a b c a b c b".split(" ");
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(list1));
		ArrayList<String> listtwo = new ArrayList<String>(Arrays.asList(list2));
		ArrayList<String> listthree = new ArrayList<String>(Arrays.asList(list3));
		
		//numero uno
		Iterator<String> check1 = list.iterator();
		ArrayList<String> Cleared = new ArrayList<>();
		
		while(check1.hasNext()) {
			String pop = check1.next();
			if(!pop.contains("a")) {
			Cleared.add(pop);
			} else {
				check1.remove();
			}
		}
		System.out.println(Cleared);
		
		//numero dos
		Iterator<String> check2 = listtwo.iterator();
		ArrayList<String> Cleared2 = new ArrayList<>();
		
		while(check2.hasNext()) {
			String pop = check2.next();
			if(!pop.contains("x")) {
			Cleared2.add(pop);
			} else {
				check2.remove();
			}
		}
		System.out.println(Cleared2);
		
		
		//numero tres
		Iterator<String> check3 = listthree.iterator();
		ArrayList<String> Cleared3 = new ArrayList<>();
		
		while(check3.hasNext()) {
			String pop = check3.next();
			if(!pop.contains("b")) {
			Cleared3.add(pop);
			} else {
				check3.remove();
			}
		}
		System.out.println(Cleared3);
		
	}
}

