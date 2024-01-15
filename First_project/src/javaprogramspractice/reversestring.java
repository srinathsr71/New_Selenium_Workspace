package javaprogramspractice;

public class reversestring {
	
	
	public static void main(String args[]) {
		String s="srinath";
		String se="";
		for(int i=s.length()-1;i>=0;i--) {
			se=se+s.charAt(i);
			
		}
		System.out.println(se);
		
		
	}

}
