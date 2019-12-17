package br.com.exercicios.cap6ponto7.e5;

public class B {
	private final int b;

	B(int b) {
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		b = b;// variável é final e não pode ser alterada.
	}
}
