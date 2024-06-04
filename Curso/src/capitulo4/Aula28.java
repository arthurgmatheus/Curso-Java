package capitulo4;

import java.util.Scanner;

public class Aula28 {

	public static void main(String[] args) {
		// Aula 28 - Funções Matemáticas em Java
		
		/* Raiz quadrada: Math.sqrt();
		   Potenciação: Math.pow(x,y);
		   Valor absoluto: Math.abs(); */
		Scanner sc = new Scanner(System.in);
		
		int x = 9;
		int y = -9;
		
		System.out.printf("%n A raiz quadrada de %d é: " + Math.sqrt(x), x);
		System.out.printf("%n %d elevado a 2 é: " + Math.pow(x, 2), x);
		System.out.printf("%n O valor absoluto de %d é: " + Math.abs(y), y);
		System.out.println();
		System.out.println();
		
		//Fórmula de Báskara
		
		double a, b, c;
		double delta, x1, x2;
		
		System.out.println("Forneça valores inteiros para 'a', 'b' e 'c': ");
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		System.out.print("c: ");
		c = sc.nextInt();
		
		delta = Math.pow(b, 2) - (4*a*c);
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println();
		System.out.println("O valor de delta é: " + delta);
		
		
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("O valor de x1 é: " + x1);
            System.out.println("O valor de x2 é: " + x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("A equação tem uma raiz dupla, o valor de x é: " + x1);
        } else {
            System.out.println("Delta é negativo, as raízes não são reais.");
        }
		
		
		
		sc.close();

	}

}
