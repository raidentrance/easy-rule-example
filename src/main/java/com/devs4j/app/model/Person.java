/**
 * 
 */
package com.devs4j.app.model;

/**
 * @author maagapi
 *
 */
public class Person {
	private String name;
	private String middleName;
	private String lastName;
	private int age;

	public Person() {
	}

	public Person(String name, String middleName, String lastName, int age) {
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", middleName=" + middleName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
