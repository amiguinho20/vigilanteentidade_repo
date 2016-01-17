package br.com.fences.vigilanteentidade.autorizacao;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable{

	private static final long serialVersionUID = -3920721167742547193L;
	
	private String descricao;
	
	//-- existe apenas em folhas
	private Funcionalidade funcionalidade;
	
	//-- ManyToOne, JoinCollumn
	private Menu pai;
	
	//-- OneToMany
	private List<Menu> filhos;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionalidade getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(Funcionalidade funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public Menu getPai() {
		return pai;
	}

	public void setPai(Menu pai) {
		this.pai = pai;
	}

	public List<Menu> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Menu> filhos) {
		this.filhos = filhos;
	}
}
