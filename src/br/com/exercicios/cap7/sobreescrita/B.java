package br.com.exercicios.cap7.sobreescrita;

public class B extends A {
	public void method() {
		System.out.println("b");// 2
		super.method();// 3
	}

	public void method2() {
		System.out.println("a");// 1
		method();
		super.method();
	}
}
