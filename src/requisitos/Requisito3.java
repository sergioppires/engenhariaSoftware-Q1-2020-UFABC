package requisitos;

import dominios.Aluguel;
import dominios.Carro;
import dominios.Cliente;

import java.util.List;

public class Requisito3 {

    public void alugarCarro(List<Aluguel> listaAluguel, Cliente cliente, Carro carro){
        Aluguel aluguelObj = new Aluguel(cliente.getCpf(), carro.getPlaca());
        listaAluguel.add(aluguelObj);
    }

    public boolean verificarAluguelCarro(List<Aluguel> listaAluguel, Carro carro){
        for (Aluguel lista : listaAluguel) {
            if(lista.getPlaca().equals(carro.getPlaca())){
                return true;
            }
        }
        return false;
    }

    public boolean verificarAluguelCliente(List<Aluguel> listaAluguel, Cliente cliente){
        for (Aluguel lista : listaAluguel) {
            if(lista.getCpf().equals(cliente.getCpf())){
                return true;
            }
        }
        return false;
    }



}
