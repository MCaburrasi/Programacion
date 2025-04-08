package _java.unidad9.teoria.herencia;

public class Dog extends Mammal{
	public Dog(String name) {
		super(name);
	}

	public void greets(){
		System.out.println("Woof");
	}

	public void greets(Dog aDog){
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Dog{" + super.toString() + "}";
	}
}
