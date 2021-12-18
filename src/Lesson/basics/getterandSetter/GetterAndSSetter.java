package Lesson.basics.getterandSetter;

public class GetterAndSSetter {
	private int empId;
	private String name;
	private int age;
	private double salary;
	
	
	
	public GetterAndSSetter(int empId, String name, int age, double salary) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
