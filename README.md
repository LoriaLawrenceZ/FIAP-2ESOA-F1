<div name="readme-top">
    <h1 align=center>CAPÍTULO 5</h1>
</div>

>**Capítulo 5 - Arquiteturas e modelo de referência em redes**

---

<details>
    <summary><span>📌 Índice</span></summary>

- [DAS ORIGENS DAS REDES À INDEPENDÊNCIA DOS NÍVEIS DE EVOLUÇÃO](#das-origens-das-redes-à-independência-dos-níveis-de-evolução)
- [MODELO OSI DA ISO](#modelo-osi-da-iso)
- [A PILHA DE PROTOCOLOS NA ARQUITETURA TCP/IP](#a-pilha-de-protocolos-na-arquitetura-tcpip)
    - [Comparação entre o modelo OSI e TCP/IP](#comparação-entre-o-modelo-osi-e-tcpip)
- [A COMUNICAÇÃO EM REDES SEGUINDO UMA ARQUITETURA](#a-comunicação-em-redes-seguindo-uma-arquitetura)
- [EXEMPLO DE COMUNICAÇÃO SEGUINDO A ARQUITETURA TCP/IP](#exemplo-de-comunicação-seguindo-a-arquitetura-tcpip)
    - [Passo 1: A Camada de Aplicação](#passo-1-a-camada-de-aplicação)
    - [Passo 2: A Camada de Transporte](#passo-2-a-camada-de-transporte)
    - [Passo 3: A Camada de Rede](#passo-3-a-camada-de-rede)
    - [PAsso 4: A Camada de Acesso à Rede](#passo-4-a-camada-de-acesso-à-rede)
    - [Análise Realizada pelos Protocolos no Destino](#análise-realizada-pelos-protocolos-no-destino)
- [CONSIDERAÇÕES FINAIS](#considerações-finais)

</details>

---

# DAS ORIGENS DAS REDES À INDEPENDÊNCIA DOS NÍVEIS DE EVOLUÇÃO

Durante as décadas de 1960 e 1970 foram ciradas muitas tecnologias de redes, sendo que cada uma apresentava uma 
estrutura específica de hardware. Essas estruturas eram de arquitetura monolítica, o que significava que os 
desenvolvedores trabalhavam com todos os elementos (todos os níveis) envolvidos no processo, sem separação. Um mesmo
desenvolvedor tinha que se procupar com o sistema, o hardware envolvido na comunicação e no meio de transmissão.

Essa forma de desenho era pouoco prática, uma vez que, com esse grande bloco de informações, todos os elementos tinham
que ser modificados caso ocorrsse uma pequena mudança em alguma parte da estrutura.

Surgiu então a necessidade de definição de uma arquitetura que fosse padrão para as redes, o que permitiria que 
equipamentos de fabricantes distintos pudessem se interconectar, além de permitir independência entre os níveis. 

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# MODELO OSI

O modelo OSI (Open Systems Interconnection) apresenta uma organização em camadas, ou módulos, para as funcionalidades
envolvidas em uma comincação em redes. Assim não temos mais uma estrutura monolítica, na qual um fabricante terá que 
cuidar de toda a tecnologia envolvida na comunicação em rede. Um fabricante poderá desenvolver sua tecnologia em uma ou
mais camadas. Outros fabricantes poderão desenvolver suas tecnologias na mesma ou em outras camadas, também seguindo os
padrões definidos. Ao final, visto que todos sigam os padrões definidos pelo modelo, a interoperabildade entre os
diferentes fabricantes se dará naturalmente, uma vez que o padrão definido em cada camada prevê a interface com os
padrões definidos para as outras camadas.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# MODELO OSI DA ISO

A **ISO (International Organization for Standardization)** foi uma das primeiras organizações a definir formalmente uma 
arquitetura-padrão, ou modelo, com o objetivo de facilitar o processo de interconectividade entre máquiinas de 
diferentes fabricantes. Assim, em 1984, tornou disponível o modelo chamado **OSI (Open Systems Interconnection)**, ou
**modelo OSI**.

Trata-se de um modelo que estabelece padrões e orientações para que ocorra a interconectividade de dois dispositivos de
rede, independentemente das empresas envolvidas na fabricação das tecnologias envolvidas.

Esse conceito de modelo baseado em sete camadas foi fornecido por **Charles Bachman**. A evolução do projeto OSI começou 
a partir da experiência com a ARPANET.

Assim, seguindo a lógica da organização de padrões em camadas, o desenvolvedor de um sistema deverá seguir padrões 
definidos para a camada respectiva ao seu sistema sem ter que conhecer as tecnologias de outras camadas. 

Isso é muito vantajoso e facilita a evolução tecnológica, já que o desenvolvimento em uma camada não afetará 
necessariamente todas as demais camadas.

Modelo OSI serve de base para que ocorra a comunicação em qualquer tipo de rede (curta, média ou longa distância), 
independente dos fabricantes envolvidos. O surgimento do modelo permitiu então a padronização e interoperabilidade 
(operação entre sistemas de fabricantes distintos).

O modelo OSI organiza suas orientações em pilhas de protocolos, ou **camadas**. Cada camada organiza um conjunto de 
regras que define como serão realizados a operação e o intercâmbio das informações entre dois sistemas. Todas as funções
necessárias para que ocorra a interconectivbidade de dispositivos de rede foram organizadas em sete camadas no modelo 
OSI, numerados de 1 a 7.

![img.png](./img/img1.png)

O modelo é composto por sete camadas e cada uma delas realiza funções específicas no processo de comunicação em redes.
As camadas do modelo OSI são:

- **Camada 7 - Aplicação** (application)
- **Camada 6 - Apresentação** (presentation)
- **Camada 5 - Sessão** (session)
- **Camada 4 - Transporte** (transport)
- **Camada 3 - Rede** (network)
- **Camada 2 - Enlace** (data link)
- **Camada 1 - Física** (physical)

Os padrões estão organizados no modelo OSI de forma que entre cada camada exista um padrão para interface. Esse padrão 
para interface permite que as tecnologias situadas em camadas diferentes troquem informações entre si. O padão também
define quais primitivas, operações e serviços uma camada inferior oferece à camada imediatamente superior. Cada camada é
independente e executa somente suas funções, independente das funções de outras camadas.

Apesar da divisão em sete níveis no modelo OSI, pode-se considerar genericamente que as três camadas mais baixas do 
modelo cuidam dos aspectos relacionados à transmissão propriamente dita, a quarta camada lida com comunicação fim a fim,
enquanto as três camadas superiores apresentam os aspectos relacionados à aplicação, que fornece a interface com o 
usuário do sistema.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# A PILHA DE PROTOCOLOS NA ARQUITETURA TCP/IP

Apesar do modelo OSI ser a referência para o estudo e a nomenclatura dos níveis de atuação das tecnologias envolvidas 
nas redes de comunicação, a arquitetura TCP/IP surgiu com os priomórdios da Internet e está em uso até os dias de hoje
tanto nas redes internas (intranets) como na Internet, tornando a arquitetura mais referenciada pela indústria 
atualmente.

A arquitetura TCP/IP é composto por quatro camadas (formando a pilha da estrutura do protocolo).

![img.png](./img/img2.png)

O TCP/IP teve origem em um estudo feito pelos pesquisadores estadunidenses **Vinton Cerf** e **Robert Kahn** (1974), que
propuseram um grupo de protocolos centrais parar satisfazer as seguintes necessidades na então ARPANET:

- Permitir o roteamento entre redes diferentes (chamadas *subnets* ou sub-redes).
- Garantir a independência da tecnologia de redes utilizada para poder conectar as sub-redes.
- Tornar o uso de hardware na rede independente do seu fabricante.
- Possibilitar a recuperação de falhas ocorridas durante uma transmissão.

Originalmente os protocolos propostos foram chamados de NCP (Network Control Protocol), mas em 1978 passaram a ser
chamados de **TCP/IP**.

Em 1980, o DARPA começou a implementar o TCP/IP na ARPANET, dando origem à Internet. Em 1983, o DARPA finalizou a 
conversão de todos os seus computadores e exigiu a implementação do TCP/IP em todos os computadores que desejassem se
conectar à ARPANET.

A arquitetura TCP/IP (assim como o modelo de referência OSI da ISO) realiza a divisão de funções do sistema de 
comunicação de redes em uma estrutura de camadas. Na arquitetura TCP/IP as camadas são: aplicação, transporte, rede 
(também referenciada como Internet) e acesso à rede. Assim como no modelo OSI/ISO, as camadas TCP/IP são representadas
por uma pilha.

A família de protocolos TCP/IP foi pioneira na utilização do conceito de níveis, formando uma arquitetura estruturada, 
racional e simples, fácil de modificar. Posteriormente, a ISO adotou esses conceitos para criar o modelo OSI.

Atualmente, o conjunto de protocolos TCP/IP inclui muitos protocolos. Os protocolos individuais são organizados em 
camadas que usam o modelo de protocolo TCP/IP: aplicação, transporte, rede (ou Internet) e acesso à rede. Os protocolos 
que compõem o TCP/IP são específicos para as camadas de aplicação, transporte e Internet. Os protocolos de camada de 
acesso à rede são responsáveis pela entrega do pacote IP pelo meio físico. Esses protocolos da camada inferior foram
desenvolvidos por várias empresas de padrões.

A arquitetura TCP/IP é implementada como uma pilha de protocolos TCP/IP nos dispositicos de origem e destino envolvidos 
na comunicação prover entrega fim a fim de aplicações pela rede. Os protocolos Ethernet são usados para transmitir o
pacote IP pelo meio físico usado pela rede local (LAN)

![img.png](./img/img3.png)

## Comparação entre o modelo OSI e TCP/IP

Enquanto o modelo OSI organiza seus padrões em sete camadas, a arquitetura TCP/IP é composta por quatro camadas 
(formando a pilha de protocolos da estrutura TCP/IP) e, na prática, as camadas 5, 6 e 7 do modelo OSI foram mescladas 
para formar a camada de aplicação do TCP/IP. Já as camadas 3 e 4 do modelo OSI são similares às camadas 2 e 3 do TCP/IP,
inclusive a camada de transporte do TCP/IP tem o mesmo nome, porém a camada 3 do modelo OSI (rede) no TCP/IP, muitas 
vezes, é referenciada como camada Internet. Por fim, as camadas 1 e 2 do modelo OSI foram mescladas no TCP/IP para 
formar a camada de acesso aos meios ou acesso à rede.

![img.png](./img/img4.png)

Na camada de acesso à rede, a pilha de protocolos TCP/IP não especifica que protocolos usar ao transmitir por um meio
físico, ele descreve somente a transmissãod a camada de Internet aos protocolos da rede física. As camadas 1 e 2 do
modelo OSI discutem os procedimentos necessários para acessar a mídia e o meio físico para enviar dados por uma rede.

A camada 3 é usada para descrever os protocolos que endereçam e encaminham mensagens em uma rede.

A camada 4 descreve os serviços e as funções gerais que fornecem uma entrega ordenada e confiável de dados entre os 
*hosts* origem e destino.

A camada de aplicações TCP/IP inclui uma série de protocolos que fornecem uma funcionalidade específica a uma variedade
de aplicações de usuário final. As camadas 5, 6 e 7 do modelo OSI são usadas como referências para desenvolvedores e 
fornecedores de software de aplicação para produzir produtos que operem nas redes.

Ambos os modelos TCP/IP e OSI são usados geralmente para referenciar protocolos em várias camadas. Como o modelo OSI
separa a camada de enlace de dados da camada física, geralmente é usado para referenciar as camadas inferiores.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# A COMUNICAÇÃO EM REDES SEGUINDO UMA ARQUITETURA

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# EXEMPLO DE COMUNICAÇÃO SEGUINDO A ARQUITETURA TCP/IP

## Passo 1: A Camada de Aplicação

## Passo 2: A Camada de Transporte

## Passo 3: A Camada de Rede

## PAsso 4: A Camada de Acesso à Rede

## Análise Realizada pelos Protocolos no Destino

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# CONSIDERAÇÕES FINAIS

<p align="right">(<a href="#readme-top">back to top</a>)</p>



