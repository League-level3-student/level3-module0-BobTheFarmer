/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import javax.swing.JOptionPane;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        
    	
    		
    	//Find all Ws
    		for (int i = 0; i < field.length; i++) {
    			for (int j = 0; j < field[i].length; j++) {
    				if(field[i][j] == 'w') {
				
		//Find adjacent Os and save in booleans (also, do not include ones that are two close for full cow)
    		boolean oUp = false;
    		boolean oDown = false;
    		boolean oLeft = false;
    		boolean oRight = false;
    		
    		if(i!=1 && field[i][j+1]=='o') {
				oUp = true;
			}
    		if(i!=field[i].length-2 && field[i][j-1]=='o') {
				oDown = true;
			}
			if(i!=1 && field[i-1][j]=='o') {
				oLeft = true;
			}
			if(i!=field.length-2 && field[i+1][j]=='o') {
				oRight = true;
			}
			//WORKING ON THIS
			//Wrong way cow is cow that is diffrent direction; make a tally of directions and keep the first of each; whichever is 1 use direction to get c pos 
			} } }
        return null;
    }
}
