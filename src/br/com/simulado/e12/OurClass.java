package br.com.simulado.e12;

public class OurClass extends MyClass {
	public static void main(String[] args) {
		YourClass yourClass = new YourClass();
		yourClass.toString();

		OurClass ourClass = new OurClass();
		System.out.println(ourClass.getNome());
	}
}
