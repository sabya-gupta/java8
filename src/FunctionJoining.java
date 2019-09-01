import java.util.function.Function;

public class FunctionJoining {
	
	static Function<Integer, Integer> myDouble = i->{return i*2;};
	
	static Function<Integer, Integer> mySquare = i->{return i*i;};

	public static void main(String[] args) {
		System.out.println(
				myDouble.apply(5)
		);
		System.out.println(
				mySquare.apply(5)
		);
		System.out.println(
				myDouble.andThen(mySquare).apply(5)
		);
		System.out.println(
				myDouble.compose(mySquare).apply(5)
		);
	}
}
