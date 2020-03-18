package testes;

import dominios.Dominio1;
import requisitos.Requisito1;

import java.util.ArrayList;
import java.util.List;

public class TestarRequisito1 {

    private List<Dominio1> criarListaDominio1Vazia(){
        List<Dominio1> listaDominio1 = new ArrayList<>();
        return listaDominio1;
    };

    private List<Dominio1> criarListaDominio1Preenchida(){
        List<Dominio1> listaDominio1 = new ArrayList<>();
        listaDominio1.add(criarDominio1());
        return listaDominio1;
    };

    private Dominio1 criarDominio1(){
        Dominio1 dominio1 = new Dominio1("Marcelinho Carioca","35810120523",48,"Rua do Teste, 125");
        return dominio1;
    };



    public boolean testarAdicionarDominio1(){
        List<Dominio1> listaDominio1 = this.criarListaDominio1Vazia();

        Requisito1 requisito1 = new Requisito1();
        requisito1.adicionarDominio1(listaDominio1, this.criarDominio1());

        Dominio1 dominio1Teste = listaDominio1.get(0);

        if(dominio1Teste.getNome().equals("Marcelinho Carioca") && dominio1Teste.getCpf().equals("35810120523") && dominio1Teste.getIdade() == 48 && dominio1Teste.getEndereco().equals("Rua do Teste, 125")){
            return true;
        }
        return false;
    }

    public boolean testarRemoverDominio1(){
        Requisito1 requisito1 = new Requisito1();
        List<Dominio1> listaDominio1 = this.criarListaDominio1Preenchida();
        requisito1.removerDominio1(listaDominio1, this.criarDominio1());

        if(listaDominio1.size() <= 0){
            return true;
        }
        return false;
    }


}
