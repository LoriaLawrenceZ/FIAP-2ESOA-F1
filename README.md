<span align=center>
    
[`main`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/main) | [`cap-1`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-1) | [`cap-2`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-2) | [`cap-3`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-3) | [`cap-4`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-4) | [`cap-5`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-5) | [`cap-6`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-6) | [`cap-7`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-7) | [`cap-8`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-8) | [`cap-9`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-9) | [`cap-10`](https://github.com/LoriaLawrenceZ/FIAP-2ESOA-F1/tree/cap-10)

</span>

<div name="readme-top">
    <h1 align=center>CAPÍTULO 7</h1>
</div>

>**Capítulo 7 - Conceitos e Paradigmas de POO**

---

<details>
    <summary><span>📌 Índice</span></summary>

- [AFINAL, O QUE É UM PARADIGMA EM LINGUAGEM DE PROGRAMAÇÃO?](#afinal-o-que-é-um-paradigma-em-linguagem-de-programação)
  - [Então existem diferentes formas de programar!](#então-existem-diferentes-formas-de-programar)
  - [Os conceitos básicos da Orientação a Objetos](#os-conceitos-básicos-da-orientação-a-objetos)
- [CONCEITOS BÁSICOS](#conceitos-básicos)
- [CLASSES](#classes)
- [POR QUE TODO DESENVOLVEDOR PRECISA ENTENDER OS PARADIGMAS?](#por-que-todo-desenvolvedor-precisa-entender-os-paradigmas)

</details>

---

# AFINAL, O QUE É UM PARADIGMA EM LINGUAGEM DE PROGRAMAÇÃO?

Quando vamos fazer um bolo, existem diversas etapas durante o processo de preparo para que o resultado seja o esperado. Separar todos os ingredientes. medir, misturar os ingredientes secos, misturar os líquidos, acrescentar o fermente, bater e assar.

A sequência de tarefas que foi proposta agora é um ***paradigma***.

O ***paradigma*** é, portanto, um exemplo-guia, um modelo ou uma **forma de pensar** a solução para um problema.

Na programação, um paradigma é a maneira como pensamos e lidamos com as estruturas de programação.

## Então existem diferentes formas de programar!

No paradigma procedural faltam recursos para tornar a relação entre os dados e os procedimentos mais próxima da realidade. Um exemplo simples é o de um programa que calcula a média aritmética entre duas notas de um aluno de um colégio.

![Diagrama de solução procedural para média artmética](img/img1.png)

<details close>
    <summary><code>IMAGEM | Diagrama de solução procedural para média aritmética</code></summary>

- Início
- Declarar variáveis
  - nome: String
  - n1: Double
  - n2: Double
- "Digite o nome do aluno"
- nome
- "Digite as notas"
- n1, n2
- calcula_media(n1, n2) -> (n1 + n2) / 2
- fim

</details>

Quem faz a relação entre os valores das notas do aluno com a média obtida e o aluno em questão é o programados. Não há **nada** no paradigma usado que garanta que as notas pertençam ao aluno, ou mesmo que a nota e o aluno são informações que têm relação.

Foi para resolver o problema de conseguirmos representar elementos reais no ambiente virtual que nasceu outro paradigma: a ***orientação a objetos***.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Os conceitos básicos da Orientação a Objetos

<details close>
    <summary><code>VÍDEO | Fundamentos da POO: os Pilares e as Classes</code></summary>

1. Encapsulamento
    - É a capacidade de esconder detalhes de implementação de um objeto, expondo apenas o que é necessário para o uso. 
2. Abstração
    - É a capacidade de representar objetos reais no ambiente virtual, simplificando a complexidade do mundo real.
3. Herança
    - É a capacidade de criar novas classes a partir de classes já existentes, aproveitando as características e comportamentos da classe mãe.
4. Polimorfismo
    - É a capacidade de um objeto se comportar de diferentes formas, dependendo do contexto em que é utilizado.

Unidade básica da POO: a ***classe***.

Classe é uma estrutura base que define quais as informações importantes (atributos) que um objeto terá. Além disso, a classe define quais ações (***métodos***) o objeto poderá realizar.

</details>

A ***POO*** (Programação Orientada a Objetos) é um estilo de programação que se baseia na ideia de que o mundo real pode ser modelado por meio de objetos. Esses objetos são representações de entidades ou conceitos do mundo real e contêm tanto seus atributos (características) quanto seus comportamentos (ações).

A interação entre os objetos ocorre através de troca de mensagens, em que um objeto solicita a outro objeto que execute algum comportamento específico. É um modelo que visa estruturar o código de forma mais organizada, modular e reutilizável.

Vantagens da ***POO***:

- ***Reutilização de código***: objetos podem ser reutilizados em diferentes partes do programa.
- ***Modularidade***: o código é dividido em classes e objetos independentes.
- ***Manutenção facilitada***: mudanças em um objeto não afetam diretamente outros objetos.
- ***Abstração***: foco nos aspectos importantes e ocultamento dos detalhes complexos.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# CONCEITOS BÁSICOS

Tudo começa pela ***classe***, que serve como modelo para criar objetos, especificando seus atributos (variáveis) e comportamentos (métodos). Atributos são variáveis que armazenam valores. Já os ***métodos*** são ações que o objeto pode executar.

| Conceito | Descrição |
| :--- | :--- |
| ***ENCAPSULAMENTO*** | Encapsulamento é o princípio de esconder os detalhes internos do objeto e expor apenas uma interface bem definida para o mundo exterior. |
| ***HERANÇA*** | A herança permite criar uma classe baseada em outra classe existente, herdando seus atributos e métodos. Isso promove a reutilização de código e a criação de hierarquias de classes, permitindo que classes filhas herder características das classes pai. |
| ***POLIMORFISMO*** | O polimorfismo permite que objetos de diferentes classes sejam tratados de maneira uniforme através de uma classe base comum. Isso permite escrever código mais genérico e flexível, adaptando-se automaticamente às diferentes classes que implementam o mesmo contrato. |
| ***ABSTRAÇÃO*** | A abstração é a representação de um objeto do mundo real em forma de código, enforcando apenas os detalhes relevantes e ignorando aqueles irrelevantes. Isso ajuda a simplificar o design e a melhorar a compreensão do código. |

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# CLASSES

Uma classe é como um esboço detalhado que você cria antes de fazer um desenho.

Dentro de uma classe você define atributos (que são as características do objeto) e métodos (que são as ações que o objeto pode realizar).

Uma classe é como um plano detalhado para criar objetos em seu programa. Ela define quais informações e ações os objetos terão. Essa estrutura organizada e detalhada torna mais fácil criar e controlar os objetos em um sistema de maneira eficiente e organizada.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# POR QUE TODO DESENVOLVEDOR PRECISA ENTENDER OS PARADIGMAS?

Imaginando múltiplos cenários de aplicações, é possível perceber que cada um deles pode ser mais bem resolvido com um paradigma específico, seja ele com programação estruturada ou programação orientada a objetos. Por isso, é importante que o desenvolvedor conheça os paradigmas existentes e saiba quando e como aplicá-los.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
