package com.string;

public class MethodsOfString {
	
		public static void main(String[] args) {
			String s = "hello";
			String s1 = "Hii";

			System.out.println(s.length());
			System.out.println(s.startsWith("hl"));
			System.out.println(s.equals(s1));
			System.out.println(s.charAt(3));
			System.out.println(s.concat(s1));
			System.out.println(s.contains("u"));
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
			System.out.println(s.trim());
			System.out.println(s.indent(3));
			System.out.println(s.strip());
			System.out.println(s.substring(3));
			System.out.println(s1.intern());

		}

	}
