package requisitos;

import dominios.Aluguel;
import dominios.Carro;
import dominios.Cliente;

import java.util.List;

public class Requisito3 {

    private void alugarCarro(List<Aluguel> listaAluguel, Cliente cliente, Carro carro){
        Aluguel aluguelObj = new Aluguel();
        aluguelObj.setCpf(cliente.getCpf());
        aluguelObj.setPlaca(carro.getPlaca());
        listaAluguel.add(aluguelObj);
    }

    private boolean verificarAluguelCarro(List<Aluguel> listaAluguel, Carro carro){
        for (Aluguel lista : listaAluguel) {
            if(lista.getPlaca().equals(carro.getPlaca())){
                return true;
            }
        }
        return false;
    }

    private boolean verificarAluguelCliente(List<Aluguel> listaAluguel, Cliente cliente){
        for (Aluguel lista : listaAluguel) {
            if(lista.getCpf().equals(cliente.getCpf())){
                return true;
            }
        }
        return false;
    }



}
