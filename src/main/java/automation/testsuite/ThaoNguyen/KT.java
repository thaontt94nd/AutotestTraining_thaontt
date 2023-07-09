package automation.testsuite.ThaoNguyen;

public class KT extends Employee {
	public int salary;

	@Override
	public int salary() {
		// TODO Auto-generated constructor stub
		return salary = super.getBasic_salary()*2;
	}
	@Override
	public String print() {
		return super.print() + ", Salary: " + this.salary;
	}

}