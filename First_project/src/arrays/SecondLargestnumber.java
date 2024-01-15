package arrays;

public class SecondLargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ma[]= {12,34,45,32,7,25};
		int size=ma.length;
		int temp;
		System.out.println("Total size of the array is"+"="+size);
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(ma[i]<ma[j]) {
				temp=ma[i];
				ma[i]=ma[j];
				ma[j]=temp;
			}
		}
		}
		System.out.println("the second largest number in an array is"+"="+ma[2]);		
	}
}
