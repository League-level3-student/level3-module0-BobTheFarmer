package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
		public static void main(String[] args) {
			String[] testArray = {"Dogs", "Cats", "1", "2", "3"};
			MoreArrayFun maf = new MoreArrayFun();
			maf.printStrings(testArray);
			maf.printStringsEveryOther(testArray);
			maf.printStringsReverse(testArray);
			maf.printStringsRandom(testArray);
		}
		Random rando = new Random();
    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
		void printStrings(String[] array) {
			for (String string : array) {
				System.out.println(string);
			}
		}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
		void printStringsReverse(String[] array) {
			for (int i = array.length-1; i>=0; i--) {
				System.out.println(array[i]);
			}
		}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
		void printStringsEveryOther(String[] array) {
			for(int i = 0; i<array.length; i+=2) {
				System.out.println(array[i]);
			}
		}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
		void printStringsRandom(String[] array) {
			System.out.println("Random Strings: ");
				
				for (int i = 0; i < array.length; i++) {
					int indexToPrint;
					indexToPrint = rando.nextInt(array.length);
					if(array[indexToPrint] == null) {
						--i;
						continue;
					}
					
					System.out.println(array[indexToPrint]);
					array[indexToPrint] = null;
				}
			
		
		}

}
