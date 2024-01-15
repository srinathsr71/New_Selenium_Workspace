package Collections;

import java.util.HashMap;

public class Frequencycharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java Collections";
		HashMap<Character,Integer> map=new HashMap();
		for(int i=0;i<str.length();i++) {
			Character ch=str.charAt(i);
			if(ch != ' ') {
				if(map.containsKey(ch)) {
					int count=map.get(ch);
					map.put(ch, count+1);
				}
				else {
					map.put(ch,1);
				}
			}
		}
		System.out.println("Given string=" + str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ' && map.get(str.charAt(i))!= -1) {
				System.out.println(str.charAt(i) + " - " + map.get(str.charAt(i)));
				map.put(str.charAt(i), -1);
			}
		}
	}

}
