import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Cliente cli = new Cliente();
		
		cli.cadastrarCliente();
		
		cli.exibirDados();
		
		cli.fazerPedido();
	}

}
