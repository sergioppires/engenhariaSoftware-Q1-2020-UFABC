package testes;

import dominios.Carro;
import requisitos.Requisito1;
import requisitos.Requisito2;

import java.util.ArrayList;
import java.util.List;

public class TestarRequisito2 {

    private List<Carro> criarListaCarroVazia(){
        List<Carro> listaCarro = new ArrayList<>();
        return listaCarro;
    };

    private List<Carro> criarListaCarroPreenchida(){
        List<Carro> listaCarro = new ArrayList<>();
        listaCarro.add(criarCarro());
        return listaCarro;
    };

    private Carro criarCarro(){
        Carro cliente = new Carro("BMX-1022",2019,"Etios","Toyota");
        return cliente;
    };

    public boolean testarAdicionarCarro(){
        List<Carro> listaCarro = this.criarListaCarroVazia();

        Requisito2 requisito2 = new Requisito2();
        requisito2.adicionarCarro(listaCarro, this.criarCarro());

        Carro carroTeste = listaCarro.get(0);

        if(carroTeste.getPlaca().equals("BMX-1022") && carroTeste.getAno() == 2019 && carroTeste.getModelo().equals("Etios") && carroTeste.getMarca().equals("Toyota")){
            return true;
        }
        return false;
    }

    public boolean testarRemoverCarro(){
        Requisito2 requisito2 = new Requisito2();
        List<Carro> listaCarro = this.criarListaCarroPreenchida();
        requisito2.removerCarro(listaCarro, this.criarCarro());

        if(listaCarro.size() <= 0){
            return true;
        }
        return false;
    }

}
