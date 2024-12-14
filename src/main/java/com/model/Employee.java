package com.model;

public class Employee {
	private String name, gender;
	private int id, salary;

	public Employee() {

	}

	public Employee(String name, String gender, int id, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.salary = salary;
		System.out.println("Employee.Employee()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("Employee.setGender()");
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", id=" + id + ", salary=" + salary + "]";
	}

}
