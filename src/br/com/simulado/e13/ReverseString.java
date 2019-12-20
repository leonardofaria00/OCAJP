package br.com.simulado.e13;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Leonardo Faria";
		System.out.println(ReverseString.Reverter(name));// print airaF odranoeL

	}// main

	static String Reverter(String value) {
		String nome = "";
		for (int i = value.length() - 1; i >= 0; i--)
			nome += value.charAt(i);
		return nome;
	}
}// class