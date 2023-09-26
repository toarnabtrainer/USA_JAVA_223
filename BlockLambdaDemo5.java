package demo.lambda;

// A block lambda that reverses the characters in a string.
interface StringFunc5 {
	String func(String n);
}
class BlockLambdaDemo5 {
	public static void main(String args[]) {
		// This block lambda reverses the characters in a string.
		StringFunc5 reverse = (str) -> {
			String result = "";
			int i;
			for(i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("Lambda reversed is " +
				reverse.func("Lambda"));
		System.out.println("Expression reversed is " +
				reverse.func("Expression"));
	}
}