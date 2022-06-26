package java_assignment_practice;



public class Armstrong {

	public static void main(String[] args) {
	
		for (int i=100; i<=999;i++) {
			int n=i,temp=n;
			int rem, res=0;
			
			
			while(n!=0) {
				rem=n%10;
				res=res+(rem*rem*rem);     
				
				n=n/10;
			}
			if (temp ==res) {
				System.out.println(i+"");
				
			}
		}

	}

}
