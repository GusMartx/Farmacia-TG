package com.ads.farmacia.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_prod_forn")
public class ProdForn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codBarras;
	private double preco;
	private ArrayList<Produto> produto;
	private ArrayList<Fornecedor> fornecedor;

	public ProdForn() {
	}

	public ProdForn(Integer codBarras, ArrayList<Produto> produto, ArrayList<Fornecedor> fornecedor) {
		this.codBarras = codBarras;
		this.produto = produto;
		this.fornecedor = fornecedor;
	}

	public Integer getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(Integer codBarras) {
		this.codBarras = codBarras;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ArrayList<Produto> getProduto() {
		return produto;
	}

	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}

	public ArrayList<Fornecedor> getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(ArrayList<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codBarras);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdForn other = (ProdForn) obj;
		return Objects.equals(codBarras, other.codBarras);
	}

}
