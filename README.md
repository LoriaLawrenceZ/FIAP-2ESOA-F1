<span align=center>
    
[`main`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/main) | [`cap-1`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-1) | [`cap-2`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-2) | [`cap-3`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-3) | [`cap-4`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-4) | [`cap-5`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-5) | [`cap-6`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-6) | [`cap-7`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-7) | [`cap-8`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-8) | [`cap-9`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-9) | [`cap-10`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-10)

</span>

<div name="readme-top">
    <h1 align=center>CAPÍTULO 8</h1>
</div>

>**Capítulo 8 - Listas lineares, Pilhas e Filas em Java**

---

<details>
    <summary><span>📌 Índice</span></summary>

- [REPRESENTAÇÃO DE INFORMAÇÃO EM SISTEMAS COMPUTACIONAIS](#representação-de-informação-em-sistemas-computacionais)
  - [Tipos de Dados](#tipos-de-dados)
  - [Tipos Abstratos de Dados vs Tipos "Concretos" de Dados](#tipos-abstratos-de-dados-vs-tipos-concretos-de-dados)
- [ORGANIZANDO DADOS EM ESTRUTURAS DE *LISTAS LINEARES*](#organizando-dados-em-estruturas-de-listas-lineares)
  - [Lista Linear Especial: *PILHA*](#lista-linear-especial-pilha)
  - [Lista Linear Especial: *FILA*](#lista-linear-especial-fila)
  - [Como Construir Listas Lineares em Programas?](#como-construir-listas-lineares-em-programas)
  - [Lista Linear Encadeada](#lista-linear-encadeada)
  - [Lista Linear Encadeada em Java (Tipo Concreto de Dado)](#lista-linear-encadeada-em-java-tipo-concreto-de-dado)
- [LISTAS LINEARES ESPECIAIS: *PILHAS ENCADEADAS*](#listas-lineares-especiais-pilhas-encadeadas)
  - [Implementando o Tipo de Dado Pilha](#implementando-o-tipo-de-dado-pilha)
  - [Implementação em Java da Pilha de Inteiros](#implementação-em-java-da-pilha-de-inteiros)
  - [Exemplo de Uso do Tipo de Dado Pilha](#exemplo-de-uso-do-tipo-de-dado-pilha)
- [LISTAS LINEARES ESPECIAIS: FILAS ENCADEADAS](#listas-lineares-especiais-filas-encadeadas)
  - [Implementando o Tipo de Dado Fila](#implementando-o-tipo-de-dado-fila)
  - [Implementação de Fila em Java](#implementação-de-fila-em-java)
- [Exemplo de Uso do Fila](#exemplo-de-uso-do-fila)
- [EXERCÍCIOS DE FIXAÇÃO 1](#exercícios-de-fixação-1)
- [EXERCÍCIOS DE FIXAÇÃO 2](#exercícios-de-fixação-2)

</details>

---

# REPRESENTAÇÃO DE INFORMAÇÃO EM SISTEMAS COMPUTACIONAIS

![Esquema de entrada de dados, processamento e saída de resultados](img/img1.png)

<details close>
    <summary><code>IMAGEM | Esquema de entrada de dados, processamento e saída de resultados</code></summary>

Dados Metereológicos ->  PROCESSAMENTO -> Informações: possibilidade de chuva

</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Tipos de Dados

O que é um tipo de dado?

> - São valores que podem ser assumidos.
> - Operações que possam ser efetuadas

Por exemplo, tipo de dado inteiro:

- Valores que representam quantidades contáveis de objetos.
- Operações: soma, subtração, multiplicação, divisão e resto da divisão.

Alguns tipos de dados são compreendidos diretamente pelo processador, ou seja, na arquitetura interna do processador estão presentes unidades de aritmética que realizam as operações sobre esses tipos de dados. Esses tipos são ditos *dados **primitivos***, normalmente, são númetos inteiros com ou sem sinal, reais e caracteres.

Para facilitar o uso de dados por programas, são definidos os tipos compoostos de dados, também conhecidos como *dados estruturados*, que são compostos internamente por vários dados primitivos ou não. Exemplos desses tipos de dados já estudados: vetores, matrizes e registros (dados de tipos diferentes são agrupados em um dado do tipo registro).

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Tipos Abstratos de Dados vs Tipos "Concretos" de Dados

> Deve-se distinguir tipos ***abstratos*** de dados e tipos ***concretos*** de dados

- ***Tipos abstratos de dados (TAD)***: especificam as propriedades lógicas e matemáticas de um tipo de dados ou estrutura, tornando-se guias úteis para os programadores. Desta forma, um **TAD** não precisa levar em consideração como será o tipo de dado concreto que será usado no computador.
- ***Tipos concretos de dados***: são aqueles escolhidos dentro das opções de tipos de dados oferecidos pela arquitetura do computador, ou seja, dentro das limitações inerentes do mundo digital.

Na definição de um TAD, não é usual a preocupação com tempo, eficiência de processamento ou limitações de espaço, que são problemas de implementação. Não vamos estudar todas as técnicas e notações de **TAD**s, mas, sim, o uso de algumas delas em problemas de programação, com a finalidade de elaborarmos códigos que usem eficientemente os dados no processamento de aplicações.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# ORGANIZANDO DADOS EM ESTRUTURAS DE *LISTAS LINEARES*

## Entendendo o que são Listas Lineares

<details close>
    <summary><code>VÍDEO | Definindo Listas Lineares Encadeadas</code></summary>

- Lista linear é uma estrutura de dados que armazena uma coleção de elementos em uma sequência linear.
- Lista linear encadeada é uma lista linear onde cada elemento contém um ponteiro para o próximo elemento da lista.

#### Como implementar e representar cada elemento de uma lista linear encadeada?

Cada elemento deve conter

- Dado que presica precisa ser armazenado na lista;
- Ponteiro ou referência de onde está o seu sucessor.

Elemento passa a ser chamada de **NÓ** ou **NODO**

- Dado | Ponteiro para o próximo nó

#### Declaração de cada nó em linguagem algorítmica

**NÓ**
- *Início*
    - **Dado**: tipo_do_elemento da lista
    - **Próximo**: ponteiro para o próximo nó
- *Fim*

LISTA
- | Dado 01 | Referência | -> | Dado 02 | Referência | -> | Dado 03 | Referência | -> FIM

</details>

No dia a dia, temos a necessidade de agrupas dados que apresentam alguma relação e que precisamos lembrar. Normalmente, criamos listas como:

- Listas de compras para irmos ao supermecado
- Listas de tarefas a serem realizadas no trabalho
- Listas de convidados para um festa etc.

Em desencolcimento de sistemas de computação, também são necessárias listas. Exemplos:

- Listas de arquivos a serem impressos
- Lista de solicitações de acesso para consulta de servidor de um banco de dados etc.

Contudo, analisando as aplicações que usam listas em computação, podemos observar que não basta criar um conjunto de elementos, precisamos, sim, definir uma ordem para que sejamos justos com os usuários que solicitaram algum serviço. Assim:

> Lista de arquivos a serem impressos:
>
> - Se vários usuários solicitam a impressão de arquivos, é justo que o primeiro que solicitou seja o primeiro a ser impresso.
>
> Lista de solicitações de acesso para consulta de um banco de dados:
>
> - Se vários clientes de um banco solicitam o saldo, o atendimento deve atender ao primeiro a pedir.

Portanto, fica claro que devemos criar listas nas quais possamos garantir algum tipo de ordenação. Este tipo de lista é conhecido como ***lista linear***.

> **DEFINIÇÃO**: Uma lista linear é uma estrutura de dados que, além de armazenas vários valores de elementos, impõe que a posição de cada elemento deve respeitar algum tipo de ordem.

Usando o formalistmo adequado para o estudo de lista linear, define-se que é uma estrutura dinâmica caracterizada por uma sequência ordenada de elementos, ordenada no sentido de sua posição relativa: E0, E1, E2, ..., En-1, tal que:

- Existem *n* elementos na sequência
- E0 é o primeiro elemento da sequência
- En-1 é o último elemento da sequência
- Para todo i e j entre 0 e n-1, se i < j, então Ei antecede Ej
- Caso i = j-1, Ei é antecessor de Ej e Ej é sucessor de Ei

A característica principal de uma lista linear é o sentido da ordem unidirecional dos elementos que a compõem. O critério usado para essa ordenação é bem genérico, podendo ser definido em função do problema que está sendo modelado.

Dentre as diversas operações que podem ser realizadas com listas, temos:

- Ter acesso a um elemento qualquer da lista (acesso).
- Inserir um elemento em uma posição específica da lista (inserção).
- Remover um elemento de uma posição específica da lista (remoção).
- Combinar duas listas em apenas uma.
- Particionar (dividir) uma lista em duas listas.
- Determinar o total de elementos da lista etc.

<details close>
    <summary><code>VÍDEO | Construindo Lista Linear Encadeada</code></summary>

#### Definição de NÓ em Java

Uma classe com 2 atributos

- Campo do tipo de dado
- Campo do tipo NÓ

```java
// declaração do no e dos atributos
private static class NO {
    public int dado;
    public NO prox;
}
```

#### Iniciando na lista vazia e depois inserindo um elemento

```java
public static void main(String[] args) {
    NO lista = null; // Lista vazia
}
```

> NULL é um valor especial que indica que a variável não está apontando para nenhum objeto.

```java
for(int i = 1; i <= 2; i++) {
    NO novo = new NO(); // Cria um novo nó
    novo.dado = i + 4; // Atribui o valor ao nó
    novo.prox = lista; // O próximo nó é o que já existe na lista
    lista = novo; // A lista agora é o novo nó
}
```

</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Lista Linear Especial: *PILHA*

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Lista Linear Especial: *FILA*

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Como Construir Listas Lineares em Programas?

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Lista Linear Encadeada

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Lista Linear Encadeada em Java (Tipo Concreto de Dado)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<span>
    <h3 align=center>

[Exercícios de Fixação 1](#exercícios-de-fixação-1)
    </h3>
</span>

---

> ### LABORATÓRIO DE ESTRUTURA DE DADOS
>
> Já foi definido que

# LISTAS LINEARES ESPECIAIS: *PILHAS ENCADEADAS*

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Implementando o Tipo de Dado Pilha

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Implementação em Java da Pilha de Inteiros

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Exemplo de Uso do Tipo de Dado Pilha

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# LISTAS LINEARES ESPECIAIS: FILAS ENCADEADAS

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Implementando o Tipo de Dado Fila

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Implementação de Fila em Java

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# Exemplo de Uso do Fila

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<span>
    <h3 align=center>

[Exercícios de Fixação 2](#exercícios-de-fixação-2)
    </h3>
</span>

---

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# EXERCÍCIOS DE FIXAÇÃO 1

<details>
    <summary><code>Exercício 1</code></summary>

</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<details>
    <summary><code>Exercício 2</code></summary>

</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<details>
    <summary><code>Exercício 3</code></summary>

</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<details>
    <summary><code>Exercício 4</code></summary>
    
</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<details>
    <summary><code>Exercício 5</code></summary>
    
</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<details>
    <summary><code>Exercício 6</code></summary>
    
</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

# EXERCÍCIOS DE FIXAÇÃO 2

<details>
    <summary><code>Exercício 1</code></summary>

</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<details>
    <summary><code>Exercício 2</code></summary>

</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<details>
    <summary><code>Exercício 3</code></summary>

</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<details>
    <summary><code>Exercício 4</code></summary>
    
</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<details>
    <summary><code>Exercício 5</code></summary>
    
</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<details>
    <summary><code>Exercício 6</code></summary>
    
</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>