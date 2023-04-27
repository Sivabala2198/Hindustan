package org.com;

public class DifferenceOfEquals {

public static void main(String[] args) {

String s = "java";
String s1 = "java";

String s2 = new String("java");
String s3 = new String("java");

String s4 = "java";

System.out.println(s==s1);
System.out.println(s==s2);
System.out.println(s.equals(s2));

	
	
}	
	
}
