<div name="readme-top">
    <h1 align=center>CAPÍTULO 4</h1>
</div>

>**Capítulo 4 - Introdução à redes de comunicação**

---

<details>
    <summary><span>📌 Índice</span></summary>

- [INTRODUÇÃO](#introdução) 
- [A ORIGEM DAS REDES DE COMUNICAÇÃO](#a-origem-das-redes-de-comunicação)
- [ARPANET: O EMBRIÃO DA INTERNET](#arpanet-o-embrião-da-internet)
- [DAS REDES DE COMPUTADORES À INTERNET DAS COISAS (IOT)](#das-redes-de-computadores-à-internet-das-coisas-iot)
- [A NECESSIDADE DE PROTOCOLOS E ORIGEM DA ARQUITETURA TCP/IP](#a-necessidade-de-protocolos-e-origem-da-arquitetura-tcpip)
- [CLASSIFICAÇÂO DAS REDES DE COMUNICAÇÃO](#classificação-das-redes-de-comunicação)
- [CONSIDERAÇÕES FINAIS](#considerações-finais)
- [GLOSSÁRIO](#glossário)

</details>

---

# INTRODUÇÃO

| Nome                    | Descrição                                                                                                                                                                                                                                       |
|:------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| LAN: Local Area Network | Redes de computadores que conectam dispositivos em uma área limitada, como uma sala, prédio ou campus, usando cabos, fibra óptica ou ondas de rádio.                                                                                            |
| Cabos Coaxiais          | Os cabos coaxiais transmitem sinais de alta frequência com baixa perda. Eles são usados em redes de computadores, TV a cabo e outras transmissões de dados. Transmitem sinais elétricos.                                                        |
| Cabos de Par Trançado   | Os cabos de par trançado são usados em muitas redes de computadores. Eles são feitos de pares de fios de cobre. Transmitem sinais elétricos.                                                                                                    |
| Fibra Óptica            | Os cabos de fibra óptica são feitos de vidro ou plástico. Eles transmitem sinais de luz em vez de sinais elétricos.                                                                                                                             |
| Ondas de Rádio          | As ondas de rádio são usadas em redes sem fio. Elas transmitem sinais de rádio em vez de sinais elétricos.                                                                                                                                      |
| WIRELESS                | Redes sem fio são redes de computadores que conectam dispositivos sem usar cabos. Eles usam ondas de rádio.                                                                                                                                     |
| IOT                     | Internet das Coisas (IoT) é uma rede de dispositivos físicos, veículos, eletrodomésticos e outros itens incorporados com sensores, software e outras tecnologias para conectar e trocar dados com outros dispositivos e sistemas pela internet. |

1960 - Guerra Fria

EUA com receio de um ataque nuclear, pensaram em uma forma de manter a comunicação entre as bases militares.

Investimento em 4 centros de pesquisa: Stanford; Universidade de Los Angeles; Universidade de Santa Barbara; Universidade de Utah.

Rede financiada pela DARPA (Defense Advanced Research Projects Agency).

Rede inicial teve o nome de ARPANET (Advanced Research Projects Agency Network).

NSF (National Science Foundation) criou a NSFNET, que interligava universidades e centros de pesquisa.

Agora era possível a comunicação entra a costa leste e oeste dos EUA via rede ARPANET.

EUA se uniu no ínicio dos anos 1970 à Londres, Noruega (Universidade de Bergen) e Europa continental.

Conexão entre tais redes de universidade -> INTERNET (Inter Network).

INTERNET substitui então a ARPANET.

INTERNET no Brasil foi em 1981 quando um professor envia dados para EUA.

Na década de 1980, anos a frente, um consórcio entre algumas universidades do brasil, com financiamento da 
FAPESP (Fundação de Amparo à Pesquisa do Estado de São Paulo), permitiu a conexão definitiva com a INTERNET.

Na segunda metade de 1990, a INTERNET se tornou comercial no Brasil, surgindo assim as empresas provedoras de acesso à 
INTERNET.

MODEM permite o PC (Personal Computer) por meiod a rede telefônica a um provedor de acesso, que, por sua vez, se 
conectava à INTERNET.

Ainda na década de 90, TIM BERNERS-LEE, um físico britânico, criou a WORLD WIDE WEB (WWW), que é uma estrutura de troca
de informações a partir de hypertextos.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# A ORIGEM DAS REDES DE COMUNICAÇÃO

A **rede de comunicação** se constitui de **um conjunto de dois ou mais dispositivos que se interligam com o objetivo de
trocar informações e, quando possível, compartilhar recursos computacionais**.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# ARPANET: O EMBRIÃO DA INTERNET

1996 - EUA, através da DARPA (Defense Advanced Research Projects Agency), iniciou projetos para interligação de 
computadores em centro militares e de pesquisa, com o objetivo de criar um sistema distribuído de comunicação com fins
militares.

Final de 1960 e começo de 1970 - Começo de uma rede de comunicação denominada ARPANET (Advanced Research Projects Agency 
Network), que conectava, incialmente, 4 centros de pesquisa: Stanford Research Institute, Universidade da Califórnia
em Los Angeles, Universidade de Santa Barbara e Universidade de Utah.

ARPANET tinha como objetivo formar uma arquitetura de rede de computadores robusta e que pudesse continuar operando 
mesmo com a perda de um conjunto de dispositivos de comunicação, amntendo a comunicação com os restantes. Para isso, o
sistema de comunicação deveria permitir a utilização de diversos tipos de dispositivos, ser dividido em diversos níveis
de protocolosdistintos para permitir a evolução independente de cada um deles e ser baseado em tranferência de pedaços
de informação, denominados **'pacotes de dados'**.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# DAS REDES DE COMPUTADORES À INTERNET DAS COISAS (IOT)

**Internet das Coisas** designa a conexão avançada de dispositivos, de sistemas e de serviços. Ultrapassa o conceito 
tradicional M2M (Machine to Machine) e abrange uma variedade de protocolos, domínios e aplicações.

IOT emergiu dos avanços de várias área, como sistemas embarcados, microeletrônica, comunicação e sensoriamento.

IoT nada mais é que uma extensão da Internet atual, que proporciona aos objetos do dia a dia, mas com capacidade
computacional e de comunicação, se conectarem à Internet.

Na IoT, a unidade básica de harware se apresenta ao menos de uma das seguintes maneiras:
1. Unidade(s) de processamento
2. Unidade(s) de memória
3. Unidade(s) de comunicação
4. Unidade(s) de sensor(es) ou atuador(es)

Aos dispositivos com essas qualidades é dado o nome de **objetos inteligentes (Smart Objects)**.

| Década | Acontecimento                                                                                                                                                                                                    |
|:-------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1960   | Surgimento da ARPANET nos EUA, conectando incialmente 4 universidades: Universidade da Califórnia em Los Angeles; Stanford Research Institute; Universidade da Califórnia em Santa Bárbara; Universidade de Utah |
| 1970   | <ul><li>Criação da arquitetura TCP/IP</li><li>Criação do primeiro software para troca de e-mails</li><li>Criação do primeiro computador pessoal Altair, por Bill Gates</li></ul >                                |
| 1980   | <ul><li>Criação do termo Internet</li><li>Surgimento do primeiro provedor de acesso à Internet</li></ul>                                                                                                         |
| 1990   | <ul><li>Criação do primeiro navegador WWW (browser) gráfico</li><li>A Internet se torna comercial é há um grande crescimento no Acesso</li><li>Surgimento da Internet das Coisas</li></ul>                       |
| 2000   | <ul><li>Popularização do uso da Internet</li><li>Uso da telefonia móvel e utilização das redes sem fio</li></ul>                                                                                                 |
| 2010   | <ul><li>Popularização da Internet das Coisas</li><li>As conexões do Brasil aos EUA, África e Europa, por meio de cabos ópticos submarinos, alcançam velocidades superiorres a 100 Gbps</li></ul>                 |
| 2020   | <ul><li>A RNP realiza testes de transmissão a 100 Gbps em seu backbone nacional e em sua ligação com os EUA</li></ul>                                                                                            |

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# A NECESSIDADE DE PROTOCOLOS E ORIGEM DA ARQUITETURA TCP/IP

| | |
<p align="right">(<a href="#readme-top">back to top</a>)</p>

# CLASSIFICAÇÂO DAS REDES DE COMUNICAÇÃO

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# CONSIDERAÇÕES FINAIS

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# GLOSSÁRIO

| Sigla                      | Descrição                                                                                                                                                                                                                                                                    |
|:---------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| host                       |                                                                                                                                                                                                                                                                              |
| Internet                   |                                                                                                                                                                                                                                                                              |
| Internet e Internetworking | internet (com letra minúscula) e internetworking são termos usados para definir uma rede genérica formada pela interligação de redes utilizando o protocolo TCP/IP, por exemplo, três redes isoladas que decidem trocar informações entre si utilizando a arquitetura TCP/IP |

<p align="right">(<a href="#readme-top">back to top</a>)</p>
