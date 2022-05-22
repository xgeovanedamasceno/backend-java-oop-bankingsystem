package br.com.xgeovanedamasceno.bankingsystem.domain;

import br.com.xgeovanedamasceno.bankingsystem.domain.Cliente;
import br.com.xgeovanedamasceno.bankingsystem.domain.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Corrente===");
		super.imprimirExtrato();
	}
}
