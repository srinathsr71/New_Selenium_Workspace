package Strings;

public class revstruppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java assignment";
		char[] rev=new char[str.length()];
		int len=str.length()-1;
		for(int i=0;i<=len;i++) {
			rev[i]=str.charAt(len-i);
		}
		System.out.println(String.valueOf(rev).toUpperCase());
	}

}
