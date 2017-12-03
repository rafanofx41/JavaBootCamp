package ControlFlowStatements;

public class WhileDoWhile {

	public static void main(String[] args) {
		int count = 0;
		while(count != 5) {
			System.out.println("count value is " + count);
			count++;
		}
		
		System.out.println("----------------------");
		
		count = 0;
		
		while(true) {
			if(count == 5) {
				break;
			}
			System.out.println("count value is " + count);
			count++;
		}
		
		System.out.println("-----------------");
		
		count = 0;
		do {
			System.out.println("count value was " + count + " using do while");
			count++;
		}while(count !=6);
		
		System.out.println("-----------------");
		
		int evenCount = 0;
		int number = 5;
		int finishNumber = 20;
		while(number <= finishNumber) {
			if(!isEvenNumber(number)) {
				number++;
				continue;
			}
			System.out.println("Even number " + number);
			number++;
			evenCount++;
			System.out.println(evenCount+ " evenCount");
			if(evenCount >= 5) {
				break;
			}
		}
		

	}
	
	public static boolean isEvenNumber(int number) {
		if((number % 2 == 0 )) {
			return true;
		}else {
			return false;
		}
	}

}
