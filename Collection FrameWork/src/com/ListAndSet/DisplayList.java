package com.ListAndSet;

import java.util.ArrayList;
import java.util.List;

public class DisplayList {
public static void main(String[] args) {
List<Integer> li= new ArrayList();

li.add(4);
li.add(9);
li.add(2);
li.add(6);
li.add(43);
li.add(8);
li.add(12);
li.add(4);
li.add(43);

System.out.println("List Displayed without using loop");
System.out.println(li);

System.out.println();

System.out.println("List Displayed using loop");
for (Object obj : li) {
	System.out.println(obj);
}
}
}
