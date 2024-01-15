package javaprogramspractice;

public class primenumber {

	
	public static void main(String args[]) {
		int n=11;
		int temp=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				temp=temp+1;
				break;
			}
		}
		if(temp==0) {
			System.out.println("the number is prime");
		}else {
			System.out.println("the number is not a prime");
		}
	}
}
