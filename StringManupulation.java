package strings;

import java.util.Scanner;

public class StringManupulation {

	public static void main(String[] args) {
		
		// swap string
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st string");
        String str1=sc.next();
        System.out.println("enter the 2nd string");
        String str2=sc.next();
		//String str1 = "Hello";
		//String str2 = "Rakesh";
		System.out.println("Str1: " + str1 + " " + "Str2: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("Str1: " + str1 + " " + "Str2: " + str2);

		// count number of characters present in the string

		int count = 0;

		for (int z = 0; z <= str2.length() - 1; z++) {
			if (str2.charAt(z) != ' ') {
				count = count + 1;
			}
		}
		System.out.println("number of characters present in the string  " + count);

		// string convert to lower case
		

		String s1 = "Rakesh Nimmala Goud has a authority";
		System.out.println("length of the given string is " + s1.length());

		String s2 = s1.toLowerCase();
		System.out.println(s2);
		// string convert to upper case
		String s3 = s2.toUpperCase();
		System.out.println(s3);

		// Replace the letters in string

		String s4 = s1.replace('a', 'b');
		System.out.println(s4);

		// Reverse the string
		for (int a = s1.length() - 1; a >= 0; a--) {
			System.out.print(s1.charAt(a));
		}
		System.out.println();

		// number of words present in the string

		int count1 = 1;
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) == ' ') {
				count1 = count1 + 1;

			}
		}
		System.out.println("number of words present in the string is " + count1);

		// Remove duplicate characters in a string

		String s6 = " ";
		for (int i = 0; i < s1.length() - 1; i++) {
			char c = s1.charAt(i);
			if (s6.indexOf(c) == -1) {
				s6 = s6 + c;
			}

		}
		System.out.println("After removeing duplicate characters " + s6);

}
	
}
