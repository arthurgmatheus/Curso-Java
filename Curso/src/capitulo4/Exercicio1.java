package capitulo4;

import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		// Aula 24 - Enunciado: https://drive.google.com/file/d/12WXzuNNxDobAnLo6Uv1iUrN7Wpd7N3OM/view?usp=sharing
		
		Locale.setDefault(Locale.US);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %n %s, wich price is $ %.2f%n %s, wich price is $ %.2f%n",product1, price1, product2, price2);
		System.out.println();
		System.out.printf("%d years old, code %d and gender: " +  gender + " %n", age, code);
		System.out.println();
		System.out.printf("Measure witch eight decimal places: %.8f%n Rouded (three decimal places): %.3f%n US decimal point: %.3f, ", measure, measure, measure);

	}

}
