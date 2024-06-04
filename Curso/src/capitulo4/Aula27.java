package capitulo4;

import java.util.Locale;
import java.util.Scanner;

public class Aula27 {

	public static void main(String[] args) {
		/* Aula 27 - Entrada de dados em Java pt. 1 */
		
		//Ler o primeiro caractere de um nome: sc.next().charAt(0);
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite seu primeiro nome: ");
		String nome = sc.next();
		System.out.println("A primeira letra do seu nome é: " + nome.charAt(0));
		
		
		
		
		sc.close();

	}

}
