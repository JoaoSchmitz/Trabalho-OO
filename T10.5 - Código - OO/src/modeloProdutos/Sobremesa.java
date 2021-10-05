package modeloProdutos;

import modeloAbstratas.Produto;

public class Sobremesa extends Produto {

//Atributos
	private String tipoSobre;
	private String ingredientes;
	
	
//Construtores
	public Sobremesa(String tipo, String nomeSobre, String ingredSobre, double valorSobre) {
		tipoSobre = tipo;
		nome = nomeSobre;
		ingredientes = ingredSobre;
		valor = valorSobre;
	}
	
	
//Gets e sets
	public String getTipoSobre() {
		return tipoSobre;
	}

	public void setTipoSobre(String tipoSobre) {
		this.tipoSobre = tipoSobre;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

}
