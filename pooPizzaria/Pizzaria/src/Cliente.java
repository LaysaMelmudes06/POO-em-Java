import java.util.Scanner;
public class Cliente {
	 
	String nome;
	String endereco;
	String telefone;
	

public void fazerPedido() {
	
	System.out.println("Meu pedido é uma pizza de 4 queijos");
}
public void cancelarPedido() {
	
	System.out.println("Cancele todos os pedidos por demora");
}
public void cadastrarCliente() {
	
	Scanner leitor = new Scanner(System.in);
	System.out.println("Qual é o seu nome? ");
	this.nome = leitor.nextLine();
	System.out.println("Qual é o seu Endereço? ");
	this.endereco = leitor.nextLine();
	System.out.println("Qual é o seu Telefone? ");
	this.telefone = leitor.nextLine();
}
public void exibirDados() {
	System.out.println("Nome: " + this.nome);
	System.out.println("Endereço: " + this.endereco);
	System.out.println("Telefone: " + this.telefone);
}
}
