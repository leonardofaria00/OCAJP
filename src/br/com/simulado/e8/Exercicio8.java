package br.com.simulado.e8;

/**
 * @author Leonardo Faria dos Santos
 * 
 *         What will be the output of the following program when it is compiled
 *         and run with the command line: java TestClass 1 2 3
 */
public class Exercicio8 {

	public static void main(String[] args) {
		try {
			System.out.println("Values : " + args[0] + args[1]);// 3
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Não existe valor.");
		}
	}

}
