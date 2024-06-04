package capitulo4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Aula 30 - Exercícios | Enunciado: https://drive.google.com/file/d/1LrggkmpAWabiiHG-ER_L7d0DBLLXZtmd/view?usp=sharing
		
		/* 1) Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos. */
		
		int a, b, soma;
		
		System.out.println("Exercício 1:");
		System.out.print("Digite dois números inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma desses números é: " + soma);
		
		System.out.println();
		
		/* 2) Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
			casas decimais conforme exemplos.
			
			Fórmula da área: area = π . raio2
			Considere o valor de π = 3.14159 */
		
		double pi = 3.14;		
		
		
		System.out.println("Exercício 2:");
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		double area = pi * raio;
		System.out.println("O valor da área é de: " + area);
		System.out.println();
		
		
		/* 3) Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */
		
		int A, B, C, D;
		
		System.out.println("Exercício 3: ");
		System.out.print("Digite os valores inteiros de A, B, C e D respectivamente: ");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		double dif = (A * B - C * D);
		
		System.out.println("A diferença do produto é: " + dif);
		System.out.println();
		
		/* 4) Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
			hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
			decimais. */
		
		int num;
		double horas, valor;
		
		System.out.println("Exercício 4: ");
		
		System.out.print("Digite o seu número de funcionário: ");
		num = sc.nextInt();
		
		System.out.print("Digite o número de horas trabalhadas: ");
		horas = sc.nextDouble();
		
		System.out.print("Digite o valor recebido por hora trabalhada: ");
		valor = sc.nextDouble();
		
		double salario = horas * valor;
		
		System.out.println();
		System.out.printf("O funcionário %d recebeu um salário de R$ %.2f%n", num, salario);
		System.out.println();
		
		/* 5) Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
			código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */
		
		int cod1, num1, cod2, num2;
		double valor1, valor2;
		
		System.out.println("Exercício 5: ");
		
		System.out.print("Digite o código da peça 1: ");
		cod1 = sc.nextInt();
		System.out.print("Digite o número de peças 1: ");
		num1 = sc.nextInt();
		System.out.print("Digite o valor unitário da peça 1: ");
		valor1 = sc.nextDouble();
		
		System.out.print("Digite o código da peça 2: ");
		cod2 = sc.nextInt();
		System.out.print("Digite o número de peças 2: ");
		num2 = sc.nextInt();
		System.out.print("Digite o valor unitário da peça 2: ");
		valor2 = sc.nextDouble();
		
		double total = valor1 + valor2;
		
		System.out.println();
		System.out.printf("Valor a ser pago: %n %n Peça 1: R$ %.2f%n Código: %d %n Qtde.: %d %n %n Peça 2: R$ %.2f%n Código: %d %n Qtde.: %d %n %n Valor total: R$ %.2f%n", valor1, cod1, num1, valor2, cod2, num2, total);
		System.out.println();
		
				
		sc.close();
		

	}

}
