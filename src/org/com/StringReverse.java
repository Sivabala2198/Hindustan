package org.com;

public class StringReverse {

public static void main(String[] args) {
	
String s = "java";

String output = "";

for(int i=s.length()-1;i>0;i--) {

char charAt = s.charAt(i);	


output = output+charAt;
System.out.println(output);

}
	
	
	
}	
	
}
