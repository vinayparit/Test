package Lambda;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

	String ename;
	int sal;

	Employee(String ename, int sal) {
		this.ename = ename;
		this.sal = sal;
	}

}

class Funct {
	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("A", 10000));
		empList.add(new Employee("B", 25000));
		empList.add(new Employee("C", 30000));
		empList.add(new Employee("D", 50000));

		Function<Employee, Integer> fn = e -> {
			int salary = e.sal;
			if (salary > 10000 && salary <= 20000)
				return (salary * 10 / 100);
			else if (salary > 20000 && salary <= 30000)
				return (salary * 20 / 100);
			else if (salary > 30000 && salary <= 50000)
				return (salary * 30 / 100);
			else
				return (salary * 40 / 100);
		};

		

		for (Employee emp : empList) {
			int bonus = fn.apply(emp); // calculated using Function
			Predicate<Integer> p = b -> b < 5000;
			if (p.test(bonus)) // Predicate
			{
				System.out.println(emp.ename + "  " + emp.sal);
				System.out.println("Bonus: " + bonus);
			}
		}

	}
}