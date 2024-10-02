package treeLab;

//Name - Hassan Talha 
//Date - 1/9/24
//Class - Computer Science 3 Data Structures
//Lab  - treeLab

import static java.lang.System.*;

public class BSTreeRunner{
	
	public static void main(String args[]){
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();

      tree.add(90);
      tree.add(80);
      tree.add(100);
      tree.add(70);
      tree.add(85);
      tree.add(98);
      tree.add(120);

      System.out.println("IN ORDER"); tree.inOrder();

      System.out.println("PRE ORDER"); tree.preOrder();

      System.out.println("POST ORDER"); tree.postOrder();

      System.out.println("REVERSE ORDER"); tree.revOrder();
      
      System.out.println("Tree height is " + tree.getHeight(tree.root));

      System.out.println("Tree width is " + tree.getWidth(tree.root));

      System.out.println("Number of leaves is " + tree.getNumLeaves(tree.root));

      System.out.println("Number of nodes is " + tree.getNumNodes(tree.root));
      
      System.out.println("Number of levels is " + tree.getNumLevels(tree.root));

      System.out.print("Tree as a string "); tree.inOrder();
      
      if (tree.isFull(null) == true ) {
      System.out.println("The tree is full." );
      } else {
          System.out.println("The tree isnt full." );
      }
      
	}
}