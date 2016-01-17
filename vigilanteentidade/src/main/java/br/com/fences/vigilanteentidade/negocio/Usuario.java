package br.com.fences.vigilanteentidade.negocio;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@SessionScoped
@Entity
//@NamedQueries({
//	@NamedQuery(
//		name="Usuario.consulta",
//		query="select u from Usuario u where u.email = :email"
//	),
//	@NamedQuery(
//		name="Usuario.listarUsuarios",
//		query="select u from Usuario u"
//	),
//	@NamedQuery(
//		name="Usuario.autenticar",
//		query="select u from Usuario u where u.email = :email and u.password = :password"
//	)
//})
public class Usuario implements Serializable{

	private static final long serialVersionUID = 9027832592082395417L;

	@Id 
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	private String email;
	
	private String password;

	private String cpf;
	
	private String rg;
	
	private String nome;
	
	private String celular;

	private Date dataCriacao;
	
	private Date dataAtualizacao;
	
	private boolean ativo;
	
	@Embedded
	private Endereco endereco = new Endereco();
	
	@Embedded
	private Veiculo veiculo = new Veiculo();
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
