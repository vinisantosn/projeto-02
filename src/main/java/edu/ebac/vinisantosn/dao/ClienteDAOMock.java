package edu.ebac.vinisantosn.dao;

import edu.ebac.vinisantosn.domain.Cliente;

import java.util.Collection;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public Boolean cadastrar(Cliente entity) {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
//    @Override
//    public Boolean salvar(Cliente cliente) {
//        return true;
//    }
//
//    @Override
//    public Cliente buscarPorCPF(Long cpf) {
//        Cliente cliente = new Cliente();
//        cliente.setCpf(cpf);
//        return cliente;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//
//    }
}
