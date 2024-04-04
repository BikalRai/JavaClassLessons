package streams;

public class Person {
	private String name;
	private int age;
	private Gender gender;
	
	Person () {
		
	};
	
	Person (String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public Gender getGender () {
		return this.gender;
	}
	
	
	
	@Override
	public String toString () {
		return "[Name: " + name + ", Age: " + age + ", Gender: " + gender+ "]";
	}
	
	
	

}
