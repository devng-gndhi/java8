package java8;

import java.util.Arrays;
import java.util.List;

public class BeforeJava8Person {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("devang", 26), new Person("manan", 24),
				new Person("dishant", 22), new Person("divya", 24));

		Person result = getStudentByName(persons, "manan");
		System.out.println(result.getName() + "  ===>  " + result.getAge());

	}

	private static Person getStudentByName(List<Person> persons, String name) {

		Person result = null;
		for (Person temp : persons) {
			if (name.equals(temp.getName())) {
				result = temp;
			}
		}
		return result;
	}
}
