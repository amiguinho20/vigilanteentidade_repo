package br.com.fences.vigilanteentidade.negocio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 * O formato base64 eh mais adequado para gravacao e recuperacao no banco, porem eh mais pesado.
 * E o formato imagemByte eh mais adequado para upload e download, por ser mais leve.
 *
 */
@Embeddable
public class VeiculoImagem implements Serializable {

	private static final long serialVersionUID = 3104824597399451663L;
	
	//-- atributo utilizado para gravacao e recuperacao do banco de dados
	@Transient
	private String imagemBase64;
	
	//-- atributo utilizado para trafego, upload e download
	private byte[] imagemByte;
	private Date ultimaAtualizacao;
	
	public String getImagemBase64() {
		return imagemBase64;
	}

	public void setImagemBase64(String imagemBase64) {
		this.imagemBase64 = imagemBase64;
	}

	public byte[] getImagemByte() {
		return imagemByte;
	}

	public void setImagemByte(byte[] imagemByte) {
		this.imagemByte = imagemByte;
	}

	public Date getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(Date ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}
	
	
	
}
