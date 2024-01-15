package Strings;

import java.util.HashMap;

public class Repeatedcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java collections";
		HashMap<Character,Integer> charcountMap= new HashMap<Character,Integer>();
		char[] strarray=str.toCharArray();
		for(char c: strarray) {
			if(charcountMap.containsKey(c)) {
				charcountMap.put(c, charcountMap.get(c)+1);
			}else {
				charcountMap.put(c, 1);
			}
			
			}
		for(char c:strarray) {
			if(charcountMap.get(c)>1) {
				System.out.println("FirstRepeated Character in"+str+"'is'"+c+'"');
				break;
			}
			}
		}
		
		
	}


