package com.ads.farmacia.entidades;

import java.io.Serializable;
import java.util.Objects;


public class Loja implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Integer cnpj;
	public String logradouro;
	public Integer numero;
	public Integer cep;
	public String complemento;
	public String cidade;
	public String uf;
	public Integer ddd;
	public Integer telefone;
	public String franquia;

	public Loja() {
	}

	public Loja(Integer cnpj, String logradouro, Integer cep, Integer telefone, String franquia) {
		this.cnpj = cnpj;
		this.logradouro = logradouro;
		this.cep = cep;
		this.telefone = telefone;
		this.franquia = franquia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public Integer getDdd() {
		return ddd;
	}

	public String getFranquia() {
		return franquia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		return Objects.equals(cnpj, other.cnpj);
	}

}
