package br.com.xgeovanedamasceno.bankingsystem.repository;

import br.com.xgeovanedamasceno.bankingsystem.domain.Conta;

public interface IContaRepository {
    public void create(Conta conta);
    public void read(Conta conta);
    public void update(Conta conta);
    public void delete(Conta conta);
}
