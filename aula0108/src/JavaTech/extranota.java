package JavaTech;

import java.util.Scanner;

public class extranota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício Extra 2
		
		float nota1, nota2, nota3, nota4, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a Nota 1:");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a Nota 2:");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a Nota 3:");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a Nota 4:");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Média: %.2f", media);
		
	}

}
