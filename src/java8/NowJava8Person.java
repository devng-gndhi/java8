package java8;

import java.util.Arrays;
import java.util.List;

public class NowJava8Person {
	public static void main(String[] args) {

			List<Person> persons = Arrays.asList(new Person("devang", 26), new Person("manan", 24),
				new Person("dishant", 22));

		Person result1 = persons.stream() // Convert to steam
				.filter(x -> "dishant".equals(x.getName())) // we want "dishant" only
				.findAny() 									// If 'findAny' then return found
				.orElse(null); 								// If not found, return null

		System.out.println(result1.getName() + " ===> " + result1.getAge());

		Person result2 = persons.stream().filter(x -> "divya".equals(x.getName())).findAny().orElse(null);
		System.out.println(result2);

	}
}
