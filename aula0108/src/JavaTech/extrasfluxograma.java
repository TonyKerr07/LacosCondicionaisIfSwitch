package JavaTech;

import java.util.Scanner;

public class extrasfluxograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício Extra 1
		
		Float salario, abono, novosalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o Abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.printf("\nNovo Salário: R$ %.2f", novosalario);
		
	}

}
