import java.util.Scanner;
public class Modelo {
		
	String nome;
	String ra;
	double notas[];
	double media; 
	
	/*
	 
	//METODOS SEM PARAMETROS E SEM RETORNO
	public void calcularMedia(){
	
	for(int i= 0; i< 4; i++) {
		media= media+ notas[i];
		
	}
	media= media/ 4;
	}
	
	*/
	
	
	/*
	//METODOS SEM PARAMETROS E COM RETORNO
	public double calcularMedia() {
		for(int i= 0; i< 4; i++) {
			media= media+ notas[i];
	}
	media= media/ 4;
	return media;
	}*/
	
	
	
	/*
	//METODOS COM PARAMETRO E SEM RETORNO 
	public void calcularMedia(double n1, double n2, double n3, double n4) {
		notas[0] = n1;
		notas[1] = n2;
		notas[2] = n3;
		notas[3] = n4;
		for(int i= 0; i< 4; i++) {
			media= media+ notas[i];
	}
	media= media/ 4;
	}
	
	*/
	
	//METODOS COM PARAMETRO E COM RETORNO
	public double calcularMedia(double n1, double n2, double n3, double n4) {
		notas[0] = n1;
		notas[1] = n2;
		notas[2] = n3;
		notas[3] = n4;
		for(int i = 0; i < 4; i++) {
			media = media + notas[i];
		}
		media = media / 4;
		return media;}
}