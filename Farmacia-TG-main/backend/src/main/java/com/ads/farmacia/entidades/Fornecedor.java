package com.ads.farmacia.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer cnpj;
	public String logradouro;
	public Integer ibge;
	public Integer numero;
	public Integer cep;
	public String complemento;
	public String cidade;
	public String uf;
	public String telefone;
	public String razaoSocial;

	public Fornecedor() {
	}

	public Fornecedor(Integer cnpj, String logradouro, Integer ibge, Integer cep, String razaoSocial) {
		this.cnpj = cnpj;
		this.logradouro = logradouro;
		this.ibge = ibge;
		this.cep = cep;
		this.razaoSocial = razaoSocial;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public Integer getIbge() {
		return ibge;
	}

	public Integer getNumero() {
		return numero;
	}

	public Integer getCep() {
		return cep;
	}

	public String getUf() {
		return uf;
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
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(cnpj, other.cnpj);
	}

}
