package ex03;

public class AnimalMain {

	public static void main(String[] args) {

		Animal myDog = new Dog();
		Animal myCat = new Cat();
		Animal myLion = new Lion();
		
		
		myDog.sound();
		myDog.eat();
		
		myCat.sound();
		myCat.eat();
		
		myLion.sound();
		myLion.eat();
		
		}

}
