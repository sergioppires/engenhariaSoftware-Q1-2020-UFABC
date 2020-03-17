package testes;

import dominios.Aluguel;
import dominios.Carro;
import dominios.Cliente;
import requisitos.Requisito3;

import java.util.ArrayList;
import java.util.List;

public class TestarRequisito3 {

    private Carro criarCarro(){
        Carro cliente = new Carro("BMX-1022",2019,"Etios","Toyota");
        return cliente;
    };

    private Cliente criarCliente(){
        Cliente cliente = new Cliente("Marcelinho Carioca","35810120523",48,"Rua do Teste, 125");
        return cliente;
    };

    private List<Aluguel> criarListaAluguelVazia(){
        List<Aluguel> listaAluguel = new ArrayList<>();
        return listaAluguel;
    };

    private List<Aluguel> criarListaAluguelPreenchida(){
        List<Aluguel> listaAluguel = new ArrayList<>();
        Carro carro = criarCarro();
        Cliente cliente = criarCliente();
        listaAluguel.add(new Aluguel(cliente.getCpf(),carro.getPlaca()));
        return listaAluguel;
    };

    public boolean testarAlugarCarro(){
        List<Aluguel> listaAluguel = criarListaAluguelVazia();
        Requisito3 requisito3 = new Requisito3();
        requisito3.alugarCarro(listaAluguel,criarCliente(),criarCarro());
        if(listaAluguel.size() == 1){
            return true;
        }
        return false;
    };

    public boolean testarVerificarAluguelCarro(){
        List<Aluguel> listaAluguel = criarListaAluguelPreenchida();
        Requisito3 requisito3 = new Requisito3();
         return requisito3.verificarAluguelCarro(listaAluguel,criarCarro());
    };

    public boolean testarVerificarAluguelCliente(){
        List<Aluguel> listaAluguel = criarListaAluguelPreenchida();
        Requisito3 requisito3 = new Requisito3();
        return requisito3.verificarAluguelCliente(listaAluguel,criarCliente());
    };

}
