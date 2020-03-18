package controlador;

import requisitos.ListaRequisitos;
import requisitos.Requisito1;
import requisitos.Requisito2;
import requisitos.Requisito3;

import java.util.List;

public class Codificacao {

    public static ListaRequisitos cirarCodificacao(List<Integer> listaRequisitos){
        System.out.println("Agora vamos começar a parte da codificação.");
        Requisito1 requisito1 = null;
        Requisito2 requisito2 = null;
        Requisito3 requisito3 = null;

        if(listaRequisitos.size() <= 1){
            requisito1 = new Requisito1();
        }
        if(listaRequisitos.size() <= 2){
            requisito2 = new Requisito2();
        }
        if(listaRequisitos.size() <= 3){
            requisito3 = new Requisito3();
        }

        ListaRequisitos listaRequisitosCodificados = new ListaRequisitos(requisito1,requisito2,requisito3);
        return listaRequisitosCodificados;
    }

}
