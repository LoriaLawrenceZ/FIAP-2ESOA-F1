<div name="readme-top">
    <h1 align=center>CAPÍTULO 6</h1>
</div>

>**Capítulo 6 - Introdução ao Java**

---

<details>
    <summary><span>📌 Índice</span></summary>

- [INTRODUÇÃO AO JAVA: IDE\< VARIÁVEIS E HELLO WORLD](#introdução-ao-java-ide-variáveis-e-hello-world)
- [PLATAFORMA JAVA](#plataforma-java)
- [EDIÇÕES DO JAVA](#edições-do-java)
- [JAVA VIRTUAL MACHINE - JVM](#java-virtual-machine---jvm)
- [CONFIGURANDO O AMBIENTE DE DESENVOLVIMENTO](#configurando-o-ambiente-de-desenvolvimento)
- [PRIMEIRO PROGRAMA EM JAVA](#primeiro-programa-em-java)
- [AMBIENTE DE DESENVOLVIMENTO INTEGRADO (IDE)](#ambiente-de-desenvolvimento-integrado-ide)
- [INTALANDO O INTELLIJ IDEA](#intalando-o-intellij-idea)
- [VARIÁVEIS E TIPOS PRIMITIVOS NO JAVA](#variáveis-e-tipos-primitivos-no-java)
- [O QUE SÃO VARIÁVEIS?](#o-que-são-variáveis)
- [TIPOS PRIMITIVOS EM JAVA](#tipos-primitivos-em-java)
- [DECLARANDO E INICIALIZANDO VARIÁVEIS](#declarando-e-inicializando-variáveis)
- [REGRAS PARA NOMENCLATURA DE VARIÁVEIS](#regras-para-nomenclatura-de-variáveis)
- [EXEMPLO DE USO DE VARIÁVEIS E TIPOS PRIMITIVOS](#exemplo-de-uso-de-variáveis-e-tipos-primitivos)
- [OPERADORES ARITMÉTICOS E ENTRADA DED ADOS EM JAVA](#operadores-aritméticos-e-entrada-ded-ados-em-java)

</details>

---

# INTRODUÇÃO AO JAVA: IDE< VARIÁVEIS E HELLO WORLD

Criado pela ***Sun Microsystems*** (agora parte da Oracle Corportation) na década de 1990.

Sua capacidade de rodar em diferentes plataformas sem a necessidade de alterações significativas no código fonte 
tornou-a altamente procurada por desenvolvedores e empresas.

Outro fator que contribuiu para sua popularidade foi a sua arquitetura orientada a obbjetos, tornando o código mais 
fácil de manter, modificar e estender, resultando em um código mais limpo, eficiente e de fácil manutenção.

Além disso, a linguagem Java trouxe o conceito de "Write Once, Run Anywhere", graças à Máquina Virtual Java (***JVM - 
Java Virtual Machine***). Permitindo que o código pudesse rodar em qualquer dispositivo ou sistema operacional que 
tivesse a JVM instalada.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# PLATAFORMA JAVA

A Plataforma Java é um ambiente de software onde os programas escritos na linguagem Java são executados. Essa plataforma
é composta por dois elementos:

- Biblioteca de classes para o desenvolvimento de aplicações Java.
- Java Virtual Machine que é o responsável por "executar" os programas Java.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# EDIÇÕES DO JAVA

| Edição | Descrição                                                                                                                                                                                                                                                                                                   |
| :---: |:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ***JSE*** <br> ***Java Standart Edition*** | É a base da plataforma. Possui as principais bibliotecas da linguagem que são utilizadas nas outras edições. Essa edição contempla os tipos de dados e coleções de classes responsáveis por criar aplicações desktop, conectar com banco de dados, trabalhar com segurança e redes, além de manipular XML.  |
| ***JEE*** <br> ***Java Enterprise Edition*** | É a versão Enterprise da plataforma Java, para desenvolvimento de sistema corporativos, web, escaláveis, distribuídos, que são executados dentro de servidores de aplicações.                                                                                                                               |
| ***JME*** <br> ***Java Micro Edition*** | É a versão para sistemas embarcados e dispositivos móveis. Uma versão enxuta do Java, para rodar em dispositivos com menos recursos.                                                                                                                                                                        |

Além dessas três edições principaius, o Java possui outras duas edições específicas:

- ***Java Card***: Permite o desenvolvimento de pequenos aplicativos para serem executados em smart cards e dispositivos
- similares, que possuem limitações de processamento.
- ***JavaFX***: É utilizada para criar aplicações *Rich Internet Applications (RIA)*. Permite criar interfaces gráficas 
- de usuário para qualquer plataforma, como desktop, web, mobile etc. 

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# JAVA VIRTUAL MACHINE - JVM

A JVM é responsável por interpretar (executar) os arquivos Java.

A linguagem Java é **compilada** e **interpretada**. COmpilcação é o processo de "tradução" do programa escrito em 
linguagem de programação para a linguagem de máquina, para que as instruções possam ser executadas pelo processador.

Linguagens como C, C++ e Pascal são compilados para um sistema operacional e arquitetura de hardware específicos, ou 
seja, depois do programa compilado, o código executável (binário) só funciona para aquele tipo de sistema operacional e 
arquitetura de hardware.

Os arquivos Java (extensão ***.java***) são compiladospara gerar os *bytecodes* (extensão ***.class***). Esses arquivos
compilados são interpretados (executados) na JVM. E aqui está o pulo do gato, poiis cada sistema operacional possui uma 
máquina virtual Java.

![Compilação e Interpretação do código Java](img/img1.png)

<details close>
    <summary><code>IMAGEM | Compilação e Interpretação do código Java</code></summary>

- Código Java (.java) é compilado para Bytecode (.class)
- Bytecode é executado (interpretado) pela JVM
- Cada sistema operacional possui uma JVM específica
  - ***Linux 64-bit*: JVM Linux 64-bit**
  - ***Linux 32-bit*: JVM Linux 32-bit**
  - ***Windows 64-bit*: JVM Windows 64-bit**
  - ***Windows 32-bit*: JVM Windows 32-bit**
  - ***Mac OS*: JVM Mac OS**

</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# CONFIGURANDO O AMBIENTE DE DESENVOLVIMENTO

Para executar um programa Java, a ***JRE (Java Runtime Environment)*** é o suficiente, pois ela possui tudo que é 
necessário: a JVM e as bibliotecas. Porém, para desenvolver programas em Java é preciso da JDK, que é formado pela 
*JRE* e diversas ferramentas essenciais como o ***javac (compilador)***, ***javadoc (documentação)***, ***jdb (debug)***
e etc.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# PRIMEIRO PROGRAMA EM JAVA

Nesse primeiro momento, é importante compreender o processo: escrever o código Java, compilar com uma ferramenta que
baixamos junto da JDK e depois interpretar o *bytecode* gerado pela compilação na JVM para executar o programa.

Primeiramente, escrevemos o código:

```java
public class Teste {
    public static void main (String args[]) {
        System.out.println("Hello World!");
    }
}
```

Agora, salvar o arquivo em ***.java*** e não .txt, já que é um arquivo java.

Depois, no terminal, vamos utilizar a ferramenta ***javac*** seguido do nome e extensão do arquivo que desejamos compilar

```bash
java Teste.java
```

O resultado é um arquivo criado com a extensão ***.class***, que é o *bytecode*, o código Java compilado!

Para interpretar o bytecode na JVM, basta utilizar a ferramenta ***java*** seguido do nome do *bytecode*, assim o programa será executado!

```bash
java Teste
```

# AMBIENTE DE DESENVOLVIMENTO INTEGRADO (IDE)

Para desenvolver as aplicações existem as ferramentas específicas, chamadas de IDEs (Integrated Development Environment). Essas ferramentas têm o objetivo de aumentar a produtividade e a eficiência do desenvolvedor, combinando diversas funcionalidades em uma única interface.

Existem IDEs para linguagens específicas e outras que suportam uma variedade de linguagens de programação. Todas essas ferramentas possuem funcionalidades similares, como as mais comuns:

- ***Editor*** para escrever o código-fonte na linguagem de programação suportada pela IDE
- ***Compilador*** para compilar o código-fonte
- ***Depurador (debugger)*** para executar o programa "passo-a-passo", ou seja, é possível verificar o que está acontecendo em cada instrução do programa, facilitando o entendimento do sistema e no processo de encontrar e corrigir bugs.
- ***Geração de código*** para gerar código-fonte a partir de *templates* de código comumente utilizados para solucionar problemas rotineiros
- ***Distribuição (Deploy)*** auta no auxilio do processo de gerar o artquivo final para a instalação do sistema desenvolvido ou até mesmo envia os arquivos para o servidor.
- ***Git*** integração com o versionador de arquivos mais utilizados pelos desenvolvedores.
- ***Modelagem*** para criação de modelos declasses, objetos, interfaces, associações e interações de forma visual.
- ***Teste automatizados*** para realizar testes no programa de forma automatizada, baseados em scripts ou programas de testes previamente especificados, gerando relatórios que auxiliam na análise do impacto das alterações do código-fonte
- ***Refatoração*** realiza a melhoria constante do código-fonte, pode ser na construção de código mais otimizado, limpo e/ou com melhor entedimento pelos envolvidos no desenvolvimento do sistema.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# INTALANDO O INTELLIJ IDEA

Vai ao endereço do [IntelliJ IDEIA](https://bit.ly/3U9HWX5) no site da JetBrains e baixe o programa. Após baixado, instale o programa.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# VARIÁVEIS E TIPOS PRIMITIVOS NO JAVA

<details close>
    <summary><code>VÍDEO | Java: Variáveis e Tipos</code></summary>

8 tipos primitivos são tipos de dados especiais que armazenam somente valor:
- byte, short, int, long
- float, double
- char
- boolean

Tipo de Referência é um tipo de dado que referenciamos uma posição de memória onde estará um objeto Java. Exemplo:
- String

Declaração de variável:

```java
// Primitivos
int idade;
idade = 20;

double altura = 1.80;

char caractere = 'a';

boolean especial = false;

// de referência
String palavra = "palavra";
```

</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# O QUE SÃO VARIÁVEIS?

Variáveis são espaços de memória reservados para armazenas dados durante a execução de um programa.

java é uma linguagem fortemente tipada, ou seja, para criar uma variável é preciso especificar o tipo de dado que ela irá armazenar e dar uma nome a ela. O tipo de dado determina o tamanho da variável na memória e os valores que ela pode armazenar.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# TIPOS PRIMITIVOS EM JAVA

Java possui oito tipos primitivos, que são os tipos de dados básicos que não são objetos.

- ***byte***: representa números inteiros de 8 bits. O intervalo vai de -128 a 127.
- ***short***: representa números inteiros de 16 bits. O intervalo vai de -32.768 a 32.767.
- ***int***: representa números inteiros de 32 bits. O intervalo vai de -2.147.483.648 a 2.147.483.647.
- ***long***: representa números inteiros de 64 bits. O intervalo vai de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.
- ***float***: representa números de ponto flutuante de 32 bits. Usado para valores com casas decimais.
- ***double***: representa números de ponto flutuante de 64 bits. Mais preciso que o tipo float.
- ***char***: representa um caracteree de 16 bits. Unicode de 16 bits.
- ***boolean***: representa um valor lógico, podendo ser true ou false.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# DECLARANDO E INICIALIZANDO VARIÁVEIS

Para declarar uma variável em Java:

```java
tipo nomeDaVariavel;
```

Para incializar a variável com valor específico:

```java
int idade;
idade = 20;
//ou
int idade = 20;
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# REGRAS PARA NOMENCLATURA DE VARIÁVEIS

- O nome da variável deve começar com uma letra ou underscore ( _ )
- Não é permitido usar caracteres especiais, exceto o underscore ( _ )
- O nome da variável não pode ser uma palavra reservada da linguagem Java.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# EXEMPLO DE USO DE VARIÁVEIS E TIPOS PRIMITIVOS

```java
public class VariaveisExemplo {
    public static void main(String[] args) {
        // Declaração de variáveis
        int idade = 20;
        double altura = 1.83;
        char caractere = 'a';
        boolean especial = false;

        // Exibindo os valores das variáveis
        System.out.println("Idade: " + idade); // Idade: 20
        System.out.println("Altura: " + altura); // Altura: 1.83
        System.out.println("Caractere: " + caractere); // Caractere: a
        System.out.println("Especial: " + especial); // Especial: false
    }
}
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# OPERADORES ARITMÉTICOS E ENTRADA DED ADOS EM JAVA

<details close>
    <summary><code>VÍDEO | Java: A Magia dos Operadores</code></summary>



</details>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>
