package edu.ebac.vinisantosn.dao;

import edu.ebac.vinisantosn.dao.generics.GenericDAO;
import edu.ebac.vinisantosn.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {
    public ClienteDAO(){
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
