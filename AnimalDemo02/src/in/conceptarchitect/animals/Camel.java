package in.conceptarchitect.animals;

@SpecialBehavior(name="desertRide")
public class Camel extends Mammal {

	
	
	public void eat() {
		System.out.println(type()+" eats grass");
	}
	
	public void ride() {
		System.out.println(type()+" is a great desert ride");
	}
}
