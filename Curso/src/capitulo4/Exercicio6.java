package capitulo4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		// Aula 30 - Exercício 6 | Enunciado: https://drive.google.com/file/d/1LrggkmpAWabiiHG-ER_L7d0DBLLXZtmd/view?usp=sharing
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		/*6) Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
			mostre:
		
			a) a área do triângulo retângulo que tem A por base e C por altura.
			b) a área do círculo de raio C. (pi = 3.14159)
			c) a área do trapézio que tem A e B por bases e C por altura.
			d) a área do quadrado que tem lado B.
			e) a área do retângulo que tem lados A e B. */
		
		System.out.println("Exercício 6: ");
		
		double A, B, C;
		double pi = 3.14159;
		
		System.out.println("a) Área do Triângulo: ");
		System.out.print("Digite o valor da base: ");
		A = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		C = sc.nextDouble();
		double area1 = (A*C)/2;
		System.out.printf("A área do Triângulo é: %.2f%n", area1 );
		System.out.println();
		
		System.out.println("b) Área do Círculo: ");
		System.out.print("Digite o valor do raio: ");
		C = sc.nextDouble();
		double area2 = C * Math.pow(pi, 2);
		System.out.printf("A área do Círculo é: %.2f%n", area2 );
		System.out.println();
		
		System.out.println("c) Área do Trapézio: ");
		System.out.print("Digite o valor da base A: ");
		A = sc.nextDouble();
		System.out.print("Digite o valor da base B: ");
		B = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		double area3 = ((A + B) * C )/2;
		System.out.printf("A área do Trapézio é: %.2f%n", area3 );
		System.out.println();
		
		System.out.println("d) Área do Quadrado: ");
		System.out.print("Digite o valor do lado: ");
		B = sc.nextDouble();
		double area4 = Math.pow(B, 2);
		System.out.printf("A área do Quadrado é: %.2f%n", area4);
		System.out.println();
		
		System.out.println("e) Área do Retângulo: ");
		System.out.print("Digite o valor do lado A: ");
		A = sc.nextDouble();
		System.out.print("Digite o valor do lado B: ");
		B = sc.nextDouble();
		double area5 = (A*B);
		System.out.printf("A área do Retângulo é: %.2f%n", area5 );
		System.out.println();
		
		
		
		sc.close();

	}

}
