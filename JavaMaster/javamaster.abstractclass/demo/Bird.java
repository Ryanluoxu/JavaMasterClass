package demo;

public abstract class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating ..");
	}
	
	public abstract void fly();
	
}
