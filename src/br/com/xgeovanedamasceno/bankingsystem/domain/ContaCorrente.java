package br.com.xgeovanedamasceno.bankingsystem.domain;

import br.com.xgeovanedamasceno.bankingsystem.domain.Cliente;
import br.com.xgeovanedamasceno.bankingsystem.domain.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
}
