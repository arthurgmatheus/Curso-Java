package capitulo4;

import java.util.Locale;

public class Aula24 {

	//Aula 24 - Saída de dados em Java
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double var = 10.35784;
		
		System.out.printf("%.2f%n", var);
		
		String nome = "Maria";
		int idade = 30;
		double salario = 4000.88;
		
		System.out.printf("O nome dela é %s, ela tem %d anos e ganha R$ %.2f%n", nome, idade, salario);
		
		
		
	}
	
	
	
	
	
}
