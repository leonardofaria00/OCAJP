package br.com.exercicios.cap6;

public class PromocaoEmParametros {

	static PromocaoEmParametros getInstance() {
		return new PromocaoEmParametros();
	}

	public static void main(String[] args) {

		getInstance().primitive(1.5);

		String string = getInstance().method(10);
		System.out.println(string);
	}

	public void primitive(double numero) {
		System.out.println("Número: " + numero);
	}

	public static String method(int n) {
		System.out.println(0);
		if (n > 0) {
			return "positivo";
		} else if (n < 0) {
			return "negativo";
		}
		return "zero!";
	}
}
