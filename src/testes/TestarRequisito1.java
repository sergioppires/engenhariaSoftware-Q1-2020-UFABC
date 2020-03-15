package testes;

import dominios.Cliente;
import requisitos.Requisito1;

import java.util.ArrayList;
import java.util.List;

public class TestarRequisito1 {

    private List<Cliente> criarListaClienteVazia(){
        List<Cliente> listaCliente = new ArrayList<>();
        return listaCliente;
    };

    private List<Cliente> criarListaClientePreenchida(){
        List<Cliente> listaCliente = new ArrayList<>();
        listaCliente.add(criarCliente());
        return listaCliente;
    };

    private Cliente criarCliente(){
        Cliente cliente = new Cliente("Marcelinho Carioca","35810120523",48,"Rua do Teste, 125");
        return cliente;
    };



    public boolean testarAdicionarCliente(){
        List<Cliente> listaCliente = this.criarListaClienteVazia();

        Requisito1 requisito1 = new Requisito1();
        requisito1.adicionarCliente(listaCliente, this.criarCliente());

        Cliente clienteTeste = listaCliente.get(0);

        if(clienteTeste.getNome().equals("Marcelinho Carioca") && clienteTeste.getCpf().equals("35810120523") && clienteTeste.getIdade() == 48 && clienteTeste.getEndereco().equals("Rua do Teste, 125")){
            return true;
        }
        return false;
    }

    public boolean testarRemoverCliente(){
        Requisito1 requisito1 = new Requisito1();
        List<Cliente> listaCliente = this.criarListaClientePreenchida();
        requisito1.removerCliente(listaCliente, this.criarCliente());

        if(listaCliente.size() <= 0){
            return true;
        }
        return false;
    }


}
