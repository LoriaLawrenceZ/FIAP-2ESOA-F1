<span align=center>
    
[`main`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/main) | [`cap-1`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-1) | [`cap-2`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-2) | [`cap-3`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-3) | [`cap-4`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-4) | [`cap-5`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-5) | [`cap-6`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-6) | [`cap-7`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-7) | [`cap-8`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-8) | [`cap-9`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-9) | [`cap-10`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-10)

</span>

<div name="readme-top">
    <h1 align=center>CAPÍTULO 9</h1>
</div>

>**Capítulo 9 - Com vocês o maravilhoso mundo dos dados**

---

<details>
    <summary><span>📌 Índice</span></summary>

- [DÉCADA DE 1970](#década-de-1970)
- [DÉCADA DE 1980](#década-de-1980)
- [CONCEITUANDO BANCO DE DADOS](#conceituando-banco-de-dados)
- [DIFERENCIANDO DADO E INFORMAÇÃO](#diferenciando-dado-e-informação)
  - [Qual a diferença entre Dado e Informação?](#qual-a-diferença-entre-dado-e-informação)
  - [Dados, Informação e Conhecimento](#dados-informação-e-conhecimento)
  - [Propriedades de um Banco de Dados](#propriedades-de-um-banco-de-dados)
  - [Conceituando Sistema Gerenciador de Banco de Dados](#conceituando-sistema-gerenciador-de-banco-de-dados)
  - [Conceituando Sistemas de Banco de Dados](#conceituando-sistemas-de-banco-de-dados)
- [VISUALIZANDO OS COMPONENTES DE UM *SISTEMA DE BANCO DE DADOS*](#visualizando-os-componentes-de-um-sistema-de-banco-de-dados)
- [CARACTERIZANDO UM *SISTEMA DE BANCO DE DADOS*](#caracterizando-um-sistema-de-banco-de-dados)
- [VANTAGENS DE UTILIZAR UM *SISTEMA DE BANCO DE DADOS*](#vantagens-de-utilizar-um-sistema-de-banco-de-dados)

</details>

---

# DÉCADA DE 1970

Edgar Frank Codd cria a abordagem relacional para o armazenamento dos dados, cuja estrutura lógica foi separada do método de armazenamento físico.

A abordagem relacional se tornou padrão para o armazenamento de dados.

![Exemplo de estrutura lógica do banco de dados](img/img1.png)

Entre 1974 e 1977 foram construídos os dois principais protótipos de sistemas gerenciadores para banco de dados relacionais, conduzindo à teoria prática.

- **Ingres**: desenvolvido pela UCB, que no final das contas serviu como base para Ingres Corp., Sybase, MS SQL Server, Britton-Lee, Wang PACE. Esse sistema utilizava QUEL como linguagem de consulta.
- **System R**: desenvolvido pela IBM San Jose e serviu de base para o IBM SQL/DS, IBM DB2, Oracle, todas os BD da HP. Este sistema utilizava SEQUEL como linguagem de consulta.

Nesse período, teve a definição do termo SGBDR - Sistema Gerenciador de Banco de Dados.

Em 1976 Peter Chen desenvolve o **MER** (Modelo Entidade Relacionamento), cujos componentes básicos são as entidades e seus relacionamentos baseados em necessidades de negócio.

O diagrama entidade relacionamento (**DER**) foi e é utilizado como notação para representar as estruturas de armazenamento.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# DÉCADA DE 1980

Com a crescente comercialização dos bancos relacionais, se torna necessário o uso de uma linguagem padrão para o acesso e manipulação dos dados. Nesse momento, a linguagem **SQL** (Structured Query Language) se torna a linguagem padrão.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# CONCEITUANDO BANCO DE DADOS

Pode-se dizer que um Banco de Dados é uma coleção de dados persistentes, usada pelos sitemas de aplicação de uma determinada empresa.

Mas qual é a ideia de persistência? Entende-se por dados persistentes aqueles que, uma vez aceitos por um ***SGBD*** (*Sistema Gerenciador de Banco de Dados*) para a entrada de dados, somente poderão ser removidos por uma requisição explícita ao *SGBD*.

Bancos de dados são utilizados por empresas. Chamamos de empresa qualquer organização comercial, científica, técnica ou outras. Podendo ser um único indivíduo, corporação ou grande empresa. Uma empresa necessita manter muitos dados sobre sua operação.

> Exemplos de "dados persistentes":
>
> - Dados sobre produtos
> - Dados sobre contas
> - Dados sobre pacientes
> - Dados sobre alunos
> - Dados sobre planejamento

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# DIFERENCIANDO DADO E INFORMAÇÃO

## Qual a diferença entre Dado e Informação?

Pode-se dizer que **DADO** é utilizado para se referir ao que realmente está armazenado. Caracteriza necessidades do mundo real, ou seja, as necessidades de negócio que refletem as necessidades dos usuários (exemplo: endereço - logradouro, número, complemento, código e nome de um departamento etc.)

![Representação dos dados em uma estrutura de armazenamento (1)](img/img2.png)

![Representação dos dados em uma estrutura de armazenamento (2)](img/img3.png)

**INFORMAÇÃO** é utilizada para se referir ao significado dos dados para um determinado usuário. Obtida por meio da interpretação e uso dos dados. Representa aquilo que o usuário precisa para apoiá-lo no dia a dia (exemplo: endereço, relatório da quantidade de funcionários e média salarial por departamento, boletim escolar etc.)

Pode-se dizer que a informação é o significado daquilo que está armazenado em um banco de dados, que tem por objetivo apoiar as necessidades de negócio dos usuários.

Para que seja possível extrair as informações, é necessário manipular os dados existentes na estrutura de armazenamento.

Concluindo, dado é aquilo que armazenamos por meio de uma estrutura de armazenamento e informção, o que extraímos de uma estrutura de armazenamento. A informação tem um significado para o usuário, podendo ser constituída por vários dados. Esses dados transformados, conforme as necessidades do usuário, compõem as informações.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Dados, Informação e Conhecimento

As informações obtidas agregam conhecimento ao usuário, permitindo, na maior parte das vezes, tomadas de decisões mais assertivas.

O conhecimento adquirido, atrelado à inteligência, nos permite resolver problemas.

Pode-se tirar algumas conclusões baseadas na informação obtida, como:

- Departamento com maior quantidade de funcionários
- Departamento mais custoso mensalmente
- Departamento com os funcionários mais bem remunerados
- Departamento com o custo mais baixo

![Representação do fluxo do dado, informação e conhecimento](img/img4.png)

A informação é considerada um dos **ativos estratégicos de maior importância** dentro de uma empresa.

Sendo assim, um dos recursos mais importantes para qualquer empresa é a sua coleção de dados.

Um banco de dados pode ajudar:

- Na **organização** de uma quantidade crescente de informações.
- Na **geração de informações** que contribuam aos negócios da empresa

![Informação como ativo estratégico](img/img5.png)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Propriedades de um Banco de Dados

Banco de dados possui propriedades, como por exemplo:

- Coleção lógica e coerente de dados (dados dispostos de forma desordenada não podem ser referenciados como banco de dados).
- É projetado, construído e populado com dados para um propósito específico.

Modelo de dados relacional que corresponde ao projeto físico de um banco de dados:

![Modelo de dados relacional - Projeto físico do banco de dados](img/img6.png)

Ilustrando a ideia de que um banco de dados é contruído, pode-se representar o script DDL (conjunto de códigos, por meio da linguagem SQL) para implementação de um banco de dados:

![Conjunto de comandos da linguagem SQL que permitem popular um banco de dados (1)](img/img7.png)

Ilustrando a ideia de que um banco de dados é populado, pode-se representar o script DML (conjunto de códigos, por meio da linguagem SQL) para popular um banco de dados:

![Conjunto de comandos da linguagem SQL que permitem popular um banco de dados (2)](img/img8.png)

- Um banco de dados possui um conjunto ré-definido de usuários e aplicações.
- Representa algum aspecto do mundo real, porção da relidade, o qual é chamado de "minimundo"; qualquer alteração efetuada no minimundo é automaticamente refletida no banco de dados.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Conceituando Sistema Gerenciador de Banco de Dados

SGBD é um software ue facilita alguns processos associados aos bancos de dados.

- ***Definir***: um banco de dados refere-se à especificação de tipos, estruturas e restrições associadas aos dados que serão armazenados.
- ***Construção***: de um banco de dados refere-se ao processo de armazenas os dados em algum meio controlado pelo SGBD.
- ***Manipulação***: de um banco de dados refere-se à inclusão de funções como consulta ao banco de dados para recuperação de dados específicos, atualização do banco de dados e geração e relatórios com base nos dados.
- ***Compartilhamento***: de um banco de dados permite que diversos usuários e programas acessem-no simultaneamente.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Conceituando Sistemas de Banco de Dados

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# VISUALIZANDO OS COMPONENTES DE UM *SISTEMA DE BANCO DE DADOS*

![Os componentes de um sistema de banco de dados](img/img9.png)

O Sistema Gerenciados de Banco de Dados permite que um banco de dados tenha a característica MULTIUSUÁRIO, ou seja, vários usuários podem acessar o banco de dados ao mesmo tempo.

De modo geral, os dados de um banco estarão integrados e compartilhados.

- **Independência dos dados**: por meio do sistema de banco de dados, o SGBD (software de controle e gerenciamento) fica posicionado entre o banco de dados e as aplicações, atendendo às solicitações das aplicações.
- **Integrado**: unificação de vários arquivos, eliminação de redundância. (exemplo: dados do aluno e boletim do aluno)
- **Compartilhado**: vários usuários podem acessar o banco de dados ao mesmo tempo (exemplo: consulta da ficha cadastral)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# CARACTERIZANDO UM *SISTEMA DE BANCO DE DADOS*

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# VANTAGENS DE UTILIZAR UM *SISTEMA DE BANCO DE DADOS*

- **Os dados podem ser compartilhados**: várias aplicações podem acessar os mesmos dados de um banco de dados.
- **A redundância pode ser reduzida**: cada aplicação tem seus próprios arquivos, ou seja, os mesmos dados são armazenados várias vezes. Quando a redundância ocorre, temos alguns problemas como: despedício de espaço em disco em função da repetição de informação em vários lugares, dificuldade para atualização das informações repetidas em lugares diferentes e a inconsistência, em função da falha durante a atualização das informações repetidas.

<p align="right">(<a href="#readme-top">back to top</a>)</p>