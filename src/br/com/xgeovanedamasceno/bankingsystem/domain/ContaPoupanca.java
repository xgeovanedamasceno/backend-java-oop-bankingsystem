package br.com.xgeovanedamasceno.bankingsystem.domain;

import br.com.xgeovanedamasceno.bankingsystem.domain.Cliente;
import br.com.xgeovanedamasceno.bankingsystem.domain.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
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
		System.out.println("===Extrato Conta Poupança===");
		super.imprimirExtrato();
	}
}
