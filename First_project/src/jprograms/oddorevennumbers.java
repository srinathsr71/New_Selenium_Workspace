package jprograms;

public class oddorevennumbers {
public static void main(String args[]) {
	int arr[]= {2,6,7,8,5,9,3,4};
	int n=0;
	int b=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			System.out.println("odd numbers:"+arr[i]);
			//n=n+arr[i];
		}
	}
	System.out.println("addition of odd numbers:"+n);
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println("even numbers:"+arr[i]);
			b=b+arr[i];
		}
	}
	System.out.print("addition of even numbers:"+b);
}
}