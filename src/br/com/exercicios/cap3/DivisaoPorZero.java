package br.com.exercicios.cap3;

/**
 * Imprimindo Divisão por 00 de números inteiros e de ponto flutuante.
 * 
 * @author Leonardo Faria
 *
 */
public class DivisaoPorZero {
	public static void main(String[] args) {
		System.out.println(3 / 0);// print: ArithmeticException
		System.out.println(3 / 0.0);// print Infinity
		System.out.println(3.0 / 0);// print Infinity
		System.out.println(-3.0 / 0);// print -Infinity
	}
}
