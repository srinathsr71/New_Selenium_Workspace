package javaprogramspractice;

public class removewhitespaces {
	
public static void main(String args[]) {
	String se="learn java programming";
	String se1="";
	for(int i=0;i<se.length();i++) {
		if(se.charAt(i)!=' ') {
			se1=se1+se.charAt(i);
		}
	}
	System.out.println(se1);
	
}

}
