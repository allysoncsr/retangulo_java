package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Retangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Digite com a largura e altura do triangulo: ");
		x.largura = sc.nextDouble();
		x.altura = sc.nextDouble();
		
		
		double resultadoA = x.area();
		double resultadoP = x.perimetro();
		double resultadoD = x.diagonall();
		
		System.out.println("Área: " + resultadoA);
		System.out.println("Perimentro: " + resultadoP);
		System.out.println("Diagonal " + resultadoD);
		sc.close();
		
	}

}
