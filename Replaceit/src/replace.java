import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class replace {
	public static ListIterator<String> replaceWord(ListIterator<String> it,String target,String word){
		   while(it.hasNext()){
		       String i = it.next();
		       if (i.equals(target)){
		           it.set(word);
		       }
		   }
		   return it;
		}

	public static void main (String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("it"));
		   ArrayList<String> list  = new ArrayList<>();
		   while(sc.hasNextLine()){
		       String i = sc.nextLine();
		       String[] words = i.split(" ");


		       ArrayList<String> l  = new ArrayList<>(Arrays.asList(words));


		       String target = l.get(words.length-6);
		       String word = l.get(words.length-1);




		       ListIterator<String> io = l.listIterator();


		       replaceWord(io,target,word);
		       list.add(l.toString());
		   }
		   for (String lol: list) {
		       System.out.println(lol);
		   }


	}
	



		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
