package demo;

public class Chicken extends Bird{
	
	public Chicken(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is hardly flying..");
	}

}
