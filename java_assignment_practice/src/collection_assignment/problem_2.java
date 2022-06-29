package collection_assignment;

import java.util.HashSet;

public class problem_2  {
  
public static void main(String[] args) {
      product x1=new product("Mumbai");
      product x2=new product("Banglore");
      product x3=new product("Pune");
      product x4=new product("Hyderabad");
      HashSet<product> no_duplicate=new HashSet<product>();
      no_duplicate.add(x1);
      no_duplicate.add(x2);
      no_duplicate.add(x3);
      no_duplicate.add(x4);
      
      no_duplicate.add(x2);
      System.out.println(no_duplicate);

  }
}
