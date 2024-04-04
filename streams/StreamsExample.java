package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {
	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Bikal", 39, Gender.MALE),
				new Person("Sanuri", 25, Gender.FEMALE), new Person("Tom", 23, Gender.MALE),
				new Person("Diana", 15, Gender.FEMALE), new Person("Tina", 12, Gender.FEMALE),
				new Person("Sally", 10, Gender.FEMALE), new Person("Dick", 33, Gender.MALE),
				new Person("Gina", 55, Gender.FEMALE), new Person("Gina", 55, Gender.FEMALE),
				new Person("Tina", 12, Gender.FEMALE));

		people.forEach(System.out::println);

		System.out.println(people.stream().min(Comparator.comparing(p -> p.getAge())));
		System.out.println(people.stream().max(Comparator.comparing(p -> p.getAge())));

		System.out.println(people.stream().anyMatch(p -> p.getName().equals("Tom")));

		System.out.println(people.stream().filter(p -> p.getAge() < 20).findFirst());

		System.out.println();
		System.out.println("Sorted");
		people.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
		System.out.println();
		people.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
		System.out.println();

		System.out.println("Distinct failed: ");
		people.stream().distinct().collect(Collectors.toList()).forEach(p -> System.out.println(p));

		System.out.println();
		
		System.out.println("Filtering: ");
		people.stream().filter(p -> p.getAge() < 22).forEach(System.out::println);
		
		System.out.println("Mapping");
		people.stream().map(p -> p.getAge()).forEach(System.out::println);
		System.out.println();
		people.stream().map(p -> p.getAge() > 30).forEach(System.out::println);
		
		System.out.println();
		Map <Gender, List<Person>> groupedByGender = people.stream()
				.collect(Collectors.groupingBy(Person::getGender));
		
		groupedByGender.forEach((gender, group) -> {
			System.out.println(gender);
			group.forEach(System.out::println);
		});
		
		System.out.println();
		System.out.println("Names to uppercase");
		people.stream().map(Person::getName).map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Reversing after sorting:");
		people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);
		System.out.println();
		people.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
	}

}
