package testes;

import dominios.Dominio2;
import requisitos.Requisito2;

import java.util.ArrayList;
import java.util.List;

public class TestarRequisito2 {

    private List<Dominio2> criarListaDominio2Vazia(){
        List<Dominio2> listaDominio2 = new ArrayList<>();
        return listaDominio2;
    };

    private List<Dominio2> criarListaDominio2Preenchida(){
        List<Dominio2> listaDominio2 = new ArrayList<>();
        listaDominio2.add(criarDominio2());
        return listaDominio2;
    };

    private Dominio2 criarDominio2(){
        Dominio2 cliente = new Dominio2("BMX-1022",2019,"Etios","Toyota");
        return cliente;
    };

    public boolean testarAdicionarDominio2(){
        List<Dominio2> listaDominio2 = this.criarListaDominio2Vazia();

        Requisito2 requisito2 = new Requisito2();
        requisito2.adicionarDominio2(listaDominio2, this.criarDominio2());

        Dominio2 dominio2Teste = listaDominio2.get(0);

        if(dominio2Teste.getPlaca().equals("BMX-1022") && dominio2Teste.getAno() == 2019 && dominio2Teste.getModelo().equals("Etios") && dominio2Teste.getMarca().equals("Toyota")){
            return true;
        }
        return false;
    }

    public boolean testarRemoverDominio2(){
        Requisito2 requisito2 = new Requisito2();
        List<Dominio2> listaDominio2 = this.criarListaDominio2Preenchida();
        requisito2.removerDominio2(listaDominio2, this.criarDominio2());

        if(listaDominio2.size() <= 0){
            return true;
        }
        return false;
    }

}
