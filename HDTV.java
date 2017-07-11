//Assignment 9.3
//Write a program to create a class HDTV with the properties:
//Brand name
//Size
//Create Another class having an ArrayList and add 3 objects of HDTV into it.
//Expected Output
//Display HDTV objects in sorted order of size (Use Comparator)


//Comparator can be used if you want to compare objects based on certain attributes/fields.
//For example, 2 persons can be compared based on `height` or `age` etc.
//Both Collections and Arrays classes provide a sort method which use a Comparator.


package assignment_9_3;
import java.util.Comparator;
	
	 
	class HDTV {
		int size;
		private String brandname;
	 
		public HDTV(int size, String brandname) {
			this.size = size;
			this.brandname = brandname;
		}
	 
		public int getSize() {
			return size;
		}
	 
		public void setSize(int size) {
			this.size = size;
		}
	 
		public String getBrandname() {
			return brandname;
		}
	 
		public void setBrand(String brand, String brandname) {
			this.brandname = brandname;
		}
	}
	 
	class SizeComparator implements Comparator<HDTV> {
		@Override
		public int compare(HDTV tv1, HDTV tv2) {
			int BrandSize1 = tv1.getSize();
			int BrandSize2 = tv2.getSize();
	 
			if (BrandSize1 > BrandSize2) {
				return 1;
			} else if (BrandSize1 < BrandSize2) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	 
	


