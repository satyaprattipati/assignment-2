package Generic_assignment;

import java.util.HashSet;

class employee {
	int id, salary;
	String name, dept;

	public employee(int id, String name, int salary, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "{ID: " + id + " Name: " + name + " Salary: " + salary + " Department: " + dept + "}";
	}

}

public class problem_1 {

	public static void main(String[] args) {

		HashSet<employee> act = new HashSet();

		employee e1 = new employee(101, "Satya", 50000, "Developer");
		employee e2 = new employee(102, "Ravi", 80000, "HR");
		employee e3 = new employee(103, "Kumar", 55000, "Developer");
		employee e4 = new employee(104, "Nawab", 90000, "Manager");

		act.add(e1);
		act.add(e2);
		act.add(e3);
		act.add(e4);
		for (employee e : act) {
			System.out.println(e.id + " " + e.name + " " + e.dept + " " + e.salary);
		}

	}
}
