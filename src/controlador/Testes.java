package controlador;

import testes.TestarRequisito1;
import testes.TestarRequisito2;
import testes.TestarRequisito3;

public class Testes {

    public static void testar(){

        System.out.println("Início da etapa de testes. \n");
        TestarRequisito1 testarRequisito1 = new TestarRequisito1();
        if(testarRequisito1.testarAdicionarDominio1() && testarRequisito1.testarRemoverDominio1()){
            System.out.println("Requisito 1 Testado com Sucesso");
        }

        TestarRequisito2 testarRequisito2 = new TestarRequisito2();
        if(testarRequisito2.testarAdicionarDominio2() && testarRequisito2.testarRemoverDominio2()){
            System.out.println("Requisito 2 Testado com Sucesso");
        }

        TestarRequisito3 testarRequisito3 = new TestarRequisito3();
        if(testarRequisito3.testarAlugarDominio1() && testarRequisito3.testarVerificarDominio3Dominio1() && testarRequisito3.testarVerificarDominio3Dominio2()){
            System.out.println("Requisito 3 Testado com Sucesso");
        }

    }
}
