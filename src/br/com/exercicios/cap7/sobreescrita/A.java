package br.com.exercicios.cap7.sobreescrita;

public class A {
	public void method() {
		System.out.println("c");// 4
		method2();// 5 volta para o método do objeto criado em tempo de execulção.
	}

	public void method2() {// Nunca será chamado.
		System.out.println("parent method2");// 6
	}

}
