package comcapgemini.trainingsession.Lab9;
import java.time.LocalDate;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeOperation {
public static void main(String[] args) {
//	System.out.println("List of the Candidates:");
//	List<Employee> Candidates = EmployeeRepository.getEmployeeList().stream().reduce();
	
	
	// Summing the salaries
	double sum_Salary=EmployeeRepository.getEmployeeList().stream().collect(Collectors.summingDouble(Employee::getSalary));
	System.out.println(sum_Salary);
	
	// department names with count of employees
	Map<String, List<Employee>> list = EmployeeRepository.getEmployeeList().stream().collect(Collectors.groupingBy((t)->t.getDepartment().getDept_name()));
	for (String string : list.keySet()) {
		System.out.println(string + list.get(string).size());
	}
	
	// Oldest employee
	Optional<Employee> old = EmployeeRepository.getEmployeeList().stream().collect(Collectors.minBy(Comparator.comparing(Employee::getHiredate)));
	System.out.println(old.get().getFirstname());
	
	// Employee names with duration
	
	List<Employee> e1=EmployeeRepository.getEmployeeList();
	for (Employee employee : e1) {
		System.out.println(employee.getFirstname() + " " + ChronoUnit.MONTHS.between(employee.getHiredate(), LocalDate.now()));
	}
	
	// employee without department
	System.out.println("Employee without department");
	 EmployeeRepository.getEmployeeList().stream().filter((employee)->employee.getDepartment().getDept_name().equals("")).collect(Collectors.toList()).forEach(System.out::println);
	 
	 
	//Find out department without employees.
	 
	 List<Employee> e = EmployeeRepository.getEmployeeList().stream().filter((employee)->employee.getDepartment().equals(null)).collect(Collectors.toList());
		System.out.println(e.size());
		
		//14.12 Find departments with highest count of employees.
		
		Map<String, List<Employee>> map = EmployeeRepository.getEmployeeList().stream().collect(Collectors.groupingBy((employee)->employee.getDepartment().getDept_name()));
		int max = 0;
		String department ="";
		for (String string : map.keySet())
			if(map.get(string).size() > max) {
				max = map.get(string).size();
				department = string;
			}
		System.out.println(max);
		
		// List employee name, hire date and day of week on which employee has started.
		
//		EmployeeRepository.getEmployeeList().stream().forEach((employee)->{
//			System.out.println(employee.getFirstname());
//			System.out.println(employee.getHiredate());
//			System.out.println(employee.getHiredate().getDayOfWeek());
//		});
		List<Employee> people= EmployeeRepository.getEmployeeList();
		for (Employee employee : people) {
			System.out.print(employee.getFirstname());
			System.out.print(employee.getLastname());
			System.out.print(employee.getHiredate());
			System.out.print(employee.getHiredate().getDayOfWeek());
			System.out.println();
		}
		//14.14
		
		List<Employee> listupdate=  EmployeeRepository.getEmployeeList().stream().filter((employee)->employee.getHiredate().getDayOfWeek().toString().equals("FRIDAY")).collect(Collectors.toList());

		
		System.out.println(listupdate.size());
		for (Employee employee : listupdate) {
			System.out.println(employee.getFirstname());
		}
		
		//14.15
		
		
		
		//14.16
		List<Employee> emp=EmployeeRepository.getEmployeeList().stream().collect(Collectors.toList());
		for ( Employee employee : emp) {
			System.out.println("Name:"+employee.getFirstname()+" Salary hiked:"+employee.getSalary()*1.15);
		}
		
		//14.17
		
		EmployeeRepository.getEmployeeList().stream().filter(em->em.getManager_Id()==null).forEach(System.out::println);

		//14.18
		String userInput = "Shiva";
		Employee managerEmployee = EmployeeRepository.getEmployeeList().stream().filter((em1)->em1.getFirstname().equals(userInput)).findFirst().get();
		EmployeeRepository.getEmployeeList().stream().filter((em1)->
			em1.getManager_Id().equals(managerEmployee.getEmpid())).collect(Collectors.toList()).forEach(System.out::println);;
		
		//14.19
}
}
