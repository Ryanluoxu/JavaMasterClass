package challenge;

public abstract class ListItem {

	// need to access by subclass in the same package
	protected ListItem leftLink;
	protected ListItem rightLink;
	private Object value;
	
	public ListItem(Object value) {
		this.value = value;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	abstract ListItem next();
	abstract ListItem previous();
	abstract ListItem setNext(ListItem listItem);
	abstract ListItem setPrevious(ListItem listItem);
	
	abstract int compareTo(ListItem listItem);
}

