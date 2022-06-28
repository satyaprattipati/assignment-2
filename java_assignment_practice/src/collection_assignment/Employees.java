package collection_assignment;

class Employees {
	private String name;
	private int id;
	private double salary;
	private String departments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	public Employees(String name, int id, double salary, String departments) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", departments=" + departments + "]";
	}

}
