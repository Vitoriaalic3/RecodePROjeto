package modelo;

public class ItensPedido {
	    	  
	    public Pedido getPedido() {
		return Pedido;
	}
	public void setPedido(Pedido pedido) {
		Pedido = pedido;
	}
	public int getValor() {
		return Valor;
	}
	public void setValor(int valor) {
		Valor = valor;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
		private Pedido Pedido;	    	   
	    private int Valor;
	    private String Descricao;
}
