package testes;

import dominios.Dominio3;
import dominios.Dominio2;
import dominios.Dominio1;
import requisitos.Requisito3;

import java.util.ArrayList;
import java.util.List;

public class TestarRequisito3 {

    private Dominio2 criarDominio1(){
        Dominio2 dominio2 = new Dominio2("BMX-1022",2019,"Etios","Toyota");
        return dominio2;
    };

    private Dominio1 criarDominio2(){
        Dominio1 dominio1 = new Dominio1("Marcelinho Carioca","35810120523",48,"Rua do Teste, 125");
        return dominio1;
    };

    private List<Dominio3> criarListaDominio3Vazia(){
        List<Dominio3> listaDominio3 = new ArrayList<>();
        return listaDominio3;
    };

    private List<Dominio3> criarListaDominio3Preenchida(){
        List<Dominio3> listaDominio3 = new ArrayList<>();
        Dominio2 dominio2 = criarDominio1();
        Dominio1 dominio1 = criarDominio2();
        listaDominio3.add(new Dominio3(dominio1.getCpf(), dominio2.getPlaca()));
        return listaDominio3;
    };

    public boolean testarAlugarDominio1(){
        List<Dominio3> listaDominio3 = criarListaDominio3Vazia();
        Requisito3 requisito3 = new Requisito3();
        requisito3.alugarDominio1(listaDominio3,criarDominio2(),criarDominio1());
        if(listaDominio3.size() == 1){
            return true;
        }
        return false;
    };

    public boolean testarVerificarDominio3Dominio1(){
        List<Dominio3> listaDominio3 = criarListaDominio3Preenchida();
        Requisito3 requisito3 = new Requisito3();
         return requisito3.verificarDominio3Dominio1(listaDominio3,criarDominio1());
    };

    public boolean testarVerificarDominio3Dominio2(){
        List<Dominio3> listaDominio3 = criarListaDominio3Preenchida();
        Requisito3 requisito3 = new Requisito3();
        return requisito3.verificarDominio3Dominio2(listaDominio3,criarDominio2());
    };

}
