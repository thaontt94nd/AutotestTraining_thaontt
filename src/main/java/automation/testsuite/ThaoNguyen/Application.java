package automation.testsuite.ThaoNguyen;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Sum_salary_DEV=0,average_salary_DEV=0, Sum_salary_KT=0,average_salary_KT=0;
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter the company's employee number: ");
	     int n = scanner.nextInt();
	     Employee[] Employee = new Employee[n];
	     
	     
	     System.out.println("Enter imformation for employee:");
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter employee imformation:"+(i+1));
	            System.out.print("Select employee department (1 - Development, 2 -KT): ");
	            int choose = scanner.nextInt();
	            if (choose == 1) {
	            	Employee[i] = new Development();
	            } else if (choose == 2) {
	            	Employee[i] = new KT();
	            }
	            Employee[i].inputData();
	            Employee[i].salary();
	        }
	        System.out.println("Thông tin của các nhân viên trong công ty: ");
	        for (int i = 0; i < n; i++) {
	        	System.out.println(Employee[i].print());
	        }
	        //tính tổng lương của phòng ban
	        for (int i = 0; i < n; i++) {
	        	if (Employee[i].getDepartment().equals("Development")) {
	        		Sum_salary_DEV = Sum_salary_DEV + Employee[i].salary();
	        	}
	        	else {
	        		Sum_salary_KT = Sum_salary_KT + Employee[i].salary();
	        	}
	        }
	        System.out.println("Sum salary Development: "+ Sum_salary_DEV);
	        System.out.println("Sum salary KT: "+ Sum_salary_KT);
	        //tính lương trung bình
	        int count=0;
	        for (int i = 0; i < n; i++) {
	        	if (Employee[i].getDepartment().equals("Development")) {
	        		count++;
	        		average_salary_DEV=Sum_salary_DEV/count;
	        	}
	        	else {
	        		average_salary_KT=Sum_salary_KT/(n-count);
	        	}
	        }
	        System.out.println("Average salary Development: "+ average_salary_DEV);
	        System.out.println("Average salary KT: "+ average_salary_KT);
	        
	        System.out.println("The best staff: ");
	        //in ra nhân viên có mức lương cao hơn mức lương trung bình của phòng ban
	        for (int i = 0; i < n; i++) {
	        	if (Employee[i].getDepartment().equals("Development")) {
	        		if(Employee[i].salary()>average_salary_DEV) {
	        			System.out.println(Employee[i].print());
	        		}
	        	}
	        	else {
	        		if(Employee[i].salary()>average_salary_DEV) {
        			System.out.println(Employee[i].print());
	        		}
	        	}
	        }
	        //tính tổng chi phí trả lương cho nhân viên biết rằng có thêm khoản thưởng trung bình hàng tháng = 10% lương
	        int Sum_salary=0;
	        for (int i = 0; i < n; i++) {
	        	Sum_salary = Sum_salary + Employee[i].salary()+ 10*Employee[i].salary()/100;
	        }
	        System.out.println("Total cost of salary for employees "+ Sum_salary);
	        
	}
}