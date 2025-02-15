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
  - [LAN (Local Area Network)](#lan-local-area-network)
  - [WAN (Wide Area Network)](#wan-wide-area-network)
  - [MAN (Metropolitan Area Network)](#man-metropolitan-area-network)
  - [WMAN (Wireless Metropolitan Area Network)](#wman-wireless-metropolitan-area-network)
  - [WLAN (Wireless Local Area Network)](#wlan-wireless-local-area-network)
  - [PAN (Personal Area Network)](#pan-personal-area-network)
  - [SAN (Storage Area Network)](#san-storage-area-network)
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

Um protocolo pode ser definido como uma conveção, um padrão ou uma regra que controla e possibilita uma conexão, 
comunicação e a transferência de dados entre dispositivos computacionais. Os protocolos podem ser implementados nos
dispositivos pelo hardware, software ou por uma combinação dos dois em um processo de comunicação.

> Como se chegou a um protocolo aceito por todo o mundo e que permitisse a troca de informações entre os mais diversos
> dispositivos localizados nos pontos mais distantes do globo terrestre?

A ARPANET foi estruturada como uma rede de comutação de pacote de dados e a primeira rede a implementar um conjunto de 
protocolos conhecidos como **TCP/IP** (Transmission Control Protocol/Internet Protocol). O conceito de pacotes,
comutação de pacotes e os protocolos descritos no conjunto TCP/IP se tornaram a base técnica da Internet.

Em 1993 foram criados os protocolos **HTTP** (Hypertext Transfer Protocol) e **browser** (navegador) Mosaic, dando 
início à World Wide Web (WWW), que passaram a integrar a arquitetura TCP/IP

No Brasil, o acesso à Internet foi iniciado em 1989 com a conexão de instituições acadêmicas como a FAPESP, USP, Unicamp
e outras. Foram dois *backbones* (estrutura de ligação entre redes) regionais, a RedeRio e a ANSP (Academic Network at
São Paulo) interligando as principais instituições desses estados. Posteriormente, foi criado a RNP (Rede Nacional de
Pesquisa), com o objetivo de formar um *backbone* nacional de acesso à Internet e de estimular a formação de redes 
regionais, como a Rede Minas, Rede Tchâ e outras.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# CLASSIFICAÇÂO DAS REDES DE COMUNICAÇÃO

As classificações das redes mais comuns estão baseadas em sua abrangência geográfica (alcance) da rede.

Principais definições geográficas:

## LAN (Local Area Network)

Rede de comunicação local. Termo local é utilizado para delimitar uma pequena área geográfica, como uma casa, 
escritório, andar de um prédio, departamento de uma empresa ou a rede de uma empresa.

>Quando termina uma LAN?

Uma rede termina em um dispositivo que interliga a rede local a uma rede maior ou outra rede local. Esse dispositivo é 
nomeado de **roteador**, que fornecerá o ***gateway*** (ponto de entrada e saída para rede local).

## WAN (Wide Area Network)

Rede de longa distância. Trata-se de uma infraestrutura de rede que permite a conexão de equipamentos (ou redes menores) 
em uma grande área geográfica. A WAN serve de infraestrutura para conexão entre redes locais localizadas em pontos 
distantes.

>Um exemplo de WAN é a própria Internet

## MAN (Metropolitan Area Network)

Termo era muito utilizado quando se desejava interligar equipamentos (ou redes locais LAN) espalhados em uma área 
geográfica delimitada por uma cidade (ou cidades vizinhas). Assim, contratava-se uma infraestrutura de comunicação de 
uma operadora de telecomunicações para interligar os locais (como dois prédios de uma empresa em locais distintos da
cidade).

Essa nomenclatura também foi bastante utilizada no início das redes para TV a cabo, em que uma empresa utilizava uma
infraestrutura de comunicação própria ou contratada especificamente para inteligar um ou mais pontos da empresa até as 
residências de seus clientes.

Apesar de ainda existir muitas redes do tipo MAN nas grandes cidades, é uma nomenclatura que poderá cair em desuso à 
medida que as empresas e as residências optam por interligar suas redes por meio do uso de infraestrutura provida pela
Internet.

## WMAN (Wireless Metropolitan Area Network)

Trata-se de uma rede MAN conectada por recursos sem fio (antenas, satélites). Apesar de pouco referenciada, trata-se da 
conexão de dispositivos ou redes locais distribuídas em pontos distantes em uma área metropolitana.

## WLAN (Wireless Local Area Network)

Trata-se de uma espicificidade de uma rede local LAN, na qual se utilizam recursos sem fio (wireless, geralmente do tipo
Wi-Fi) como meio de comunicação entre os dispositivos. Exemplo mais comuns são as redes sem fio em residências e 
pequenas organizações.

## PAN (Personal Area Network)

Rede de comunicação entre dispositivos próximos e que utilizam recursos via Bluetooth (tecnologia de comunicação sem fio 
ponto a ponto). Um exempli é a conexão entre um celular e uma caixa de som. O termo também está evoluindo para 
referenciar também a conexão entre os "dispositivos vestíveis" e dispositivos que funcionam como sensores em ambientes.

## SAN (Storage Area Network)

Infraestrutura de comunicação destinada a interligar dispositivos para armazenamento de dados, ou seja, utilizada na
interligação de *storages*, servidores e dispositivos que permitem a interligação desses equipamentos. Esse tipo de rede 
geralmente é encontrado em data centers para permitir uma maior velocidade de conexão entre os dispositivos de 
armazenamento de dados.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# CONSIDERAÇÕES FINAIS

Há organizações que foram desenvolvidas com o propósito de ajudar a manter a estrutura e a padronização de protocolos e 
processos da Internet. Essas organizações incluem: IETF (Internet Engineering Task Force), ICANN (Internet Corporation
for Assigned Names and Numbers), IAB (Internet Architecture Board) e outras.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# GLOSSÁRIO

| Sigla                      | Descrição                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
|:---------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| host                       | Qualquer dispositico (computador, celular, geladeira, relógio e etc.) conectado a uma rede, podendo oferecer informações, recursos, serviços e aplicações aos usuários ou outros equipamentos (hosts) em uma rede de comunicação. Todo host na Internet precisa obrigatoriamente ter configurado a arquitetura TCP/IP e possuir um endereço único e exclusivo (o seu identificador) fornecido por meio dessa arquitetura: **endereço IP**                                                               |
| Internet                   | Um nome próprio utilizado para denominar uma rede mundial de comunicação que interliga redes de comunicação do mundo inteiro. É formada pela conexão entre centenas de milhares de redes menores. A Internet tem suas políticas controladas pelo IAB (Internet Architecture Board), um fórum patrocinado pela Internet Society, uma comunidade aberta formada por usuários, fabricantes, representantes governamentais e pesquisadores. Assim pode-se dizer que a gestão da Internet é descentralizada. |
| Internet e Internetworking | internet (com letra minúscula) e internetworking são termos usados para definir uma rede genérica formada pela interligação de redes utilizando o protocolo TCP/IP, por exemplo, três redes isoladas que decidem trocar informações entre si utilizando a arquitetura TCP/IP                                                                                                                                                                                                                            |

<p align="right">(<a href="#readme-top">back to top</a>)</p>
