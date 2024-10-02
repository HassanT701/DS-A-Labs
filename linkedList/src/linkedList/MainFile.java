package linkedList;

import java.util.*;

public class MainFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;

		LinkedList<String> x = new LinkedList<String>();
		
		while(true) {

			System.out.print("\n-Menu-\n");
			System.out.println("1. Size");
			System.out.println("2. Print");
			System.out.println("3. Print First");
			System.out.println("4. Print Last");
			System.out.println("5. Get Location");
			System.out.println("6. Remove First");
			System.out.println("7. Remove Last");
			System.out.println("8. Remove X");
			System.out.println("9. Add First");
			System.out.println("10. Add Last");
			System.out.println("11. Insert");
			System.out.println("12. Set X");
			System.out.println("13. Is Empty");
			System.out.println("14. Clear");
			System.out.println("0. Exit");

			System.out.print("\nEnter selection: ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("The size of the linked list is: " + x.size() + "");
			}
			if (choice == 2) {
				System.out.println(x.toString());
			}
			if (choice == 3) {
				System.out.println("The First element in the linked list is: " + x.getFirst());
			}
			if (choice == 4) {
				System.out.println("The Last element in the linked list is: " + x.getLast());
			}
			if (choice == 5) {
				System.out.println("Enter the index you'd like to find: ");
				int y = sc.nextInt();
				System.out.println("The object at index " + y + " is" + x.get(y));
			}
			if (choice == 6) {
				System.out.println(
						"The First element in the linked list: " + x.getFirst() + "Has been removed" + x.removeFirst());
			}
			if (choice == 7) {
				System.out.println("The Last element in the linked list: " + x.getLast() + "Has been removed" + x.removeLast());
			}
			if (choice == 8) {
				System.out.println("Enter the index you'd like to remove: ");
				int a = sc.nextInt();
				System.out.println("The object at index " + a + " is " + x.get(a) + " and has been removed");
				x.remove(a);
			}
			if (choice == 9) {
				System.out.println("Enter an element you'd like to add first: ");
				x.addFirst(sc.nextLine());
				
				System.out.println("The String has been added to the front of the linked list");
					
			}
			if (choice == 10) {
				System.out.println("Enter an element you'd like to add last: "); 
				x.addLast(sc.nextLine());
				
				System.out.println("The String has been added to the end of the linked list");
				
			}
			if (choice == 11) {
				System.out.println(x.toString());
				System.out.println("Enter an index where you'd like to insert a string: ");
				int i = sc.nextInt();

				System.out.println("Enter a string to insert at index # " + i + " :");
				String q = sc.nextLine();

				x.add(i, q);

				System.out.println("String " + q + " has been added ad index" + i);
				System.out.println(x.toString());

			}
			if (choice == 12) {
				System.out.println(x.toString());
				System.out.println("Enter an index where you'd like to insert a string: ");
				int e = sc.nextInt();

				System.out.println("Enter a string to insert at index # " + e + " :");
				String y = sc.nextLine();

				x.set(e, y);

				System.out.println("String " + y + " has been added ad index" + e);
				System.out.println(x.toString());

			}
			if (choice == 13) {
				boolean m = x.isEmpty();
				if (m = true) {
					System.out.println("The linked list is empty");
				} else {
					System.out.println("The linked list is not empty");
				}
			}
			if (choice == 14) {
				x.clear();
				System.out.println("The linked list has been cleared");
			}
			if (choice == 0)
				break;
		}
		System.out.print("\nGood Bye!!");
	}

}
