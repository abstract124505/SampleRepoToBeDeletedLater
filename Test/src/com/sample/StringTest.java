package com.sample;

public class StringTest {

	public static void main(String[] args) {
	 
		System.out.println("i am going to test the Strings");
		String s1 = "deepak";
		String s2 = new String("deepak");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.hashCode()==s2.hashCode());
   
	}

}
