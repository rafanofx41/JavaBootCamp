package ControlFlowStatements;

public class Switch {

	public static void main(String[] args) {
		char switchValue = 'f';
		
		switch(switchValue) {
		case 'a':
			System.out.println("value was a");
			break;
		case 'b':
			System.out.println("value was b");
			break;
		case 'c':
			System.out.println("value was c");
			break;
		case 'd':
			System.out.println("value was d");
			break;
		case 'e':
			System.out.println("value was e");
			break;
		default:
			System.out.println("value was not a, b, c, d and e");
			break;
		}
		
		String month = "January";
		//Recomendado passar uma string para lowercase para evitar erro de comparação.
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("jan");
			break;
		case "June":
			System.out.println("jun");
			break;
		default:
			System.out.println("not sure");
			break;
		}
		
	}

}
