package comcapgemini.trainingsession.Lab9;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;




public class EmployeeRepository {

	private static List<Employee> employeeList;

	static {
		prepareEmployeeList();
	}

	private static void prepareEmployeeList() {
		employeeList = new ArrayList<>();
		Departmant d1 = new Departmant(1, "ECE", 1);
		employeeList.add(
				new Employee("Shiva", "singh ", "cfz", "444238", LocalDate.of(11, 06, 07), "CEO", 6000, 01, d1));
		Departmant d2 = new Departmant(2, "EE", 2);
		employeeList.add(
				new Employee("Sudha", "Tripathi", "sac", "13445", LocalDate.of(20, 03, 04), "Manager", 17000, 02, d2));
		Departmant d3 = new Departmant(3, "", 3);
		employeeList.add(
				new Employee("Sumedh", "kumar", "etd", "12373", LocalDate.of(2020, 02, 07), "Peon", 5000, 03, d3));
		

	}
	
	public static List<Employee> getEmployeeList() {
		return employeeList;
	}
}