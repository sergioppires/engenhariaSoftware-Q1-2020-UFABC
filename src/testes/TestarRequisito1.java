package testes;

import dominios.Dominio1;
import requisitos.Requisito1;

import java.util.ArrayList;
import java.util.List;

public class TestarRequisito1 {

    private List<Dominio1> criarListaClienteVazia(){
        List<Dominio1> listaDominio1 = new ArrayList<>();
        return listaDominio1;
    };

    private List<Dominio1> criarListaClientePreenchida(){
        List<Dominio1> listaDominio1 = new ArrayList<>();
        listaDominio1.add(criarCliente());
        return listaDominio1;
    };

    private Dominio1 criarCliente(){
        Dominio1 dominio1 = new Dominio1("Marcelinho Carioca","35810120523",48,"Rua do Teste, 125");
        return dominio1;
    };



    public boolean testarAdicionarCliente(){
        List<Dominio1> listaDominio1 = this.criarListaClienteVazia();

        Requisito1 requisito1 = new Requisito1();
        requisito1.adicionarCliente(listaDominio1, this.criarCliente());

        Dominio1 dominio1Teste = listaDominio1.get(0);

        if(dominio1Teste.getNome().equals("Marcelinho Carioca") && dominio1Teste.getCpf().equals("35810120523") && dominio1Teste.getIdade() == 48 && dominio1Teste.getEndereco().equals("Rua do Teste, 125")){
            return true;
        }
        return false;
    }

    public boolean testarRemoverCliente(){
        Requisito1 requisito1 = new Requisito1();
        List<Dominio1> listaDominio1 = this.criarListaClientePreenchida();
        requisito1.removerCliente(listaDominio1, this.criarCliente());

        if(listaDominio1.size() <= 0){
            return true;
        }
        return false;
    }


}
