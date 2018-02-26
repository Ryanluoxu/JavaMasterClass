package challenge;

public class Node extends ListItem {

	public Node(Object value) {
		super(value);
	}

	@Override
	ListItem next() {
		return rightLink;
	}

	@Override
	ListItem previous() {
		return leftLink;
	}

	/**
	 * return listItem, so that simplify the steps: 
	 * currentItem.setPrevious(listItem).setNext(currentItem);
	 */
	
	@Override
	ListItem setNext(ListItem listItem) {
		rightLink = listItem;
		return listItem;
	}

	@Override
	ListItem setPrevious(ListItem listItem) {
		leftLink = listItem;
		return listItem;
	}

	@Override
	int compareTo(ListItem listItem) {
		return this.getValue().toString().compareTo(listItem.getValue().toString());
	}
	
}
