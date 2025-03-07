import java.util.Scanner;
public class Calculadora {
	
	double numA;
	double numB;
	double resultado;
	

	public void somatoria() {
		Scanner leitor = new Scanner(System.in);	
		System.out.println("Digite  o numero A: ");
		this.numA = leitor.nextDouble();
		System.out.println("Digite  o numero B: ");
		this.numB = leitor.nextDouble();
		this.resultado = this.numA + this.numB;
		System.out.println("A soma é: "+ this.resultado);
	}
	public void subtracao() {
		Scanner leitor = new Scanner(System.in);	
		System.out.println("Digite  o numero A: ");
		this.numA = leitor.nextDouble();
		System.out.println("Digite  o numero B: ");
		this.numB = leitor.nextDouble();
		this.resultado = this.numA - this.numB;
		System.out.println("A subtração é: "+ this.resultado);
	}
	public void divisao() {
		Scanner leitor = new Scanner(System.in);	
		System.out.println("Digite  o numero A: ");
		this.numA = leitor.nextDouble();
		System.out.println("Digite  o numero B: ");
		this.numB = leitor.nextDouble();
		this.resultado = this.numA / this.numB;
		System.out.println("A divisão é: "+ this.resultado);
	}
	public void multiplicacao() {
		Scanner leitor = new Scanner(System.in);	
		System.out.println("Digite  o numero A: ");
		this.numA = leitor.nextDouble();
		System.out.println("Digite  o numero B: ");
		this.numB = leitor.nextDouble();
		this.resultado = this.numA * this.numB;
		System.out.println("A multiplicação é: "+ this.resultado);
	}
}