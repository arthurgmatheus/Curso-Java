package capitulo4;

import java.util.Locale;

public class Aula25 {

	public static void main(String[] args) {
		/*
		 * Processamento de dados em Java, Casting Função: forçar a conversão de um
		 * determinado tipo para outro
		 */

		Locale.setDefault(Locale.US);

		int a, b;
		double resultado;
		
		a = 9;
		b = 9;
		
		resultado = a + b;
		
		System.out.printf("O resultado é: %d", (int) resultado);

	}

}
