package _java.unidad9.teoria.herencia;

public class Cat extends Mammal{
	public Cat(String name) {
		super(name);
	}

	public void greets(){
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat: Cat[" + super.toString() + "]";
	}
}
