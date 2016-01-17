package br.com.fences.vigilanteentidade.autorizacao;

import java.io.Serializable;

public class Permissao implements Serializable{

	private static final long serialVersionUID = -1672435664169547272L;

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
