package capitulo4;

import java.util.Locale;
import java.util.Scanner;

public class Aula26 {

	public static void main(String[] args) {
		// Aula 26 - Entrada de dados em Java pt. 1

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Digite seu salário: ");
		double salario = sc.nextDouble();
		
		System.out.printf("%n Seus dados: %n %n Nome: %s %n Idade: %d %n Salário: %.2f%n", nome, idade, salario);
		
		sc.close();

	}

}
