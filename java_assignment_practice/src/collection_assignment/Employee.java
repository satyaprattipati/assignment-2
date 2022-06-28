package collection_assignment;

import java.util.Comparator;

class idComp implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class nameComp implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class depComp implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		return o1.getDepartments().compareTo(o2.getDepartments());
	}

}

class salaryComp implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}

	}

}