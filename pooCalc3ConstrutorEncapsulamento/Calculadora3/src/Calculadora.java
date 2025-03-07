
import java.util.Scanner;
public class Calculadora {
	
	private double numA;
	private double numB;
	private double resultado;
	
	public Calculadora() {
		
	}
	
	public Calculadora(double numA, double numB) {
		System.out.println("Bem vindo(a)!!!!");		
	}
	
	//COM RETORNO SEM PARAMETRO
	public double getNumA() {
		return numA;
	}
	public double getNumB() {
		return numB;
	}
	public double getResultado() {
		return resultado;
	}
	
	
	//SEM RETORNO COM PARAMETRO
	public void setNumA(double numA) {
		this.numA = numA;
	}
	public void setNumB(double numB) {
		this.numB = numB;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	
	
	//SOMA SEM RETORNO SEM PARAMETRO
	public void somatoria() {
		this.resultado = this.numA + this.numB;
		System.out.print("A soma �: "+ this.resultado +'\n');
	}
	
	
	//SUBTRA�AO SEM RETORNO E COM PARAMETRO
	public void subtracao(double numero1, double numero2) {
		this.numA = numero1;
		this.numB = numero2;
		resultado = this.numA - this.numB;	
	}
	
	
	//DIVISAO COM RETORNO E SEM PARAMETRO
	public double divisao() {
		this.resultado = this.numA / this.numB;		
		return resultado;
	}
	
	
	//MULTIPLICACAO COM RETORNO E COM PARAMETRO 
	public double multiplicacao(double numero1, double numero2) {
		this.numA = numero1;
		this.numB = numero2;
		this.resultado = this.numA * this.numB;
		return resultado;
	}
}