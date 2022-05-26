/*
 * Test Java instructions
 */
package usinginstructions;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Test Java instructions
 * @author dan_r
 */
public class TestJavaInstructions {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// test if construction
		String intersection = "left";
		if("left".equals(intersection)){
			System.out.println("Go left!");
		}
		else{
		        System.out.println("Go right!");
                }
		// test switch instruction
		int value = 4;
		int otherValue = 2;
		switch(value+otherValue){
			case 3 -> System.out.println("value+otherValue = 3");
			case 6 -> System.out.println("value+otherValue = 6");
			default -> System.out.println("value+otherValue is not 3 or 6");
		}
		// test do-while instruction 
		int counter = 0;
		do{
			System.out.println("counter = "+counter);
			counter = counter +1; // could be also written counter++
	
	        }while(counter < 5);
		// test while instruction
		int decreaser = 5;
		while(decreaser > 0){
		    System.out.println("decreaser = "+decreaser ); // it coult be written also decreaser--
		    decreaser = decreaser-1;
		}
		// test for instruction 
		for(int numberOfLoops = 0;numberOfLoops<5;numberOfLoops++){
			System.out.println("Loop number:"+numberOfLoops);
		}
		// test for instructions for collections
		LinkedList<Integer> listOfIntegers = new LinkedList<>();
		// add elements to new created collection - list of Integers
		boolean b = listOfIntegers.add(10);
		if (b == true)
		{
			boolean c = listOfIntegers.add(-2);
			if (c == true){
				boolean d = listOfIntegers.add(4);
				System.out.println("d=" +d);
			}
			
		}
		// display all elements of collection
		for (Integer currentElement : listOfIntegers) {
			System.out.println("Element value is:"+currentElement);
		}
	}
}