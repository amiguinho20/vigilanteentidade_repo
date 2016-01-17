package br.com.fences.vigilanteentidade.autorizacao;

import java.io.Serializable;
import java.util.List;

public class Funcionalidade implements Serializable{

	private static final long serialVersionUID = -2342276954148048416L;

	private List<Permissao> permissoes;

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
	
	
}
