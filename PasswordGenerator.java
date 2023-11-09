package org.lessons.java.security;

import java.util.Scanner;


public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in) ;
		
		System.out.println("dimmi il tuo nome?");
		String name = in.nextLine();
		
		System.out.println("dimmi il tuo cognome?");
		String surname = in.nextLine();
		
		System.out.println("dimmi il tuo colore preferito?");
		String color = in.nextLine();
		
		System.out.println("dimmi il tuo giorno di nascita?");
		String dayOfBirth =  in.nextLine();
		int day = Integer.valueOf(dayOfBirth);
		
		System.out.println("dimmi il tuo mese di nascita?");
		String monthOfBirth = in.nextLine();
		int month = Integer.valueOf(monthOfBirth);
		
		System.out.println("dimmi il tuo anno di nascita?");
		String yearOfBirth = in.nextLine();
		int year = Integer.valueOf(yearOfBirth);

		
		int dateSum = day+month+year;
		
		String password = name + "-" + surname + "-" + color + "-" + dateSum;
		System.out.println("la tua password è : " + password);
	}

}
