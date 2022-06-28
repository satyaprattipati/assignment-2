package Generic_assignment;

import java.util.HashMap;
import java.util.Map;

public class problem_2{
	
	public static void main(String args[]) {
		
		Map<Integer,Double>Map=new HashMap<>();
		Map.put(22 , 3.1d);
		Map.put(11 , 2.1d);
		Map.put(38, 32.1d);
		Map.put(21 , 42.8d);
		Map.put(52 , 52.2d);
		Map.put(99 , 33.1d);
		Map.put(13 , 21.1d);
		Map.put(43, 30.1d);
		Map.put(20 , 2.8d);
		Map.put(59 , 5.2d);
		System.out.println("HASH-MAP VALUES :");
		for(Map.Entry m:Map.entrySet()) {
			System.out.println(m.getKey()+ " : "+m.getValue());
		}
	}
}
