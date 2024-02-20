package edu.ebac.vinisantosn.services;

import edu.ebac.vinisantosn.dao.ClienteDAO;
import edu.ebac.vinisantosn.dao.IClienteDAO;
import edu.ebac.vinisantosn.domain.Cliente;

public class ClienteService implements IClienteService {
    private IClienteDAO clienteDAO;
    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }
    @Override
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.cadastrar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) {
        clienteDAO.alterar(cliente);
    }
}
