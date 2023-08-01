package JavaTech;

import java.util.Scanner;

public class exerciciocaracteristicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 4
		
		String Vert, Anim, comida;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nVertebrado ou Invertebrado?");
		Vert = ler.nextLine();
		
		if(Vert.equalsIgnoreCase("vertebrado")) {
			System.out.println("\nAve ou Mamífero?");
			Anim = ler.nextLine();
			
			if(Anim.equalsIgnoreCase("ave")) {
				System.out.println("\nCarnívoro ou Onívoro?");
				comida = ler.nextLine();
				
				if(comida.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nÁguia");
					
				} else if(comida.equalsIgnoreCase("onívoro")) {
					System.out.println("\nPomba");
					
				} else {
					System.out.println("\nA palavra está errada, começe novamente!");
					
				}
			} else if(Anim.equalsIgnoreCase("mamífero")) {
				System.out.println("\nHerbívoro ou Onívoro?");
				comida = ler.nextLine();
				
				if(comida.equalsIgnoreCase("herbívoro")) {
					System.out.println("\nVaca");
					
				} else if(comida.equalsIgnoreCase("onívoro")) {
					System.out.println("\nHomem");
					
				} else {
					System.out.println("\nA palavra está errada, começe novamente!");
					
				}
			} else {
				System.out.println("\nA palavra está errada, começe novamente!");
				
			}
		} else if(Vert.equalsIgnoreCase("invertebrado")) {
			System.out.println("\nInseto ou Analídeo?");
			Anim = ler.nextLine();
			
			if(Anim.equalsIgnoreCase("Inseto")) {
				System.out.println("\nHematófago ou Herbívoro?");
				comida = ler.nextLine();
				
				if(comida.equalsIgnoreCase("hematófago")) {
					System.out.println("\nPulga");
					
				} else if(comida.equalsIgnoreCase("herbívoro")) {
					System.out.println("\nLagarta");
					
				} else {
					System.out.println("\nA palavra está errada, começe novamente!");
					
				}
			} else if(Anim.equalsIgnoreCase("analídeo")) {
				System.out.println("\nHematófago ou Onívoro?");
				comida = ler.nextLine();
				
				if(comida.equalsIgnoreCase("hematófago")) {
					System.out.println("\nSanguessuga");
					
				} else if(comida.equalsIgnoreCase("onívoro")) {
					System.out.println("\nMinhoca");
					
				} else {
					System.out.println("\nA palavra está errada, começe novamente!");
					
				}
			} else {
				System.out.println("\nA palavra está errada, começe novamente!");
				
			}
		}
	}

}
