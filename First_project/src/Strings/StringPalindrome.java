package Strings;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Level";
		String rev = "";
		int len=str.length();
		for(int i=(len-1);i>=0;--i) {
			rev=rev + str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(str +" " +"is a palindrome");
		}else {
			System.out.println(str + "is not a palidrome");
		}

	}

}
