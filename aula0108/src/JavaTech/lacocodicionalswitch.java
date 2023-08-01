package JavaTech;

import java.util.Scanner;

public class lacocodicionalswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 5
		
		int item, quant;
		float precounit = 0 , total;
		
		Scanner leia = new Scanner(System.in);	
		
		System.out.println("\n\tMenu");
		System.out.println("\nCódigo - Produto - Preço unitário");
		System.out.println("\n1 - Cachorro Quente - R$10,00");
		System.out.println("\n2 - X-Salada - R$15,00");
		System.out.println("\n3 - X-Bacon - R$18,00");
		System.out.println("\n4 - Bauru - R$12,00");
		System.out.println("\n5 - Refrigerante - R$8,00");
		System.out.println("\n6 - Suco de laranja - R$13,00");
		
		System.out.println("\nDigite o Código do Produto: ");
		item = leia.nextInt();
		
		System.out.println("\nDigite a Quantidade: ");
		quant = leia.nextInt();
		
		
		switch(item) {
		case 1:
			System.out.println("\nProduto: Cachorro Quente");
			precounit = 10;
		break;
		
		case 2:
			System.out.println("\nProduto: X-Salada");
			precounit = 15;
		break;
		
		case 3:
			System.out.println("\nProduto: X-Bacon");
			precounit = 18;
		break;
		
		case 4:
			System.out.println("\nProduto: Bauru");
			precounit = 12;
		break;
		
		case 5:
			System.out.println("\nProduto: Refrigerante");
			precounit = 8;
		break;
		
		case 6:
			System.out.println("\nProduto: Suco de laranja");
			precounit = 13;
		break;
			
		default:
			System.out.println("\nOpção inválida");
		break;
		
		}
		
		
		total = precounit * quant;
		
		System.out.printf("\nValor total: R$ %.2f" , total);
		
	}

}
