//pode ter comentário
package br.com.simulado.e11;

public class Conversion {
	public static void main(String[] args) {
		// Conversion char to long
		char char1 = Character.MAX_VALUE;
		long long1 = char1;
		System.out.println("char to long: " + long1);

		// Conversion byte to short
		byte byte1 = Byte.MAX_VALUE;
		short short1 = byte1;
		System.out.println("byte to short: " + short1);

		// Conversion short to char
		short short2 = Short.MAX_VALUE;
		char char2 = (char) short2;// does not cast
		System.out.println("Cast short to char: " + char2);

		// Conversion int to float
		int int1 = Integer.MAX_VALUE;
		float float1 = int1;
		System.out.println("int to float: " + float1);
		System.out.println("");

		// Conversion byte, char or shot to int or long
		byte byte2 = Byte.MAX_VALUE;
		int int2 = byte2;
		System.out.println("byte to int: " + int2);

		char char3 = Short.MAX_VALUE;
//		int int3 = short3;
//		System.out.println("short to int: " + int3);
//		long long2 = short3;
//		System.out.println("Short to long: " + long2);

	}
}// class
