package br.com.exercicios.cap6;

public class MeiaUm {
	public static void main(String[] args) {
		System.out.println(a(5));

	}

	static int a(int value) {
		if (value < 10)
			return b(value);
		else
			return (int) c();

	}

	static int b(int value) {
		if (value < 10)
			return b(value);
		else
			return (int) c();
	}

	static long c() {
		return 3;
	}

}
