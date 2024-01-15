package javaprogramspractice;

public class missingnumberinarray {

	
public static void main(String args[]) {
	int a[]= {1,2,4,5};
	int sum=0;
	int n=a.length;
	int total=(n+1)*(n+2)/2;
	for(int i=0;i<n;i++) {
		sum=sum+a[i];		
	}
	int missing=total-sum;
	System.out.println(missing);
	
}
}
