package com.j.carlo.course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nomeRua;
	private String numCasa;
	private String cep;
	private String bairro;
	private String complemento;
	private String estado;
	private String cidade;
	
	public Endereco() {
	}

	public Endereco(String nomeRua, String numCasa, String cep, String bairro, String complemento, String estado,
			String cidade) {
		super();
		this.nomeRua = nomeRua;
		this.numCasa = numCasa;
		this.cep = cep;
		this.bairro = bairro;
		this.complemento = complemento;
		this.estado = estado;
		this.cidade = cidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(String numCasa) {
		this.numCasa = numCasa;
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
		return "Endereco [id=" + id + ", nomeRua=" + nomeRua + ", numCasa=" + numCasa + ", cep=" + cep + ", bairro="
				+ bairro + ", complemento=" + complemento + ", estado=" + estado + ", cidade=" + cidade + "]";
	}
}
