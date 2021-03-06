Universidade Federal do ABC
Disciplina: Engenharia de Software 
Docente: Joao Marcelo Borovina Josko

Sergio Abilio Pereira Pires Junior 11009513
Vitor Cesar Cota Bonelli 11009113

==========//==========//==========//==========

Processo de Software as a Software (PSaaS)


Entendemos processo de software como um conjunto de etapas e métodos neccessárias para garantir o desenvolvimento, a qualidade e a manutenção de um software. 

Neste projeto apresentaremos um software em Java que materializa um processo de software com seus componentes mais primários. Suas denominações em ordem de execução são: Requisitos, Projeto, Construção, Teste, Implementação. A descrição de cada etapa do processo é descrita a seguir:

- Requisitos:
    Nesta etapa temos como objetivo o levantamento dos requisitos por parte dos desenvolvedores com as áreas de negócio. Nosso PSaaS tem como premissa um contexto genérico onde trabalhamos com três domínios distintos. Destes domínios, levantamos três requisitos (genéricos) com a área de negócio para projetar o software. O levantamento dos requisitos é chamado pelo software por meio do método criarRequisitos da classe Requisitos.

- Projeto:
    Nesta etapa os requisitos levantados são utilizados para projetar uma solução e validá-la com as áreas de negócio antes de iniciar o desenvolvimento. Podem ser utilizados diversos recursos de prototipação.
    
-Construção:
    Nesta etapa é onde o código é construido de forma a refletir a necessidade do cliente. A codificação é representada em nosso projeto pelo método criarCodificacao, da classe Codificacao, o qual passamos como entrada a lista de requisitos levantada na etapa anterior. A saída deste método enriquecerá uma lista de requisitos codificados.

- Teste:
    Nesta fase é onde testamos o código desenvolvido a fim de assegurar a qualidade do código e assegurar que a exigência dos requisitos levantados estão sendo atendidos.
    Em nosso caso, as classes de requisitos possuem como métodos a criação e remoção de objetos pertencentes às classes genéricas de domínios. O método testar da classe Testes é chamado, e para cada classe de requisito é realizada a verificação da funcionalidade destes métodos mencionados. 
    Exemplo: O objeto requisito1, da classe Requisito1, exige que hajam métodos no software para incluir ou remover objetos da classe Dominio1 a uma lista. A classe TestarRequisito1 possui métodos para verificar se esta regra será atendida.

- Implementação:
    Nesta fase é onde o software será exposto para utilização em produção. Simulamos esta fase com a disponibilização do código no diretório /out/production e com a chamada ao método producao da classe Producao.


==========//==========//==========//==========

Onde utilizar o código:

Em seu terminal, acessar o diretório raiz do projeto e executar os comandos:

javac src/main.java -d out/production -encoding UTF-8 -sourcepath src/

java -cp out/production main

==========//==========//==========//==========

