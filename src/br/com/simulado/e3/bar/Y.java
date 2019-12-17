package br.com.simulado.e3.bar;



import br.com.simulado.e3.foo.X;

/**
 * @author Leonardo Faria dos Santos
 * 
 * Consider the following two classes defined in two java source files.
 * What should be inserted at //1 so that Y.java can compile without any error?
 */
public class Y {
	public static void main(String[] args) {
		X x = new X();
		x.apply(LOGICID);
	}
}
