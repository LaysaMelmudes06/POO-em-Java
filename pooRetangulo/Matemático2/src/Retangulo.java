import java.util.Scanner;
public class Retangulo {
	double base;
	double altura;
	double area;
	double perimetro;
	double comprimento;


	public void area() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		this.base = leitor.nextDouble();
		System.out.println("Digite o valor da altura: ");
		this.altura = leitor.nextDouble();
		this.area = this.base * this.altura;
		System.out.println("A area é igual a: "+ this.area);
	}
	public void perimetro() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da altura: ");
		this.altura = leitor.nextDouble();
		System.out.println("Digite o valor do comprimento: ");
		this.comprimento = leitor.nextDouble();
		this.perimetro = (this.comprimento * 2) + (this.altura * 2);
		System.out.println("O perimetro é igual a: "+ this.perimetro);
	}
	
}