package challenge;


/**
 * @author luoxu
 * 
 * Create own LinkedList class
 * the item can be added with auto sorting from small to large
 * the item can be removed
 * use traverse method to iterate and print all the items 
 */

public class Main {

	/*public static void main(String[] args) {

		MyList myList = new MyLinkedList();
		
		String testData = "2 3 1 2 5 6 7 4 9 8 7 4";
		String[] dataArray =  testData.split(" ");
		for (String data : dataArray) {
			myList.addItem(new Node(data));
		}
		
		myList.traverse(myList.getRoot());
		
		myList.removeItem(new Node("7"));
		myList.traverse(myList.getRoot());
		myList.removeItem(new Node("7"));
		myList.traverse(myList.getRoot());
		myList.removeItem(new Node("9"));
		myList.traverse(myList.getRoot());
		myList.removeItem(new Node("5"));
		myList.traverse(myList.getRoot());
		myList.removeItem(myList.getRoot());
		myList.traverse(myList.getRoot());
		myList.removeItem(myList.getRoot());
		myList.traverse(myList.getRoot());
		myList.removeItem(myList.getRoot());
		myList.traverse(myList.getRoot());
		myList.removeItem(myList.getRoot());
		myList.traverse(myList.getRoot());
	}*/
	
	public static void main(String[] args) {

		MyList myTree = new SearchTree();
		
		String testData = "2 3 1 2 5 6 7 4 9 8 7 4";
		String[] dataArray =  testData.split(" ");
		for (String data : dataArray) {
			myTree.addItem(new Node(data));
		}
		
		myTree.traverse(myTree.getRoot());
		
		myTree.removeItem(new Node("7"));
		myTree.traverse(myTree.getRoot());
		myTree.removeItem(new Node("7"));
		myTree.traverse(myTree.getRoot());
		myTree.removeItem(new Node("9"));
		myTree.traverse(myTree.getRoot());
		myTree.removeItem(new Node("5"));
		myTree.traverse(myTree.getRoot());
		myTree.removeItem(myTree.getRoot());
		myTree.traverse(myTree.getRoot());
		myTree.removeItem(myTree.getRoot());
		myTree.traverse(myTree.getRoot());
		myTree.removeItem(myTree.getRoot());
		myTree.traverse(myTree.getRoot());
		myTree.removeItem(myTree.getRoot());
		myTree.traverse(myTree.getRoot());
	}

}
