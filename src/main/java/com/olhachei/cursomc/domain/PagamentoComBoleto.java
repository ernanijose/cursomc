package com.olhachei.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.olhachei.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;

	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto()
	{}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	public Date getDataVencimento() {
		return dataVencimento;
	}

	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}		
	
}
