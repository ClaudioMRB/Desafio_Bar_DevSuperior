package programa;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Double entrada1 = 8.00;
		Double entrada2 = 10.00;
		Double cerveja = 5.00;
		Double espetinhos = 7.00;
		Double refrigerante = 3.00;
		Double couverArtistico = 4.00;
		
		
		Character y = 'F';
		int quantCerveja = 3, quantEspetinhos = 1,quantRefrigerante = 0;
		Double total = quantCerveja * cerveja + quantEspetinhos * espetinhos + quantRefrigerante * refrigerante;

		
		Character x = 'M';
		int quantCerveja1 = 7, quantEspetinhos1 = 2, quantRefrigerante1= 1;
		Double total1 = quantCerveja1 * cerveja + quantEspetinhos1 * espetinhos + quantRefrigerante1 * refrigerante;

		//Mulher
		if(total < 30) {
			System.out.println();
			System.out.print("Sexo: " + y + "\nQuantidade de cervejas: " + quantCerveja + "\nQuantidade de refrigerantes: " + quantRefrigerante + "\nQuantidade de espetinhos: " + quantEspetinhos);
			
			System.out.println();
			System.out.printf("\nRelatorio: " + "Consumo = R$%.2f \nCouvert = R$%.2f \nIngresso = R$%.2f", total, couverArtistico, entrada1);
			
			System.out.println();
			System.out.printf("\nValor a pagar = R$%.2f", total + entrada1 + couverArtistico);
		}else{
			System.out.println();
			System.out.print("Sexo: " + y + "\nQuantidade de cervejas: " + quantCerveja + "\nQuantidade de refrigerantes: " + quantRefrigerante + "\nQuantidade de espetinhos: " + quantEspetinhos);
			
			System.out.println();
			System.out.println("\nIsento Couver Artistico" );
			System.out.printf("\nValor a pagar = R$%.2f", total + entrada1);
		}
		
		//Homem
		if(total1 < 30) {
			System.out.println();
			System.out.print("\nSexo: " + x + "\nQuantidade de cervejas: " + quantCerveja1 + "\nQuantidade de refrigerantes: " + quantRefrigerante1 + "\nQuantidade de espetinhos: " + quantEspetinhos1);
			
			System.out.println();
			System.out.printf("\nRelatorio: " + "\nConsumo = R$%.2f \nCouvert = R$%.2f \nIngresso = R$%.2f", total1, couverArtistico, entrada2);
			
			System.out.println();
			System.out.printf("\nValor a pagar = R$%.2f", total1 + entrada2 + couverArtistico);
		}else{
			System.out.println();
			System.out.print("\nSexo: " + x + "\nQuantidade de cervejas: " + quantCerveja1 + "\nQuantidade de refrigerantes: " + quantRefrigerante1 + "\nQuantidade de espetinhos: " + quantEspetinhos1);
			
			System.out.println();
			System.out.println("\nIsento Couver Artistico");
			System.out.printf("\nValor a pagar = R$%.2f", total1 + entrada2);
		}
		
		
		
		}
		
		
}	
		
	


