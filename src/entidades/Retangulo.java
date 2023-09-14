package entidades;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double area() {
		double a = largura * altura;
		return a;
	}
	
	public double perimetro() {
		double p = largura * 2 + altura * 2;
		return p;
	}
	
	public double diagonall() {
		double d = Math.sqrt(largura * 2 + altura * 2);
		return d;
		
	}
	

		
}
