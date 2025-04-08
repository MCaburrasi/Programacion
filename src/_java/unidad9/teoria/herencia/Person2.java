package _java.unidad9.teoria.herencia;

public class Person2 {
	private String name;
	private String address;

	public Person2(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person[name=" + name + ", addres=" + address + "]";
	}
}
