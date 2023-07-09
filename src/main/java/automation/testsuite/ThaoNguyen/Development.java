package automation.testsuite.ThaoNguyen;

public class Development extends Employee {
	public int salary;
	@Override
	public int salary() {
		return salary = super.getBasic_salary() + (super.getBasic_salary()*2)+(super.getOvertime()*((super.getBasic_salary() + (super.getBasic_salary()*2)/22)/8));
	}
	
	@Override
	public String print() {
		return super.print() + ", Salary: " + this.salary;
	}
	
}