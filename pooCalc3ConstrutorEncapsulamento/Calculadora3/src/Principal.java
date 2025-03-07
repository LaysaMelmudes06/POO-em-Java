import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);		
		Calculadora calc = new Calculadora();
		Calculadora cal = new Calculadora(1,1);

		int resul;	
		double numA;
		double numB;
		double resultado;
		
		System.out.println("Digite o 1� numero");
		calc.setNumA(leitor.nextDouble());
		System.out.println("Digite o 2� numero");
		calc.setNumB(leitor.nextDouble());
		
		
		System.out.println("Digite qual calculo voc� deseja realizar, 1-Soma 2-Subtra��o 3-Divis�o 4-Multiplicac�o");
		resul = leitor.nextInt();
		
switch(resul) {
		
		case 1: 		
		//SOMA SEM RETORNO E SEM PAR�METRO	
			calc.somatoria();
			break;
		case 2: 
		//SUBTRA��O SEM RETORNO COM PAR�METRO
			calc.subtracao(calc.getNumA(), calc.getNumB());
			System.out.print("O resultado da subtra��o �: " + calc.getResultado() +'\n');
			break;
		case 3: 
		//DIVIS�O SEM PARAMETRO E COM RETORNO		
			if(calc.getNumB()==0) {
				System.out.println("Calculo Invalido");
			}
			else {
				System.out.print("A divis�o �: " + calc.divisao()+'\n');
	
			}
			break;
		case 4: 	
		//MULTIPLICA��O COM PARAMETRO E COM RETORNO
			calc.multiplicacao(calc.getNumA(),calc.getNumB());
			System.out.print("O resultado da multiplica��o � de: "+ calc.getResultado());
			break;
		default:
			System.out.println("Numero Invalido");
		}
	}

}

