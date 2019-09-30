/**************************************************************
 * Purpose/Description:This program finds the dominant elements in an array
 * Author’s Panther ID:5652936
 * Certification:I hereby certify that this work is my own and none of it is 
 * the work of any other person.***********************************************
 ***************/
package cop3530.a1.p1;

/**
 * Class that finds the dominant elements of an array
 *
 * @author elianys
 */
public class COP3530A1P1 {

    /**
     * Class constructor
     */
    public COP3530A1P1() {
    }

    /**
     * Method to find the dominant elements in an array
     *
     * @param a is the array
     * @param n is the size of the array
     */
    public void findDominant(int a[], int n) {

        System.out.print(a[n - 1] + " ");/*The last element in the array is 
        always dominant*/
        int currentDominant = a[n - 1];/*The current dominant number is the last
        element in the array*/

        for (int index = n - 2; index >= 0; index--)/*Starting with the second to 
            last element, tansverse the array*/ {

            if (currentDominant < a[index])/*If the dominant number is less than
                the new number of the arry we are looking at*/ {
                currentDominant = a[index];//The new number is now dominant
                System.out.print(currentDominant + " ");//Prints the dominant #
            }
        }

    }
}
