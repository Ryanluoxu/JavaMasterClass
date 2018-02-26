package demo;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating bones..");
	}
}
