package br.com.fences.vigilanteentidade.negocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import br.com.fences.vigilanteentidade.usuario.constante.CorVeiculo;
import br.com.fences.vigilanteentidade.usuario.constante.TipoVeiculo;

@Embeddable
public class Veiculo implements Serializable {

	private static final long serialVersionUID = -8243758573105360276L;
	
	private String placa;
	
	private String marca;
	
	private String modelo;
	
	private Short anoFabricacao;
	
	private Short anoModelo;
	
	private String observacao;
	
	private CorVeiculo cor;
	
	private TipoVeiculo tipo;
	
	@ElementCollection
	private List<VeiculoImagem> imagens = new ArrayList<>();
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Short getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Short anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Short getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Short anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public CorVeiculo getCor() {
		return cor;
	}
	public void setCor(CorVeiculo cor) {
		this.cor = cor;
	}
	public TipoVeiculo getTipo() {
		return tipo;
	}
	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}
	public List<VeiculoImagem> getImagens() {
		return imagens;
	}
	public void setImagens(List<VeiculoImagem> imagens) {
		this.imagens = imagens;
	}


}
