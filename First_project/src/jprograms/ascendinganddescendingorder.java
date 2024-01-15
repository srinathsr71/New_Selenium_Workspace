package jprograms;

public class ascendinganddescendingorder {
	
	public static void main(String args[]) {
		//int a[]={23,56,71,11,13,15,16};//23,71,11,13,15//=110
//		int b[]=new int[a.length];	
//		for(int i=0;i<a.length;i++) {
//			b[i]=a[i];
//			System.out.print(a[i]+" ");
//		}
//		for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]+" ");
//		}
	
//	int i,j,temp,n;
//	for(i=2;i<=100;i++) {
//		temp=0;
//		for(j=2;j<i/2;j++) {
//			if(i%j==0) {
//				temp=1;
//				break;
//			}
//		}
//		if(temp==0) {
//			System.out.print(i+ " ");
//		}
//	}
		
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
















