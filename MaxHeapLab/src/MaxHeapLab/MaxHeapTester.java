package MaxHeapLab;

import java.util.Scanner;

public class MaxHeapTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MaximumHeap<Integer> maxHeap = new MaximumHeap<>();

		while (true) {

			System.out.println("Menu");
			System.out.println("1.Print");
			System.out.println("2.Size");
			System.out.println("3.Empty");
			System.out.println("4.Add");
			System.out.println("5.Remove");
			System.out.println("6.Clear");
			System.out.println("7.Exit");

			System.out.println("Select a choice from the menu above (1-7)");
			int x = sc.nextInt();

			switch (x) {
			case 1:
				
				System.out.println("Printed elements: " + maxHeap.heap);
				break;

			case 2:
				System.out.println("Heap size: " + maxHeap.size());
				break;

			case 3:
				System.out.println("Is the Heap empty ? " + maxHeap.empty());
				break;

			case 4:
				System.out.print("Enter an object to add: ");
				int element = sc.nextInt();
				maxHeap.add(element);
				System.out.println(element + " Was successfully added to the Heap");
				break;

			case 5:
				Integer removed = maxHeap.remove();
				if (removed != null) {
					System.out.println("removed element is: " + removed);

				} else {
					System.out.println("Cannot remove because heap is not empty");

				}
				break;

			case 6:
				maxHeap.clear();
				System.out.println("The heap has been cleared");
				break;

			case 7:
				System.out.println("Goodbye!");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid, Choose bewteen 1 - 7");

			}

		}

	}

}
