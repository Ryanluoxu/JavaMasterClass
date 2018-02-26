package demo;

public class main {

	public static void main(String[] args) {
		
		Animal myDog = new Dog("funny");
		myDog.eat();
		
		//Animal myChicken = new Chicken("fat");  X no fly method
		Bird myChicken = new Chicken("fat");
		myChicken.eat();
		myChicken.fly();
	}
}
