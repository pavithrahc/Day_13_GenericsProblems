/**
 * 
 */
package com.bridgelabz;

/**
 * @author PAVITHRA C
 *
 */
public class FindTheMaxInterger {

	/**
	 * @param args
	 */
public static Integer compareTo(Integer num1, Integer num2, Integer num3) {
		
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub			
			FindTheMaxInterger integer = new FindTheMaxInterger();
			
			System.out.println("max Number for 1st test case=" + integer.compareTo(5, 3, 2));
	}

}
