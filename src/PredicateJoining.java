import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateJoining {
	
	static Predicate<String> CheckStrIsNull = (str)->str==null;
	
	static Predicate<String> CheckStrLenEqZero = (str)->str.length()==0;

	static Predicate<String> CheckStrLenGtThan5 = str->str.length()>5;
	
	static BiPredicate<String, Integer> CheckStringGtThan = (str, i)-> str.length()>i;
	
	public static void main(String[] args) {
		
		//check str is not null
		System.out.println(CheckStrIsNull.negate().test("ABC"));
		
		//Check String is not null and length is not zero
		System.out.println(CheckStrIsNull.negate().and(CheckStrLenEqZero).negate().test(""));
		
		//Check String length is zero or gt than 5
		System.out.println(CheckStrLenEqZero.or(CheckStrLenGtThan5).test("nn"));
		
		//Check String gt than n
		System.out.println(
				CheckStringGtThan.test("Sabyasa", 4)
		);
		
	}

}
