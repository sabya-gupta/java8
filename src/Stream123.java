import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream123 {

	public static void main(String[] args) {
		List<String> heroes = new ArrayList<String>();
		heroes.add("Shah rukh");
		heroes.add("Salman");
		heroes.add("Hrittik");
		heroes.add("Amir khan");
		
		List<String> upperCaseheroes = 
				heroes.stream().
				map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseheroes);

		long countHeroes = 
				heroes.stream().
				filter(s->s.length()>8).count();
		System.out.println(countHeroes);

		List<String> sortbylen = 
				heroes.stream().
				sorted((s1, s2)->s1.length()-s2.length()).collect(Collectors.toList());
		System.out.println(sortbylen);

		List<String> defsort = 
				heroes.stream().
				sorted().collect(Collectors.toList());
		System.out.println(defsort);

		Comparator<String> lencomp = (s1, s2)->s1.length()-s2.length();
		
		System.out.println(
				heroes.stream().min(lencomp).get()
		);
		
		System.out.println(
				heroes.stream().max(lencomp).get()
		);
		
		heroes.stream().forEach(s->System.out.println(s.toUpperCase()));
		heroes.stream().forEach(System.out::println);
		
		String[] heroArray = heroes.stream().toArray(String[]::new);
		System.out.println(heroArray);
		
		Stream<String> s= Stream.of(heroArray);
		
		
	}
}
