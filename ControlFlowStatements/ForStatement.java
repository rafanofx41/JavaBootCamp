package ControlFlowStatements;

public class ForStatement {

	public static void main(String[] args) {
		System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		for (int i = 2; i < 9; i++) {
			System.out.println("10,000 at 2% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
		}
		
		for(int i = 8; i > 1; i--) {
			System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
		}
		
		int count = 0;
		
		for(int i = 10; i < 50; i++) {
			if(isPrime(i)) {
				count++;
				System.out.println("number " + i + " is a prime number");
				if(count == 3) {
					System.out.println("exiting loop");
					break;
				}
			}
		}

	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return(amount * (interestRate/100));
	}
	
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		for(int i=2; i<=(long) Math.sqrt(n); i++) {
			System.out.println("looping " + i);
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

}
