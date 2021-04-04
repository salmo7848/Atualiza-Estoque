package treino_Extends;

public class OperadorUm {
	protected String nome;
	protected double valor;
	protected int quantidade;
	
	
	public OperadorUm(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public double valEstq() {
		return quantidade *valor;
	}
	

	public String toString() {
		return  "Nome: "
				+ nome 
				+ "\nValor: R$" 
				+ String.format("%.2f", valor);
	}
	
	
	

}
