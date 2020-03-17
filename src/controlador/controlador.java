package controlador;

import java.util.ArrayList;
import java.util.List;


public class controlador {

    public static List<Integer> controleRequisitos(){
        System.out.println("Inicio da etapa de Requisitos");
        System.out.println("");
        List<Integer> controladorRequisitos = new ArrayList<>();
        controladorRequisitos.add(1);
        controladorRequisitos.add(2);
        controladorRequisitos.add(3);
        return controladorRequisitos;
    }

}
