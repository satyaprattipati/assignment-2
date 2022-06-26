package String_assignment;

public class string_3{

	public static void main(String[] args) {

		  
		String name1="java string pool refers to the collection of"
				+ " strings which are stored in heap memory";
		String name2=name1.toUpperCase();                     //Uppercase
		System.out.println("Uppercase :"+name2);
		
		
		String name3=name2.toLowerCase();                    //Lowercase
		System.out.println("Lowercase :"+name3);


		
		String replace=name1.replace('a','$');                   //replace a with $
		System.out.println("Replaced_string : "+replace);

		
		if(name1.contains("collection"))                             //contains
		{
			System.out.println( "found in string");
		}
		else{
			System.out.println("not found in string");
		}


		
		System.out.print("Return Value :" );                      //matches
		System.out.println(name1.matches("java string pool refers to the collection"
				+ " of strings which are stored in heap memory"));
		 //or//

		if (name1==name1) {                // logic
			System.out.println("match");
		}else
		{
			System.out.println("not match");
		}
	}

}
