package com.indra.treinamento.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String descricao;

	@NotNull
	@Positive
	private BigDecimal preco;

	@NotNull
	private TipoTributacao tipoTriputacao;

	@NotNull
	@PositiveOrZero
	private BigDecimal aliquotaImposto;

	@NotNull
	@ManyToOne
	private Categoria categoria;

	private LocalDateTime criadoEM = LocalDateTime.now();

	private LocalDateTime atualizadoEm;

	@Deprecated
	public Produto() {
	}

	public Produto(@NotBlank String descricao, @Positive BigDecimal preco, @NotNull TipoTributacao tipoTributacao,
			@PositiveOrZero BigDecimal aliquotaImposto, @NotNull Categoria categoria) {
		this.descricao = descricao;
		this.preco = preco;
		this.tipoTriputacao = tipoTributacao;
		this.aliquotaImposto = aliquotaImposto;
		this.categoria = categoria;
	}

	public void update(Produto produto) {
		this.descricao = produto.getDescricao();
		this.preco = produto.getPreco();
		this.tipoTriputacao = produto.getTipoTriputacao();
		this.aliquotaImposto = produto.getAliquotaImposto();
		this.categoria = produto.getCategoria();
		this.atualizadoEm = produto.getAtualizadoEm();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public TipoTributacao getTipoTriputacao() {
		return tipoTriputacao;
	}

	public void setTipoTriputacao(TipoTributacao tipoTriputacao) {
		this.tipoTriputacao = tipoTriputacao;
	}

	public BigDecimal getAliquotaImposto() {
		return aliquotaImposto;
	}

	public void setAliquotaImposto(BigDecimal aliquotaImposto) {
		this.aliquotaImposto = aliquotaImposto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public LocalDateTime getCriadoEM() {
		return criadoEM;
	}

	public void setCriadoEM(LocalDateTime criadoEM) {
		this.criadoEM = criadoEM;
	}

	public LocalDateTime getAtualizadoEm() {
		return atualizadoEm;
	}

	public void setAtualizadoEm(LocalDateTime atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}

}
