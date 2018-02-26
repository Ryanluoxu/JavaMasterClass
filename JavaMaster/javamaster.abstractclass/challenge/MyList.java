package challenge;

public interface MyList {

	ListItem getRoot();
	boolean addItem(ListItem listItem);
	boolean removeItem(ListItem listItem);
	void traverse(ListItem listItem);
}
