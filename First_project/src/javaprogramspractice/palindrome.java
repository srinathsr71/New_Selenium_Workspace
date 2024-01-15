package javaprogramspractice;

public class palindrome {
	
	public static void main(String args[]) {
	int n=225,sum=0,rem;//121 121 1234 212 9
	int temp=n;
	while(n>0) {
		rem=n%10;//225%10=5//2			   	
		sum=(sum*10)+rem;//sum=5//52//522
		n=n/10;//22//2//0
	}
	if(temp==sum) {
		System.out.println("number is palindrome");
	}else
	{
		System.out.println("the number is not a palindrome");
	}
	}

}
