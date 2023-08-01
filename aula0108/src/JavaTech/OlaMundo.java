package JavaTech;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Antonio Kerr";
		int idade = 28;
		float altura = (float) 1.73, nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNome do participante: " + nome + " que é da turma 66 da Generation");
		System.out.println("\nIdade do participante: " + idade + " anos.");
		System.out.println("\nAltura do participante: " + altura + " metros.");
		
		System.out.println("\nEntre com a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a nota 3: ");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("\nA média das notas é: " + media + ".");
		System.out.printf("\nA média das notas é: %.2f",media);
		
		if(media>=7 && media<=10) {
			System.out.println("\nAluno Aprovado!");
				
		} else if(media>=5 && media<7) {
			System.out.println("\nAluno de exame!");
			
		} else {
			System.out.println("\nAluno reprovado!");
			
		}
		
	}

}
