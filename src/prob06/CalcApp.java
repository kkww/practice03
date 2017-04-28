package prob06;

import java.util.Scanner;

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
			
			calc(a, op, b);
		}
		
		scanner.close();
	}
	
	public static void calc(int a, char op, int b) {
		if(op == '+') {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(">> " + add.calculate());
		} else if(op == '-') {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(">> " + sub.calculate());
		} else if(op == '*') {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(">> " + mul.calculate());
		} else if(op == '/') {
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(">> " + div.calculate());
		} else {
			System.out.println("잘못된 입력 값");
		}
	}
}