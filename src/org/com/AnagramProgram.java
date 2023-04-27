package org.com;

import java.util.Arrays;

public class AnagramProgram {

public static void main(String[] args) {
	
String s = "Heart";
String s1 = "Earth";


String ss = s.toLowerCase();
String ss2 = s1.toLowerCase();
	
	
if (ss.length()==ss2.length()) {
	
char[] charArray = s.toCharArray();
char[] charArray2 = ss2.toCharArray();


Arrays.sort(charArray);
Arrays.sort(charArray2);
boolean equals = Arrays.equals(charArray, charArray2);

//System.out.println(equals);


if (equals) {
	System.out.println("this is anagram");
}else {
	System.out.println("this is not a anagram");
}

}

else {
	System.out.println("this out of range");
}

	
}	
	
	
}
