package kalkulator;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sor = input.nextLine();
		// Teszt
		// System.out.println("Az input sor: " + sor);
		String[] elemek = sor.split(" ");
		if (elemek.length !=3) {
			System.out.println("Hibás szerkezetű input!");
			return;
		}
		int operandus1;
		char operator;
		int operandus2;
		// Ellenorzesek
		try {
			operandus1 = Integer.parseInt(elemek[0]);	
			operandus2 = Integer.parseInt(elemek[2]);
		} catch (NumberFormatException e) {
			System.out.println("Hibás egész szám!");
			return;
		}
		if (elemek[1].length() != 1) {
			System.out.println("Operátor nem egy karakter!");
			return;
		}
		operator = elemek[1].charAt(0);
		
		// Szamolás
		double eredmeny;
		switch (operator) {
		case '+':
			eredmeny = operandus1 + operandus2;
			break;
		case '-':
			eredmeny = operandus1 - operandus2;
			break;
		case '*':
			eredmeny = operandus1 * operandus2;
			break;
		case '/':
			if (operandus2 == 0) {
				System.out.println("Nullával való osztás nem megengedett!");
				return;
				}
			eredmeny = operandus1 / operandus2;
			break;
		default:
			System.out.println("Hibás operátor");
			return;
		}
		System.out.println("Eredmény: " + operandus1 + operator + operandus2 + "=" + eredmeny);
	}
}
