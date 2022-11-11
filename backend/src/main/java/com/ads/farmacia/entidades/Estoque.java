package com.ads.farmacia.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estoque")
public class Estoque implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codOperacao;
	private String dataValidade;
	private Long lote;
	private Integer qtdeCaixa;
	private Loja loja;
	private ProdForn produto;

	public Estoque() {
	}

	public Estoque(Integer codOperacao, String dataValidade, Long lote, Integer qtdeCaixa, Loja loja,
			ProdForn produto) {
		this.codOperacao = codOperacao;
		this.dataValidade = dataValidade;
		this.lote = lote;
		this.qtdeCaixa = qtdeCaixa;
		this.loja = loja;
		this.produto = produto;
	}

	public Integer getCodOperacao() {
		return codOperacao;
	}

	public void setCodOperacao(Integer codOperacao) {
		this.codOperacao = codOperacao;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Long getLote() {
		return lote;
	}

	public void setLote(Long lote) {
		this.lote = lote;
	}

	public Integer getQtdeCaixa() {
		return qtdeCaixa;
	}

	public void setQtdeCaixa(Integer qtdeCaixa) {
		this.qtdeCaixa = qtdeCaixa;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public ProdForn getProduto() {
		return produto;
	}

	public void setProduto(ProdForn produto) {
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codOperacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoque other = (Estoque) obj;
		return Objects.equals(codOperacao, other.codOperacao);
	}

}
