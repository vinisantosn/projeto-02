package edu.ebac.vinisantosn;

import edu.ebac.vinisantosn.dao.ClienteDAOMock;
import edu.ebac.vinisantosn.dao.IClienteDAO;
import edu.ebac.vinisantosn.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {
    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDAO = new ClienteDAOMock();
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setNome("Vinicius Santos");
        cliente.setCpf(12345678901L);
        cliente.setCidade("São Luis");
        cliente.setEnd("Rua Java");
        cliente.setEstado("Maranhão");
        cliente.setNumero(10);
        cliente.setTel(98912345678L);
        clienteDAO.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void excluirCliente(){
        clienteDAO.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente(){
        clienteDAO.alterar(cliente);
    }
}
