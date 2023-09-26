package demo.lambda;

// A block lambda that computes the factorial of an int value.
interface NumericFunc {
	int func(int n);
}
class BlockLambdaDemo4 {
	public static void main(String args[]) {
		// This block lambda computes the factorial of an int value.
		NumericFunc factorial = (n) -> {
			int result = 1;
			for(int i = 1; i <= n; i++)
				result = result * i;
			return result;
		};
		System.out.println("The factoral of 3 is " + factorial.func(3));   // 6 = 1*2*3
		System.out.println("The factoral of 5 is " + factorial.func(5));   // 120 = 1*2*3*4*5
	}
}