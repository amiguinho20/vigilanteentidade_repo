package br.com.fences.vigilanteentidade.negocio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
//@NamedQueries({
//	@NamedQuery(
//		name="Alerta.listarAlertas",
//		query="select a from Alerta a order by a.dataCriacao desc"
//	)
//})
public class Alerta implements Serializable{

	private static final long serialVersionUID = -6540170386772156017L;
	
	@Id 
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	private Date dataCriacao;
	private Date dataRecepcao;
	
	@Embedded
	private Endereco endereco;
	
	@Embedded
	private Veiculo veiculo;
	
	@ManyToOne
	private Usuario usuarioRecepcao;
	
	@ManyToOne
	private Usuario usuarioCriacao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataRecepcao() {
		return dataRecepcao;
	}

	public void setDataRecepcao(Date dataRecepcao) {
		this.dataRecepcao = dataRecepcao;
	}

	public Usuario getUsuarioRecepcao() {
		return usuarioRecepcao;
	}

	public void setUsuarioRecepcao(Usuario usuarioRecepcao) {
		this.usuarioRecepcao = usuarioRecepcao;
	}

	public Usuario getUsuarioCriacao() {
		return usuarioCriacao;
	}

	public void setUsuarioCriacao(Usuario usuarioCriacao) {
		this.usuarioCriacao = usuarioCriacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	

}
