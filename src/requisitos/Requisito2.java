package requisitos;

import dominios.Dominio2;


import java.util.List;

public class Requisito2 {

    //Adicionar e remover Dominio2

    public void adicionarDominio2(List<Dominio2> listaDominio2, Dominio2 dominio2){
        listaDominio2.add(dominio2);
    }

    public void removerDominio2(List<Dominio2> listaDominio2, Dominio2 dominio2){
        for (Dominio2 dominio2Obj : listaDominio2) {
            int index = 0;
            if(dominio2Obj.getPlaca().equals(dominio2Obj.getPlaca())){
                listaDominio2.remove(index);
                break;
            }
            index++;
        }
    }

}
