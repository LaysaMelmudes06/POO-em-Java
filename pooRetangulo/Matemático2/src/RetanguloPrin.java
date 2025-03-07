import java.util.Scanner;
public class RetanguloPrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Retangulo retan = new Retangulo();
		int resul;
		System.out.println("Oque voce deseja calcular 1-Área 2-Perímetro");
		resul = leitor.nextInt();
		
		switch(resul) {
		
		case 1:
			retan.area();	
			break;
		case 2:
			retan.perimetro();
			break;
		default:
			System.out.println("Número Inválido");
		}
		
	}

}
