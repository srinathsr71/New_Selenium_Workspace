package arrays;

public class smallestnumber {
	public static void main(String args[]) {	
	int m[]= {68,36,21,12,17,32};
	int min=m[0];
	for(int i=0;i<m.length;i++) {
		if(m[i]<min) {
			min=m[i];
		}

	}
	System.out.println("the smallest number in an array is"+" = "+min);

}
}