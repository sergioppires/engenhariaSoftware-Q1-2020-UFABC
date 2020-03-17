import controlador.*;
import requisitos.Requisito1;
import requisitos.Requisito2;
import requisitos.Requisito3;
import testes.TestarRequisito1;
import testes.TestarRequisito2;
import testes.TestarRequisito3;

import java.util.List;

public class main {

    public static void main(String[] args) {

        System.out.println("Bem vindo ao Software de Aluguel de Carros.");
        System.out.println("");
        System.out.println("Agora vamos coletar os requisitos.");
        List<Integer> listaRequisitos = controlador.controleRequisitos();

        System.out.println("Requisitos Levantados.");
        System.out.println("");
        System.out.println("Agora vamos começar a parte da codificação.");
        if(listaRequisitos.size() == 1){
            Requisito1 requisito1 = new Requisito1();
        }
        if(listaRequisitos.size() >= 2){
            Requisito2 requisito2 = new Requisito2();
        }
        if(listaRequisitos.size() == 3){
            Requisito3 requisito3 = new Requisito3();
        }

        System.out.println("");
        System.out.println("Início da etapa de testes.");
        System.out.println("");
        TestarRequisito1 testarRequisito1 = new TestarRequisito1();
        if(testarRequisito1.testarAdicionarCliente() && testarRequisito1.testarRemoverCliente()){
            System.out.println("Requisito 1 Testado com Sucesso");
        }

        TestarRequisito2 testarRequisito2 = new TestarRequisito2();
        if(testarRequisito2.testarAdicionarCarro() && testarRequisito2.testarRemoverCarro()){
            System.out.println("Requisito 2 Testado com Sucesso");
        }

        TestarRequisito3 testarRequisito3 = new TestarRequisito3();
        if(testarRequisito3.testarAlugarCarro() && testarRequisito3.testarVerificarAluguelCarro() && testarRequisito3.testarVerificarAluguelCliente()){
            System.out.println("Requisito 3 Testado com Sucesso");
        }





    }

}
