/**************************************************************
 * Purpose/Description:This program verifies if elements of an array are the 
 * same when reversed
 * Author’s Panther ID:5652936
 * Certification:I hereby certify that this work is my own and none of it is 
 * the work of any other person.***********************************************
 ***************/
package cop3540.a1.p2;

/**
 * CLass that verifies if elements of an array are the same when reversed
 *
 * @author elianys
 */
public class COP3540A1P2 {

    /**
     * Class Constructor
     */
    public COP3540A1P2() {

    }

    /**
     * Method that recursively checks if elements of an array are the same when
     * reversed
     *
     * @param a is the array
     * @param first is the first element in the array
     * @param last is the last element in the array
     * @return
     */
    public boolean verify(int a[], int first, int last) {

        if (first == last)/*Trivial case, if the first index is also the last
            element, stop*/ {
            return true;/*Return true when the end of recursion is reached, 
            meaning that the array is the same when reversed*/
        }

        if (a[first] == a[last])/*If the element in the first index is equal
            to the element in the last index*/ {
            return verify(a, first + 1, last - 1);/*REcursive call to make move
            the first index forward 1 and last index backwards 1*/
        } else //If elements are not the same
        {
            return false;//Return false
        }

    }

}
