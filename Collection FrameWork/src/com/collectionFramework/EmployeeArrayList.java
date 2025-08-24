package com.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class EmployeeArrayList {
public static void main(String[] args) {
Vector v= new Vector();
HashSet h= new HashSet();
TreeSet h = new TreeSet();
ArrayList Employee= new ArrayList();		
ArrayList list= new ArrayList();
list.add("Apurvav");
list.add("Nanded");
list.add("apurva1@gmail.com");
list.add("24LPA");
//Employee.add(list);

ArrayList list1= new ArrayList();
list1.add("Shruti");
list1.add("Baba Nagar");
list1.add("shrutimanoorkar1404@gmail.com");
list1.add("22LPA");
//Employee.add(list1);

ArrayList list2= new ArrayList();
list2.add("Bhavana");
list2.add("Sagroli");
list2.add("bhavanakotnod@gmail.com");
list2.add("21LPA");
Employee.add(list);
Employee.add(list1);
Employee.add(list2);

ArrayList HighPaidName = (ArrayList)Employee.get(0);
System.out.println(HighPaidName);

LinkedList l= new LinkedList();

}

}
