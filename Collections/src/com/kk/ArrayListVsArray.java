package com.kk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.List;

public class ArrayListVsArray {

	static List<String> storeList = new ArrayList<String>();

	public static void main(String[] args) {

		removeItemFromListWhileReading();
	}
	
	/**
	 * Method to print list in fwd, bwd direction
	 * Used ListIterator for it
	 * We can use Collections reverse as well to revert
	 */
	public static void printListInForwardAndBackwardDirection()
	{
		storeList.add("Kalyan");
		storeList.add("Raju");
		storeList.add("Sanvi");
		System.out.println(storeList.size());

		ListIterator<String> litr = storeList.listIterator();

		// static void reverse(List list) method reverses the order of elements of the
		// specified list.
		// Collections.reverse(storeList);

		System.out.println("Traversing the list in forward direction:");
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("\nTraversing the list in backward direction:");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
	
	public static void removeItemFromListWhileReading()
	{
		storeList.add("Kalyan");
		storeList.add("Raju");
		storeList.add("Sanvi");
		System.out.println(storeList.size());

		ListIterator<String> litr = storeList.listIterator();

		
		while (litr.hasNext()) {
			String val = litr.next();
			
			if(val.equals("Kalyan"))
			{
				litr.remove();
			}
			System.out.println(val);
		}
		
		System.out.println(storeList.size());
	}

}
