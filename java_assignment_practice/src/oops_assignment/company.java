package oops_assignment;

abstract class employee {
	abstract public void salary();
}

class manager extends employee {
	int manager_salary, incentive;

	public manager(int sal, int incentive) {
		this.manager_salary = manager_salary;
		this.incentive = incentive;
	}

	public void salary() {
		System.out.println("Manager Salary:" + (manager_salary + incentive));
	}

	public int get() {
		return manager_salary + incentive;
	}
}

class labour extends employee {
	int overtime;
	int labour_salary;

	public labour(int labour_salary, int overtime) {
		this.labour_salary = labour_salary;
		this.overtime = overtime;
	}

	public void salary() {
		System.out.println("Labour Salary:" + (labour_salary + overtime));
	}

	public int get() {
		return labour_salary + overtime;
	}
}

public class company {
	public static void main(String[] args) {
		manager m = new manager(5000, 1000);
		labour l = new labour(2500,500);
		m.salary();
		l.salary();
		int totalSalary = m.get() + l.get();
		System.out.println("Total Salary of all employees: " + totalSalary);
	}
}