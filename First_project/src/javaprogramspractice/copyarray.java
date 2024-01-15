package javaprogramspractice;

public class copyarray {
	
	public static void main(String args[]) {
		int a[]= new int[]{56,36,45,12,3};
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+ " ");
		}
		
	}

}
