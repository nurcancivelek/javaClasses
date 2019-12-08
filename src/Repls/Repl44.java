package Repls;

public class Repl44 {
	public static void main(String[] args) {
//	Step 1: You have variable iSwitch=6;
//	Step 2:  Do the switch for the other cases but for your value 
//	it should print out "Not in the list"
//	Output:
//	"Not in the list"
		
		int iSwitch=6;
		
		switch(iSwitch) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("Not in the list");
			break;
		default :
			System.out.println("unknown number");
			break;
		}

	}

}
