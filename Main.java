//Assignment 9.3
//Write a program to create a class HDTV with the properties:
//Brand name
//• Size
//Create Another class having an ArrayList and add 3 objects of HDTV into it.
//Expected Output
//Display HDTV objects in sorted order of size (Use Comparator)


package assignment_9_3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
			public static void main(String[] args) {
			HDTV tv1 = new HDTV(40, "Philips");
			HDTV tv2 = new HDTV(36, "LG");
			HDTV tv3 = new HDTV(44, "Panasonic");
			HDTV tv4 = new HDTV(42, "Samsung");
			HDTV tv5 = new HDTV(38, "Optonica");
			
	 
			ArrayList<HDTV> al = new ArrayList<HDTV>();
			al.add(tv1);
			al.add(tv2);
			al.add(tv3);
			al.add(tv4);
			al.add(tv5);
			
			//Sorting the objects using Comparator
			Collections.sort(al, new SizeComparator());
			for (HDTV a : al) {
				System.out.println(a.getBrandname());
			}
		}

}

//Comparator provides multiple sorting sequence. In other words, we can sort the collection
//on the basis of multiple elements such as id, name and price etc.
