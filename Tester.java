/**************************************************************
 * Purpose/Description:This tests the verify method
 * Author’s Panther ID:5652936
 * Certification:I hereby certify that this work is my own and none of it is 
 * the work of any other person.***********************************************
 ***************/
package cop3540.a1.p2;

/**
 * Class that test the verify method
 *
 * @author elianys
 */
public class Tester {

    public static void main(String[] args) {
        COP3540A1P2 p2 = new COP3540A1P2();//Creates object
        int a[] = {2, 3, 32, 4, 3, 2};//Creates array
        int n = a.length;//Sets n to the length of the array

        if (p2.verify(a, 0, n - 1) == true)//If the method returns true
        {
            System.out.println("True");//Print out true
        } else//Else the method returns false
        {
            System.out.println("False");//Print out false
        }

    }
}
