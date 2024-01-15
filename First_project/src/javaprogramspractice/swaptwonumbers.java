package javaprogramspractice;

public class swaptwonumbers {

	public static void main(String args[]) {
		int a=45;
		int b=23;
		int temp;
		
		//with out using third variable.
		System.out.println("Before swapping:"+a + ","+b);
//		a=a+b;//45+23=68 a=68,b=23
//		b=a-b;//68-23=45,a=68,b=45
//		a=a-b;//68-45=23,a=23,b=45
//		
		//using third variable
		temp=a;//temp=23
		a=b;//23=23
		temp=b;//b=45
		System.out.println("after swapping:"+a + ","+b);
	}
}