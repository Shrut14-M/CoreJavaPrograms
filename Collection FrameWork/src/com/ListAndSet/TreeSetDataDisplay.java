package com.ListAndSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDataDisplay {
public static void main(String[] args) {
	TreeSet<Integer> integer= new TreeSet();
	integer.add(5);
	integer.add(46);
	integer.add(12);
	integer.add(76);
	integer.add(1);
	integer.add(5);
	
//	System.out.println("Data displayed in Ascending order "+ t);
	
Iterator<Integer> it= integer.iterator() ;      //Iterator interface doesn't extend any interface.
while(it.hasNext()) {     //hasNext checks if there is next element in the collection.
	int data=it.next();  /*.next() retrieves the next value from the collection and stores 
	                        it in the data variable.                                                           */
	System.out.println(data);
	
}

}
}
