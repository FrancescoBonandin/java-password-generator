package org.lessons.java.security;

import java.util.Scanner;

//Todo
//Create un nuovo progetto java chiamato java-password-generator.
//Aggiungete una classe PasswordGenerator nel package org.lessons.java.security che contiene un metodo main.
//Il programma deve fare quanto segue:
//
//salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
//generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
//Esempio
//Ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta.
//La sua password sarà Pinco-Pallo-magenta-2011

public class PasswordGenerator {

	public static void main(String[] args) {
		
		String password = "" ;
		
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
		
		password = name + "-" + surname + "-" + color + "-" + dateSum;
		System.out.println("la tua password è : " + password);
	}

}
