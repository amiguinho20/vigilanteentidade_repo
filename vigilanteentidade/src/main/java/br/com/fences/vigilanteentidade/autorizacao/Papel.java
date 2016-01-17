package br.com.fences.vigilanteentidade.autorizacao;

import java.io.Serializable;
import java.util.List;

//-- Role
public class Papel implements Serializable{

	private static final long serialVersionUID = 3305830767388253350L;
	
	private String descricao;
	
	private List<Permissao> permissoes;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
	
}
