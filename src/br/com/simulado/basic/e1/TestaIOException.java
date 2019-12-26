package br.com.simulado.basic.e1;

import java.io.IOException;

public class TestaIOException {
	public static void main(String[] args) throws IOException {// sucess
		System.out.println("run");
	}
}

class OtherTestaIOException {// pode ter várias classes NÂO PÚBLICAS.

}

class AccessModifiers {
	int a;

	public void m1() {
		private int b = 0;// Não pode ter modificador de acesso dentro dos métodos.
		a = b;
	}
}