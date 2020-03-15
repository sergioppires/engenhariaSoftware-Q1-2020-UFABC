package requisitos;

import dominios.Carro;
import dominios.Cliente;


import java.util.List;

public class Requisito2 {

    //Adicionar e remover Carros

    public void adicionarCarro(List<Carro> listaCarro, Carro carro){
        listaCarro.add(carro);
    }

    public void removerCarro(List<Carro> listaCarro, Carro carro){
        for (Carro carroObj: listaCarro) {
            int index = 0;
            if(carroObj.getPlaca().equals(carroObj.getPlaca())){
                listaCarro.remove(index);
                break;
            }
            index++;
        }
    }

}
