import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Modelo mode = new Modelo();
		
		/*
		 
		 
		//METODOS SEM PARAMETROS E SEM RETORNO
		mode.calcularMedia();
		System.out.println("A m�dia do aluno � "+ mode.media);
		
		
		*/
		
		/*
		 
		 
		//METODOS SEM PARAMETROS E COM RETORNO
		System.out.println("A m�dia do aluno � "+ mode.calcularMedia());
		
		
		*/
		
		
		//METODOS COM PARAMETRO E SEM RETORNO
		mode.calcularMedia(6, 7, 8, 6);
		System.out.println("A m�dia do aluno � "+ mode.media);
		
		//METODOS COM PARAMETRO E COM RETORNO
		System.out.println("A m�dia do aluno � "+ mode.calcularMedia(6, 7, 8, 6));
	}
}