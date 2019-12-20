package br.com.exercicios.cap3;

/**
 * Contas com diferentes operadores
 * 
 * @author Leonardo Faria
 *
 */
public class ContaComDirefentesOperadores {
	public static void main(String[] args) {
		int i1 = 3 / 2;
		System.out.println("i1 = " + i1);

		double i2 = 3 / 2;
		System.out.println("i2 = " + i2);

		double i3 = 3 / 2.0;
		System.out.println("i3 = " + i3);

		long x = 0;
		double d = 0;
		double zero = x + d;
		System.out.println("Soma: " + (i1 + i2 + i3 + x + d + zero));
	}
}
