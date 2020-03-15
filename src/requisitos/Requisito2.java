package requisitos;

import dominios.Carro;


import java.util.List;

public class Requisito2 {

    //Adicionar e remover clientes

    public void adicionarCliente(List<Carro> listaCarro, Carro carro){
        listaCarro.add(carro);
    }

    public void removerCliente(List<Carro> listaCarro, Carro carro){
        listaCarro.forEach(lista ->{
            if(lista.getPlaca().equals(carro.getPlaca())){
                listaCarro.remove(carro);
            }
        });

    }

}
