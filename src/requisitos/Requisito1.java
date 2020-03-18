package requisitos;

import dominios.Dominio1;

import java.util.List;

public class Requisito1 {

    //Adicionar e remover clientes

    public void adicionarDominio1(List<Dominio1> listaDominio1, Dominio1 dominio1){
        listaDominio1.add(dominio1);
    }

    public void removerDominio1
            (List<Dominio1> listaDominio1, Dominio1 dominio1){
        for (Dominio1 clientes: listaDominio1) {
            int index = 0;
            if(clientes.getCpf().equals(dominio1.getCpf())){
                listaDominio1.remove(index);
                break;
            }
            index++;
        }
    }

}
