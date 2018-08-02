package Employee;

import java.util.Scanner;

public class employeebase {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		num = sc.nextInt();
		employee emp1[] = new employee[num];
		
		//To get inputs from user
		for (int i = 0; i < num; i++) {
			emp1[i] = new employee();
			System.out.println("Enter id");
			String id = sc.next();
			emp1[i].setId(id);
			System.out.println("Enter salary");
			int salary = sc.nextInt();
			emp1[i].setMonthlyBasic(salary);
			System.out.println("Enter name");
			String name = sc.next();
			emp1[i].setName(name);
		}

		for (int i = 0; i < num; i++) {
			System.out.println("Employee Id: " + emp1[i].getId());// to print the id
			System.out.println("Employye Name: " + emp1[i].getName());// to print the name
			System.out.println("Annual Basic: " + emp1[i].getAnnualBAsic());// to get the basic annual salary
			System.out.println("Monthly Gross Salary: " + emp1[i].getMonthlyGrossSalary());// to get the monthly gross
																							// salary
			System.out.println("Annual Gross Salary: " + emp1[i].getAnnualGrossSalary());// to get the annual gross
																							// salary
			System.out.println("Monthly Deductions: " + emp1[i].getMonthlyDeductions());// to get monthly salary
																						// deduction
			System.out.println("Monthly Take Home: " + emp1[i].getMonthlyTakeHome());// amount that employee get monthly
																						// in hand
			System.out.println("Annual Take Home: " + emp1[i].getAnualTakeHome());// amount that employee get annualy in
																					// hand
		}
		sc.close();
	}

}
