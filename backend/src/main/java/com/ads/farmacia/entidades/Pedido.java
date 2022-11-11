package com.ads.farmacia.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numPedido;
	private String dataCriacao;
	private ItemPedido itemPedido;
	private Loja loja;

	public Pedido() {
	}

	public Pedido(Integer numPedido, String dataCriacao, ItemPedido itemPedido, Loja loja) {
		this.numPedido = numPedido;
		this.dataCriacao = dataCriacao;
		this.itemPedido = itemPedido;
		this.loja = loja;
	}

	public ItemPedido getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}

	public Integer getNumPedido() {
		return numPedido;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public Loja getLoja() {
		return loja;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(numPedido, other.numPedido);
	}

}
