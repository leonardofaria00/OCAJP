package br.com.exercicios.cap3;

/**
 * Teste de compilação
 * 
 * @author Leonardo Faria
 *
 */
public class TesteDeCompilacao {
	int i = (byte) 5;// compila
	long l = 3.0;// não compila
	float f = 0.0;// não compila. Precisa adicionar o 'f' ex: 0.0f
	char c = 3;// compila.
	char c2 = -2;// não compila. Não recebe valores negativos.
}
