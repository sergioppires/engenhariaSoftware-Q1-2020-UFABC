import controlador.*;
import requisitos.ListaRequisitos;
import requisitos.Requisito1;
import requisitos.Requisito2;
import requisitos.Requisito3;
import testes.TestarRequisito1;
import testes.TestarRequisito2;
import testes.TestarRequisito3;

import java.util.List;

public class main {

    public static void main(String[] args) {

        System.out.println("Bem vindo ao Processo Genérico de criação de Software. \n");

        List<Integer> listaRequisitos = Requisitos.criarRequisitos();
        System.out.println("Requisitos Levantados. \n");

        ListaRequisitos listaRequisitosCodificados = Codificacao.cirarCodificacao(listaRequisitos);
        System.out.println("Codificação Concluida! \n");

        Testes.testar();
        System.out.println("Testes Concluidos! \n");

        Producao.producao();
        System.out.println("Produção Concluido! \n");
    }

}
