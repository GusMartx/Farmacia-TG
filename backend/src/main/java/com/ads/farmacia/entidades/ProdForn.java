package com.ads.farmacia.entidades;

import java.io.Serializable;
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
	private Produto produto;
	private Fornecedor fornecedor;
	private ItemPedido itemPedido;

	public ProdForn() {
	}

	public ProdForn(Integer codBarras, Produto produto, Fornecedor fornecedor) {
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public ItemPedido getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
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
