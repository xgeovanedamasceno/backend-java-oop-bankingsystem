package br.com.xgeovanedamasceno.bankingsystem.application;

import br.com.xgeovanedamasceno.bankingsystem.domain.Conta;

public interface IContaApplication {
	
	void create(Conta conta);

	void read(Conta conta);
	void update(Conta conta);
	
	void delete(Conta conta);
}
