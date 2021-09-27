package entities;

import java.util.Date;

public class ProdutosHigine extends Produto{
	private Funcao funcao;
	private Date validade;

	public ProdutosHigine(String name, Double price, Funcao funcao, Date validade) {
		super(name, price);
		this.funcao = funcao;
		this.validade = validade;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
}
