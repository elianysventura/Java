/**************************************************************
 * Purpose/Description:This tests the findDominant method
 * Certification:I hereby certify that this work is my own and none of it is 
 * the work of any other person.***********************************************
 ***************/
package cop3530.a1.p1;

/**
 * Class that Test the findDominant method
 *
 * @author elianys
 */
public class Tester {

    public static void main(String[] args) {
        COP3530A1P1 p1 = new COP3530A1P1();//Creates object

        int a[] = {16, 17, 4, 3, 5, 2};//Creates array
        int n = a.length;//Variable n is the length of the array

        p1.findDominant(a, n);/*Uses the findDominant method to get the dominant
        numbers of the array*/

    }
}
