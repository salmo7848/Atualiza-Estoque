package treino_Extends;

import java.util.Date;
import java.util.Scanner;

public class TelaUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		
		OperadorUm dados = new OperadorUm(nome, preco, quantidade);
		ExtensionOperator  dadosUm= new ExtensionOperator(nome, preco, quantidade, new Date());
		System.out.println(" ");
		
		System.out.println(dados+"\nValor em estoque: R$"+dados.valEstq());
		System.out.println(" ");
		
		System.out.print("Quantidade a adicionar: ");	
		quantidade = sc.nextInt();
		dadosUm.addEstq(quantidade);
		
		System.out.println("Dados atualizados ");
		System.out.println(dados+""+dadosUm);
		System.out.println(" ");
		
		System.out.print("Quantidade a remover: ");	
		quantidade = sc.nextInt();
		dadosUm.remEstq(quantidade);
		
		System.out.println("Dados atualizados ");
		System.out.println(dados+""+dadosUm);

		sc.close();
	}

}
