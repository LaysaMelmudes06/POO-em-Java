import java.util.Scanner;
public class PrincipalCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Calculadora cal = new Calculadora();
		int resul;
		
		System.out.println("Digite qual calculo voc� deseja realizar, 1-Soma 2-Subtra��o 3-Divis�o 4-Multiplicac�o");
		resul = leitor.nextInt();
		
		switch(resul) {
		
		case 1: 
			cal.somatoria();
			break;
		case 2: 
			cal.subtracao();;
			break;
		case 3: 
			cal.divisao();;
			break;
		case 4: 
			cal.multiplicacao();;
			break;
		default:
			System.out.println("Numero Invalido");
		}
		
	}

}
