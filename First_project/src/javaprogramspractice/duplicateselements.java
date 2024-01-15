package javaprogramspractice;

public class duplicateselements {

	public static void main(String args[]) {
		
		int a[]= {5,8,8,9,4,7,3,5,3,8,7,5,5,6,9,22,1,55,8,99,77,66,77,9,99,45,55,44,22,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[j] + " ");
				}
			}
		}
		
	}
}
