package com.projeto.variaveisjava;

public class Variavel {
	
	// Variáveis
	// - byte = Armaz. números pequenos (1,2,10);
	// - int = Armaz. números grandes (1000,2000...);
	// - long = Armaz. números longos (1000000,200000); 
	// - float = Armaz. números "quebrados" (2.5, 10.9) Menor precisão, porém requer menos memória;
	// - double = Armaz. números "quebrados" (2.5, 10.9) Maior precisão, porém requer mais memória;
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
		
		String minhaVariavelString = "Café";
		
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
