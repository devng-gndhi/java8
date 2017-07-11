package java8;

import java.util.Arrays;
import java.util.List;

public class NowJava8MultipleCondition {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("devang", 26), new Person("manan", 24),
				new Person("dishant", 22), new Person("divya", 24));

		Person result1 = persons.stream().filter((p) -> "devang".equals(p.getName()) && 26 == p.getAge()).findAny()
				.orElse(null);

		System.out.println("result 1 :" + result1.getName() + " ===> " + result1.getAge());

		// or like this
		Person result2 = persons.stream().filter(p -> {
			if ("divya".equals(p.getName()) && 24 == p.getAge()) {
				return true;
			}
			return false;
		}).findAny().orElse(null);

		System.out.println("result 2 :" + result2);

	}

}
