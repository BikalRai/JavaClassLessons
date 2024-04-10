package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // means that this class is being mapped to the database, this class is special
@Table(name = "students")
public class Student {
	
	@Id // this id is to determine the primary key of the DB, where each table has one primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this annotation is used for the auto increment of values
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String studentName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "age")
	private int age;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String gender, int age) {
		this.id = id;
		this.studentName = name;
		this.gender = gender;
		this.age = age;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStudentName () {
		return this.studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setGender (String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "{Id: " + this.id + ", Name: " + this.studentName + ", Gender: " + this.gender + ", Age: " + this.age;
	}
	
}
