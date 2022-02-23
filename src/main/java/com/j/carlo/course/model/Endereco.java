package com.j.carlo.course.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {
	
	@Id
	private String cep;
	private String bairro;
	private String complemento;
	private String estado;
	private String cidade;
	
	public Endereco() {
	}

	public Endereco(String cep, String bairro, String complemento, String estado, String cidade) {
		this.cep = cep;
		this.bairro = bairro;
		this.complemento = complemento;
		this.estado = estado;
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", bairro=" + bairro + ", complemento=" + complemento + ", estado=" + estado
				+ ", cidade=" + cidade + "]";
	}

}
