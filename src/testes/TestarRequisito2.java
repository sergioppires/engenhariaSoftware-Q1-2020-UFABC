package testes;

import dominios.Dominio2;
import requisitos.Requisito2;

import java.util.ArrayList;
import java.util.List;

public class TestarRequisito2 {

    private List<Dominio2> criarListaCarroVazia(){
        List<Dominio2> listaDominio2 = new ArrayList<>();
        return listaDominio2;
    };

    private List<Dominio2> criarListaCarroPreenchida(){
        List<Dominio2> listaDominio2 = new ArrayList<>();
        listaDominio2.add(criarCarro());
        return listaDominio2;
    };

    private Dominio2 criarCarro(){
        Dominio2 cliente = new Dominio2("BMX-1022",2019,"Etios","Toyota");
        return cliente;
    };

    public boolean testarAdicionarCarro(){
        List<Dominio2> listaDominio2 = this.criarListaCarroVazia();

        Requisito2 requisito2 = new Requisito2();
        requisito2.adicionarCarro(listaDominio2, this.criarCarro());

        Dominio2 dominio2Teste = listaDominio2.get(0);

        if(dominio2Teste.getPlaca().equals("BMX-1022") && dominio2Teste.getAno() == 2019 && dominio2Teste.getModelo().equals("Etios") && dominio2Teste.getMarca().equals("Toyota")){
            return true;
        }
        return false;
    }

    public boolean testarRemoverCarro(){
        Requisito2 requisito2 = new Requisito2();
        List<Dominio2> listaDominio2 = this.criarListaCarroPreenchida();
        requisito2.removerCarro(listaDominio2, this.criarCarro());

        if(listaDominio2.size() <= 0){
            return true;
        }
        return false;
    }

}
