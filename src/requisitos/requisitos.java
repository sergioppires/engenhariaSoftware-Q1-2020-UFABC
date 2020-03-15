package requisitos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class requisitos {

    public HashMap<Integer, String> adicionarRequisito(HashMap<Integer, String> requisitos){
        HashMap<Integer, String> requisitosAux = requisitos;

        return requisitosAux;
    }

    public HashMap<Integer, String> removerRequisito(HashMap<Integer, String> requisitos){
        HashMap<Integer, String> requisitosAux = requisitos;

        return requisitosAux;
    }

    public static void printarRequisitos(HashMap<Integer, String> requisitos){
        requisitos.forEach((chave, valor) ->{
            System.out.println("ID: " + chave + " - " + valor);
        });
    }

    public static String retornarRequisitos(int id){
        HashMap<Integer, String> requisitos = carregarRequisitos();
        return requisitos.get(id);
    }

    public static HashMap<Integer, String> carregarRequisitos(){
        HashMap<Integer, String> requisitos = new HashMap<>();
        requisitos.put(0,"Alugar Carro");
        requisitos.put(1,"Devolver Carro (Sem Atraso)");
        requisitos.put(2,"Devolver Carro (Com Atraso)");
        requisitos.put(3,"Verificar Disponibilidade do Carro");
        requisitos.put(4,"Adicionar Carro na Frota");
        requisitos.put(5,"Remover Carro da Frota");
        return requisitos;
    }

}
