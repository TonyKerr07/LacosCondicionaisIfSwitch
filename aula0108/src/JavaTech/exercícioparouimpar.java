package JavaTech;

import java.util.Scanner;

public class exercícioparouimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 2
		
		int numero;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		
		numero = ler.nextInt();
		
		if(numero %2 == 0 && numero > 0) {
			System.out.println("\nO Número " + numero + " é par e positivo!");
		
		} else if (numero %2 == 0 && numero < 0) {
			System.out.println("\nO Número " + numero + " é par e negativo!");
			
		} else if (numero %2 != 0 && numero > 0) {
			System.out.println("\nO Número " + numero + " é impar e positivo!");
			
		} else {
			System.out.println("\nO Número " + numero + " é impar e negativo!");
			
		}
		
	}

}
