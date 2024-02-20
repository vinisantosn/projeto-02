package edu.ebac.vinisantosn;

import edu.ebac.vinisantosn.dao.ClienteDAOMock;
import edu.ebac.vinisantosn.dao.IClienteDAO;
import edu.ebac.vinisantosn.domain.Cliente;
import edu.ebac.vinisantosn.services.ClienteService;
import edu.ebac.vinisantosn.services.IClienteService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }
    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setNome("Vinicius Santos");
        cliente.setCpf(12345678901L);
        cliente.setCidade("São Luis");
        cliente.setEnd("Rua Java");
        cliente.setEstado("Maranhão");
        cliente.setNumero(10);
        cliente.setTel(98912345678L);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente(){
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente(){
        cliente.setNome("Vinícius Santos");
        clienteService.alterar(cliente);
        Assert.assertEquals("Vinícius Santos",cliente.getNome());
    }

}
