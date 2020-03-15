package controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import utils.*;
import requisitos.*;

public class controlador {

    public static void controleRequisitos(){
        System.out.println("Inicio da etapa de Requisitos");
        System.out.println("");
        List<Integer> controladorRequisitos = new ArrayList<>();
        HashMap<Integer, String> features =  requisitos.carregarRequisitos();
        requisitos.printarRequisitos(features);

        System.out.println("");
        System.out.println("Digite o numero na linha abaixo");

        Scanner input = new Scanner(System.in);
        String id = input.nextLine();
        adicionarRequisito(id);




        return;
    }

    public static void adicionarRequisito(String id){
        if (utils.isNumeric(id)){
            int featureId = Integer.parseInt(id);
        } else {
            System.out.println("Por favor, digite o numero correspondente ao requisito que você quer adicionar:");
        }

    }

}
