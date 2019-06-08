package com.projeto.variaveisjava;

public class Variavel {
	
	// Vari�veis
	// - byte = Armaz. n�meros pequenos (1,2,10);
	// - int = Armaz. n�meros grandes (1000,2000...);
	// - long = Armaz. n�meros longos (1000000,200000); 
	// - float = Armaz. n�meros "quebrados" (2.5, 10.9) Menor precis�o, por�m requer menos mem�ria;
	// - double = Armaz. n�meros "quebrados" (2.5, 10.9) Maior precis�o, por�m requer mais mem�ria;
	// - boolean = True or false;
	// - char = characters such 'c', 'm', 'n'...
	// - String = Texts (must be into quotation marks);
	
	public static void main(String[] args) {
		
		char minhaVariavelChar = 'c';
		byte minhaVariavelByte = 2;
		int minhaVariavelInt = 10000;
		long minhaVariavelLong = 1000000000;
		float minhaVariavelFloat = 1.7f;
		double minhaVariavelDouble = 7.25;
		
		boolean minhaVariavelBoolean = true;
		
		String minhaVariavelString = "Caf�";
		
		System.out.println(minhaVariavelChar);
		System.out.println(minhaVariavelByte);
		System.out.println(minhaVariavelInt);
		System.out.println(minhaVariavelLong);
		System.out.println(minhaVariavelFloat);
		System.out.println(minhaVariavelDouble);
		System.out.println(minhaVariavelBoolean);
		System.out.println(minhaVariavelString);
	}

}
