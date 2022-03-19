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
//WORKING ON DEBUGGING; FIGURE OUT OUT OF BOUNDS ERRORS WHEN RUNNING TEST
	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!

		int upTally = 0;
		int downTally = 0;
		int leftTally = 0;
		int rightTally = 0;
		int wrongWayCowDirectionInt = 0;

		// Stores most recent of each direction
		int[][] mostRecentPos = new int[2][4];

		// Find all Ws
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j] == 'w') {
					//System.out.println("W at: " + j + ", " + i);
					// Find adjacent OCs and save in tally + get most recent c pos for later

					if (j>1) {
						if (field[i][j - 1] == 'o') {
							if (field[i][j - 2] == 'c') {
							upTally++;
							mostRecentPos[0][0] = i;
							mostRecentPos[1][0] = j - 2;
						} }
					}
					if (j<field.length - 3) {
						if (field[i][j + 1] == 'o') {
							if (field[i][j + 2] == 'c') {
							downTally++;
							mostRecentPos[0][1] = i;
							mostRecentPos[1][1] = j + 2;
						} }
					}
					if (i>1) {
						if (field[i - 1][j] == 'o') {
							if (field[i-2][j] == 'c') {
							leftTally++;
							mostRecentPos[0][2] = i - 2;
							mostRecentPos[1][2] = j;
						} }
					}
					if (i<field[i].length - 3) {
						if (field[i + 1][j] == 'o') {
							if (field[i+2][j] == 'c') {
							rightTally++;
							mostRecentPos[0][2] = i + 2;
							mostRecentPos[1][2] = j;
						} }
					}

				}
			}
		}

		// Find wrong way cow by seeing which direction has only 1
		if (upTally == 1) {
			wrongWayCowDirectionInt = 0;
		}
		if (downTally == 1) {
			wrongWayCowDirectionInt = 1;
		}
		if (leftTally == 1) {
			wrongWayCowDirectionInt = 2;
		}
		if (rightTally == 1) {
			wrongWayCowDirectionInt = 3;
		}

		// Return c pos from mostRecentPos
		int[] returnCords = new int[2];
		returnCords[0] = mostRecentPos[1][wrongWayCowDirectionInt];
		returnCords[1] = mostRecentPos[0][wrongWayCowDirectionInt];
		JOptionPane.showMessageDialog(null, returnCords[0] + ", " + returnCords[1]);
		return returnCords;
	}
}
