package br.com.exercicios.cap3;

/**
 * 
 * @author Leonardo Faria
 *
 */
public class Exercicio7 {
	public static void main(String[] args) {
		int y;

		for (int i = 0; i < 10; ++i) {
			y = i % 5 + 2;
		}
		System.out.println(y);// Não compila. Variável não inicializada.

	}
}
