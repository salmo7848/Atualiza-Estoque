package treino_Extends;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtensionOperator extends OperadorUm{
    protected Date data;
    

	
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date x1 = new Date();
    
	public ExtensionOperator(String nome, double valor, int quantidade, Date data) {
		super(nome, valor, quantidade);
		this.data = data;
	}
	
    
    public void addEstq(int quantidade) {
    	this.quantidade +=quantidade;
    }
    
    public void remEstq(int quantidade) {
    	this.quantidade -=quantidade;
    }

    public double prevEstq() {
    	super.valEstq();
    	return valor * 4;
    	
    }
	public String toString() {
		
		return  "\nQuantidade: "
				+ quantidade
				+"\nValor em estoque: R$"
				+String.format("%.2f", valEstq()) 
				+"\ndata e hora da atualização: " 
				+ String.format(sdf2.format(x1), data) 
				+"\nPrevisão a manter em reserva do estoque: R$"
				+String.format("%.2f", prevEstq()) ;
	}
    
    
}


