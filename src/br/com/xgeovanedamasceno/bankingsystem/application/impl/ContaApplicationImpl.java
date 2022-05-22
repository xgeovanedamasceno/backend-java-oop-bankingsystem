package br.com.xgeovanedamasceno.bankingsystem.application.impl;

import br.com.xgeovanedamasceno.bankingsystem.application.IContaApplication;
import br.com.xgeovanedamasceno.bankingsystem.domain.Conta;

import br.com.xgeovanedamasceno.bankingsystem.repository.impl.ContaRepositoryImpl;

public class ContaApplicationImpl implements IContaApplication {
    private ContaRepositoryImpl contaRepository;
    @Override
    public void create(Conta conta) {
        contaRepository.create(conta);
    }

    @Override
    public void read(Conta conta) {
        contaRepository.read(conta);
    }

    @Override
    public void update(Conta conta) {
        contaRepository.read(conta);
    }

    @Override
    public void delete(Conta conta) {
        contaRepository.delete(conta);
    }
}
