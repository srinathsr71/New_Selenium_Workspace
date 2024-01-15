package javaprogramspractice;

public class countstring {

public static void main(String args[]) {
	String s="l earning java";
	System.out.println(s.length());
int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			count++;
		}
		
}
	System.out.println("count the number of characters:"+count);
}
}
