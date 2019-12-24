package br.com.simulado.basic;

public class ATest {

	String global = "111";

	public int parse(String arg) {
		int value = 0;

		try {
			String global = arg;
			value = Integer.parseInt(global);
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
		System.out.println(global + " " + value + " ");
		return value;
	}

	public static void main(String[] args) {
		ATest test = new ATest();
		test.parse("333");
		System.out.println(test.parse("333"));
	}
}
