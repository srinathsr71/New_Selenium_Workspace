package Strings;

import java.util.Arrays;

public abstract class TwostringsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Apple";
		String str2="ppleA";
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(String.valueOf(arr1).equals(String.valueOf(arr2))) {
			System.out.println("Anagram String");
			
		}else {
			System.out.println("not Anagram String");
		}

	}

}
