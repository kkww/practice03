package prob06_update;

import java.util.Scanner;

class CalcClass {
	Arith arith = null;
	public void calc(int a, char op, int b) {
		if(op == '+') {
			arith = new Add();
			arith.setValue(a, b);
		} else if(op == '-') {
			arith = new Sub();
			arith.setValue(a, b);
		} else if(op == '*') {
			arith = new Mul();
			arith.setValue(a, b);
		} else if(op == '/') {
			arith = new Div();
			arith.setValue(a, b);
		}
		
		System.out.println(">> " + arith.calculate());
	}
}

public class CalcApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		int a = 0;
		int b = 0;
		char op = ' ';
		
		while( true ) {
			System.out.print(">> ");
			input = scanner.nextLine();
			String[] tokens = input.split(" ");
			
			if(tokens.length != 3) {
				System.out.println("end.");
				break;
			}
			
			a = Integer.parseInt(tokens[0]);
			op = tokens[1].charAt(0);
			b = Integer.parseInt(tokens[2]);
			
			if(!(op == '+' || op == '-' || op == '*' || op == '/')) {
				System.out.println("잘못된 연산자");
				break;
			}
			
			CalcClass mycal = new CalcClass();
			mycal.calc(a, op, b);
		}
		
		scanner.close();
	}
}

