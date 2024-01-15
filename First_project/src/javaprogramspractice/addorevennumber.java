package javaprogramspractice;

public class addorevennumber {

public static void main(String args[]) {
	int ar[]= {2,3,6,5,8,9};
	int s=0;
	int b=0;
//printing odd numbers
	for(int i=0;i<ar.length;i++) {
		if(ar[i]%2!=0) {
			System.out.println("odd numbers:"+ar[i]);
			s=s+ar[i];
			
		}

	}
	System.out.println("addition of odd numbers:"+s);

//printing even numbers
	for(int i=0;i<ar.length;i++) {
		if(ar[i]%2==0) {
			System.out.println("even numbers:"+ar[i]);
			b=b+ar[i];
		}
	}
	System.out.println("addition of even numbers:"+b);
}	
}
