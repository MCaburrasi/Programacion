package _java.unidad9.teoria.herencia;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.p(10);
		a.p(10.0);

		System.out.println("=========================");
		D d = new D();
		d.p2(10);
		d.p2(10.0);
	}
}

class B{
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class A extends B {
	@Override
	public void p(double i) {
		System.out.println(i);
	}
}

class C {
	public void p2(double i){
		System.out.println(i * 2);
	}
}

class D extends C{
	public void p2(int i){
		System.out.println(i);
	}
}
