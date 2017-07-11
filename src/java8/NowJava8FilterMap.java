package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8FilterMap {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("devang", 26), new Person("manan", 24),
				new Person("dishant", 22), new Person("divya", 24));

		String name = persons.stream().filter(x -> "devang".equals(x.getName())).map(Person::getName).findAny()
				.orElse("");
		// convert stream to String

		System.out.println("name : " + name + "\n");

		List<String> collect = persons.stream().map(Person::getName).collect(Collectors.toList());

		collect.forEach(System.out::println);

	}

}
