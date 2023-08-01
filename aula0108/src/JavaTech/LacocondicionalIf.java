package JavaTech;

import java.util.Scanner;

public class LacocondicionalIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 1
	
		int A, B, C, soma;
		
		Scanner leia = new Scanner(System.in);	
		
		System.out.println("\nDigite o numero A: ");
		A = leia.nextInt();
		System.out.println("\nDigite o numero B: ");
		B = leia.nextInt();
		System.out.println("\nDigite o numero C: ");
		C = leia.nextInt();
		
		soma = A + B;
		
		if(soma>C) {
			System.out.println("\nA Soma de A + B é Maior do que C");
			
		} else if(soma<C) {
			System.out.println("\nA Soma de A + B é Menor do que C");
			
		} else {
			System.out.println("\nA Soma de A + B é Igual C");
			
		}
		
	}

}
