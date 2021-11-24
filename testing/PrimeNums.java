/**
 * 
 */
package testing;

/**
 * @author gamuc
 *
 */
public class PrimeNums {
	public int num; 
	
	public PrimeNums(int n) {
		num = n;
	}
	
    //function to determine whether num is a prime
    //or not
    public boolean IsPrimeNum(int num)
    {
        //divides the num by i starting at 2 
        //For self: also Prime numbers > 1
        int i;
        for (i = 2; i < num; i++)
        {
            /*if statement to find out if the num
             * has a remainder equal to 0
             * If it does, return false
             * Meaning it is not a prime number
             */
            if (num % i == 0)
            {
                return false;
            }
        }
        /*returns true when i equals the number itself
         */
        if (i == num)
        {
            return true;
        }
        //Default: return false;
        return false;
    }
}
