package javaprogramspractice;

public class arrangeascendingorder {
	
	public static void main(String args[]) {
		int arr[]= {89,58,78,69,12,54,63,99};
		int temp=0;
//arranging numbers in ascending order
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("arrange numbers in ascending order:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");	
		}
		System.out.println("\n");
		
//arrangin nubers in descending order		
		System.out.println("arrange numbers in descending order:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i] +" ");
		}	
	}

}
