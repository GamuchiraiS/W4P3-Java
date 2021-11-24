package testing;
import java.util.Scanner; 

public class W4P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables 
		int num;
		//instantiating Scanner 
		Scanner sc = new Scanner(System.in);
		//promt user for input 
		System.out.println("Please enter a number: ");
		num = sc.nextInt();
		PrimeNums pn = new PrimeNums(num); //instantiate
		//for when the user enters 0 or 1
		if(num == 1 || num == 0) {
			System.out.println(num + " is not a prime number");
		}
		//in case user enters negative number
		else if(num < 0) {
			System.out.println("Please enter a valid number");
		}
		else {
			System.out.println(num + " is a prime number");
		}
		pn.IsPrimeNum(num);
		sc.close();
		
	}

}
