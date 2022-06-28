package collection_assignment;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class problem_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose your sorting category");
		System.out.println("1.name  2.id  3.salary   4.D1epartment");
		int choose = scanner.nextInt();

		Set<Employees> s = null;
		if (choose == 1) {
			s = new TreeSet<>(new nameComp());
		} else if (choose == 2) {
			s = new TreeSet<>(new idComp());
		} else if (choose == 3) {
			s = new TreeSet<>(new salaryComp());
		} else if (choose == 4) {
			s = new TreeSet<>(new depComp());
		}
		s.add(new Employees("Satya", 100, 80000, "Dev"));
		s.add(new Employees("Veera", 101, 70000, "HR_T"));
		s.add(new Employees("venkata", 120, 60000, "Mg"));
		s.add(new Employees("Geetha", 110, 90000, "Mg"));
		s.add(new Employees("Niha", 222, 20000, "dev"));
		for (Employees temp : s) {
			System.out.println(temp);

		}

	}

}
