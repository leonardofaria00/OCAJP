package br.com.exercicios.cap3;

/**
 * Conversão de tipos
 * 
 * @author Leonardo Faria
 * 
 */
public class ConversoesDeTipos {
	public static void main(String args[]) {

		short s1 = 57;
		char c1 = (char) s1;// Não compila sem realizar (cast).
		System.out.println("short -> char: " + c1);

		char c2 = 10;
		long l1 = c2;// Compila e roda.
		System.out.println("char -> long : " + l1);

		char c3 = 10;
		short s3 = (short) c3;// Não compila sem realizar (cast).

		System.out.println("char -> short : " + s3);
	}
}
