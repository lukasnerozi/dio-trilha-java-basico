package novoTeste.exercicios.EstruturasdeRepetiçãoeArraysemJava;

public class OrdemInversa {

	public static void main(String[] args) {

		int[] vetor = { -5, -6, 15, 50, 8, 4 };

		int count = 0;
		while (count < (vetor.length - 1)) {

			System.out.println(vetor[count]);
			count++;

		}
		System.out.println("\n ");
		for (int i = (vetor.length - 2); i >= 0; i--) {
			
			System.out.println(vetor[i]);
			
		}

	}

}
