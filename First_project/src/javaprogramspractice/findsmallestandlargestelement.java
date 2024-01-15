package javaprogramspractice;

public class findsmallestandlargestelement {

//smallest element in an array
	public static void main(String args[]) {
		int m[]= {68,36,21,12,17,32};
		int min=m[0];
		for(int i=0;i<m.length;i++) {
			if(m[i]<min) {
				min=m[i];
			}

		}
		System.out.println(min);
		
		
//largest element in an array
		int ma[]= {12,99,57,21,569,74,11,10};
		int max=ma[0];
		for(int i=0;i<ma.length;i++) {
			if(ma[i]>max) {
				max=ma[i];
			}
		}
		System.out.println(max);
	}
}
