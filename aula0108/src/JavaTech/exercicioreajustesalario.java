package JavaTech;

import java.util.Scanner;

public class exercicioreajustesalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 6
		
		String nome;
		int codigo;
		float salario, reajuste = (float) 0.10, novosalario;
		
		Scanner leia = new Scanner(System.in);	
		
		System.out.println("\nDigite o Nome do Colaborador: ");
		nome = leia.nextLine();
		
		
		System.out.println("\nCódigo do Cargo - Cargo - Percentual do Reajuste");
		System.out.println("\n1 - Gerente - 10%");
		System.out.println("\n2 - Vendedor - 7%");
		System.out.println("\n3 - Supervisor - 9%");
		System.out.println("\n4 - Motorista - 6%");
		System.out.println("\n5 - Estoquista - 5%");
		System.out.println("\n6 - Técnico de TI - 8%");
		

		
		System.out.println("\nDigite o Código do Cargo: ");
		codigo = leia.nextInt();
		
		System.out.println("\nDigite o Salário antes do reajuste: ");
		salario = leia.nextFloat();
		
		
		System.out.println("\nNome do Colaborador: " + nome);
		
		switch(codigo) {
		case 1:
			System.out.println("Gerente \nReajuste de Gerente é de 10%");
			reajuste = (float) 0.10;
		break;
		
		case 2:
			System.out.println("Vendedor \nReajuste de Vendedor é de 7%");
			reajuste = (float) 0.07;
		break;
		
		case 3:
			System.out.println("Supervisor \nReajuste de Supervisor é de 9%");
			reajuste = (float) 0.09;
		break;
		
		case 4:
			System.out.println("Motorista \nReajuste de Motorista é de 6%");
			reajuste = (float) 0.06;
		break;
		
		case 5:
			System.out.println("Estoquista \nReajuste de Estoquista é de 5%");
			reajuste = (float) 0.05;
		break;
		
		case 6:
			System.out.println("Técnico de TI \nReajuste de Técnico de TI é de 8%");
			reajuste = (float) 0.08;
		break;
			
		default:
			System.out.println("\nOpção inválida");
		break;
		
		}
		
		novosalario = salario * ( 1 + reajuste );
		
		System.out.printf("O novo Salário é R$ %.2f",novosalario);
		
	}

}
