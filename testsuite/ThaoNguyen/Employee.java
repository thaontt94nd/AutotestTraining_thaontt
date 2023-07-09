package automation.testsuite.ThaoNguyen;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Employee {
	private String name, phone, email,department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	private int id, age, overtime, Basic_salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public int getBasic_salary() {
		return Basic_salary;
	}

	public void setBasic_salary(int basic_salary) {
		Basic_salary = basic_salary;
	}
	Scanner sc = new Scanner(System.in);
	public void inputData() {
		System.out.print("name:");
		name = sc.nextLine();
//		System.out.print("phone:");
//		phone = sc.nextLine();
//		System.out.print("email:");
//		email = sc.nextLine();
		System.out.print("department:");
		department = sc.nextLine();
		System.out.print("id:");
		id = sc.nextInt();
//		System.out.print("age:");
//		age = sc.nextInt();
		System.out.print("Basic_salary:");
		Basic_salary = sc.nextInt();
		System.out.print("overtime:");
		overtime = sc.nextInt();
	}
	public String print() {
		return "ID: "+ this.id + ",name: "+ this.name
//				+  ",age: "+ this.age + ".phone: "+ this.phone+ ".email: "+ this.email
				+".Department: "+ this.department ; 
	}
	
	public abstract int salary();
}