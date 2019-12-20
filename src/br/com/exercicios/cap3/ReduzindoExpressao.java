package br.com.exercicios.cap3;

/**
 * Reduzindo expressão
 * 
 * @author Leonardo Faria
 *
 */

public class ReduzindoExpressao {
	public static void main(String[] args) {
		boolean train = false;
		boolean car = false;
		if ((train && !car) || (!train && car)) {
			System.out.println("v ou v");
		}

		if (train ^ car) {
			System.out.println("Ou exclusivo");
		}
	}

}
