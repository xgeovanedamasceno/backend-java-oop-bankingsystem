package br.com.xgeovanedamasceno.bankingsystem.domain;

import br.com.xgeovanedamasceno.bankingsystem.application.IConta;

public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract void sacar(double valor);

	public abstract void depositar(double valor);

	public abstract void transferir(double valor, Conta contaDestino);

	public abstract void imprimirExtrato();
}
