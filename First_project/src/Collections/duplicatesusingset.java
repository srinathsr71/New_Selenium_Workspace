package Collections;

import java.util.HashSet;
import java.util.Set;

public class duplicatesusingset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="assingment";
		Set<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			Character ch=str.charAt(i);
			if(set.contains(ch)) {
				System.out.println(ch);
			}else {
				set.add(ch);
			}
		}

	}

}
