package testes;

import dominios.Dominio3;
import dominios.Dominio2;
import dominios.Dominio1;
import requisitos.Requisito3;

import java.util.ArrayList;
import java.util.List;

public class TestarRequisito3 {

    private Dominio2 criarCarro(){
        Dominio2 cliente = new Dominio2("BMX-1022",2019,"Etios","Toyota");
        return cliente;
    };

    private Dominio1 criarCliente(){
        Dominio1 dominio1 = new Dominio1("Marcelinho Carioca","35810120523",48,"Rua do Teste, 125");
        return dominio1;
    };

    private List<Dominio3> criarListaAluguelVazia(){
        List<Dominio3> listaDominio3 = new ArrayList<>();
        return listaDominio3;
    };

    private List<Dominio3> criarListaAluguelPreenchida(){
        List<Dominio3> listaDominio3 = new ArrayList<>();
        Dominio2 dominio2 = criarCarro();
        Dominio1 dominio1 = criarCliente();
        listaDominio3.add(new Dominio3(dominio1.getCpf(), dominio2.getPlaca()));
        return listaDominio3;
    };

    public boolean testarAlugarCarro(){
        List<Dominio3> listaDominio3 = criarListaAluguelVazia();
        Requisito3 requisito3 = new Requisito3();
        requisito3.alugarCarro(listaDominio3,criarCliente(),criarCarro());
        if(listaDominio3.size() == 1){
            return true;
        }
        return false;
    };

    public boolean testarVerificarAluguelCarro(){
        List<Dominio3> listaDominio3 = criarListaAluguelPreenchida();
        Requisito3 requisito3 = new Requisito3();
         return requisito3.verificarAluguelCarro(listaDominio3,criarCarro());
    };

    public boolean testarVerificarAluguelCliente(){
        List<Dominio3> listaDominio3 = criarListaAluguelPreenchida();
        Requisito3 requisito3 = new Requisito3();
        return requisito3.verificarAluguelCliente(listaDominio3,criarCliente());
    };

}
