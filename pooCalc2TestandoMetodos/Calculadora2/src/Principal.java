import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);		
		Calcu calc = new Calcu();

		int resul;	
		
		System.out.println("Digite qual calculo voc� deseja realizar, 1-Soma 2-Subtra��o 3-Divis�o 4-Multiplicac�o");
		resul = leitor.nextInt();
		
switch(resul) {
		
		case 1: 		
		//SOMA SEM RETORNO E SEM PAR�METRO
		calc.somatoria();
			break;
		case 2: 
		//SUBTRA��O SEM RETORNO COM PAR�METRO
		calc.subtracao(10, 5);
		System.out.print("O resultado da subtra��o �: " + calc.resultado +'\n');
			break;
		case 3: 
		//DIVIS�O SEM PARAMETRO E COM RETORNO
		System.out.print("A divis�o �: " + calc.divisao()+'\n');
			break;
		case 4: 	
		//MULTIPLICA��O COM PARAMETRO E COM RETORNO
		calc.multiplicacao(4,5);
		System.out.print("O resultado da multiplica��o � de: "+calc.multiplicacao(4,5));
			break;
		default:
			System.out.println("Numero Invalido");
		}
	}

}

