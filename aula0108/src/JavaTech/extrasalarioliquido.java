package JavaTech;

import java.util.Scanner;

public class extrasalarioliquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício Extra 3
		
				float bruto, noturno, extra, desconto, liquido;
				Scanner leia = new Scanner(System.in);
				
				System.out.println("Salário bruto:");
				bruto = leia.nextFloat();
				
				System.out.println("Adicional noturno:");
				noturno = leia.nextFloat();
				
				System.out.println("Horas extras:");
				extra = leia.nextFloat();
				
				System.out.println("Descontos:");
				desconto = leia.nextFloat();
				
				liquido = bruto + noturno + extra - desconto;
				
				System.out.printf("Salário Liquido: R$ %.2f", liquido);
				
	}

}
