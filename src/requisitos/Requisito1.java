package requisitos;

import dominios.Cliente;

import java.util.List;

public class Requisito1 {

    //Adicionar e remover clientes

    public void adicionarCliente(List<Cliente> listaCliente, Cliente cliente){
        listaCliente.add(cliente);
    }

    public void removerCliente(List<Cliente> listaCliente, Cliente cliente){
        listaCliente.forEach(lista ->{
            if(lista.getCpf().equals(cliente.getCpf())){
                listaCliente.remove(cliente);
            }
        });

    }

}
