package requisitos;

import dominios.Dominio3;
import dominios.Dominio2;
import dominios.Dominio1;

import java.util.List;

public class Requisito3 {

    public void alugarDominio1(List<Dominio3> listaDominio3, Dominio1 dominio1, Dominio2 dominio2){
        Dominio3 dominio3Obj = new Dominio3(dominio1.getCpf(), dominio2.getPlaca());
        listaDominio3.add(dominio3Obj);
    }

    public boolean verificarDominio3Dominio1(List<Dominio3> listaDominio3, Dominio2 dominio2){
        for (Dominio3 lista : listaDominio3) {
            if(lista.getPlaca().equals(dominio2.getPlaca())){
                return true;
            }
        }
        return false;
    }

    public boolean verificarDominio3Dominio2(List<Dominio3> listaDominio3, Dominio1 dominio1){
        for (Dominio3 lista : listaDominio3) {
            if(lista.getCpf().equals(dominio1.getCpf())){
                return true;
            }
        }
        return false;
    }



}
