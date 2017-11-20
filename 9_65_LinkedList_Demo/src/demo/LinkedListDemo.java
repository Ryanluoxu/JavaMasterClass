package demo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> thingsToLearn = new LinkedList<>();
		
		thingsToLearn.add("Linux");				// 0
		thingsToLearn.add("Shell_Scripts");		// 1
		thingsToLearn.add("SQL");				// 2
		thingsToLearn.add("Spring");			// 3 <---
		thingsToLearn.add("Angular_JS");		// 4
		thingsToLearn.add("Big_Data");			// 5
		
		// Linux -> Shell_Scripts -> SQL -> Spring -> Angular_JS -> Big_Data
		
		printList(thingsToLearn);
		
		thingsToLearn.add(3, "PostgreSQL");
		printList(thingsToLearn);
		
		/**
		 * SQL -> Spring
		 * SQL -> PostgreSQL -> Spring
		 * 
		 * only two effected. 
		 * if in ArrayList, all the items behind have to shift back one place.
		 * when data is huge, LinkedList will save lots of time.
		 * 
		 */
		
		LinkedList<String> thingsToLearn2  = new LinkedList<>();
		
		addInOrder(thingsToLearn2, "Linux");
		addInOrder(thingsToLearn2, "Shell_Scripts");
		addInOrder(thingsToLearn2, "SQL");
		addInOrder(thingsToLearn2, "Spring");
		addInOrder(thingsToLearn2, "Angular_JS");
		addInOrder(thingsToLearn2, "Big_Data");
		
		addInOrder(thingsToLearn2, "Shell_Scripts");
		
		printList(thingsToLearn2);

	}
	
	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		
		while (i.hasNext()) {
			System.out.println("--> " + i.next());
		}
		
		System.out.println("====================");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String string) {
		ListIterator<String> i = linkedList.listIterator();
		
		while (i.hasNext()) {
			
			int compare = i.next().compareTo(string);
			
			if (compare == 0) {
				// string already existed
				System.out.println(string + " already existed..");
				return false;
			} else if (compare > 0) {
				i.previous();
				i.add(string);
				return true;
			} else {
				// go to next string to compare
			}
		}
		
		i.add(string);
		return true;
	}

}
