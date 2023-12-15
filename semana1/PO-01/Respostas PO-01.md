# Respostas PO-01

### 1. O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java. 

#### **Classe em Java:**

Em Java, uma classe é uma estrutura que serve como modelo para criar objetos. Ela define o comportamento e as propriedades que os objetos dessa classe terão. As classes em Java são a base da programação orientada a objetos e encapsulam dados e comportamentos relacionados.

#### **Diferença entre Classe e Objeto:**

Classe: Uma classe é uma descrição abstrata e genérica de um conceito. Ela define os atributos (variáveis) e métodos (funções) que os objetos dessa classe terão.

Objeto: Um objeto é uma instância concreta de uma classe. Ele representa uma entidade específica com características e comportamentos definidos pela classe.

#### **Exemplos:**

###### Exemplo 1: Ponto em um plano 2D

![Exemplo 1: Ponto em um plano 2D](Images/Captura%20de%20tela%202023-12-13%20101000.png)

###### Exemplo 2: Livro

![Exemplo 2: Livro](Images/Captura%20de%20tela%202023-12-13%20101404.png)

###### Exemplo 3: Carro

![Exemplo 3: Carro](Images/Captura%20de%20tela%202023-12-13%20101544.png)

###### Exemplo 4: Pessoa

![Exemplo 4: Pessoa](Images/Captura%20de%20tela%202023-12-13%20101705.png)

###### Exemplo 5: Animal

![Exemplo 5: Animal](Images/Captura%20de%20tela%202023-12-13%20101755.png)

### 2. Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++

#### **Declaração de Variável em Java:**

Em Java, você declara uma variável especificando o tipo de dado e o nome da variável. Aqui está um exemplo simples:

![Declarando uma variável inteira em Java](Images/Captura%20de%20tela%202023-12-13%20102301.png)

#### **Tipos de Dados Primitivos em Java:**

Os tipos de dados primitivos em Java são categorizados em dois grupos: numéricos e não numéricos. Os tipos primitivos numéricos incluem int, long, float, e double, enquanto os tipos primitivos não numéricos incluem char e boolean.

Aqui estão alguns exemplos:

![](Images/Captura%20de%20tela%202023-12-13%20102448.png)

#### **Declaração de Variável em C++:**

Em C++, a declaração de variáveis também envolve a especificação do tipo de dado e o nome da variável. Aqui está um exemplo semelhante ao anterior:

![Declarando uma variável inteira em C++](Images/Captura%20de%20tela%202023-12-13%20102613.png)

#### **Tipos de Dados Primitivos em C++:**

Os tipos de dados primitivos em C++ são semelhantes aos de Java, mas podem ter tamanhos diferentes em sistemas diferentes. Além disso, C++ oferece mais flexibilidade no gerenciamento de memória.

Exemplos:

![](Images/Captura%20de%20tela%202023-12-13%20102733.png)

#### **Paralelo entre Java e C++:**

###### Java:

![](Images/Captura%20de%20tela%202023-12-13%20103006.png)

###### C++:

![](Images/Captura%20de%20tela%202023-12-13%20103053.png)

Ambas as linguagens compartilham muitos conceitos básicos na declaração de variáveis e tipos de dados primitivos, mas há algumas diferenças, especialmente em termos de tamanhos de dados e detalhes de implementação.

### 3. Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos.

#### **Herança em Java:**

Em Java, a herança é um conceito fundamental da programação orientada a objetos que permite criar uma nova classe baseada em uma classe existente. A nova classe é chamada de subclasse ou classe derivada, e a classe existente é chamada de superclasse ou classe base. A herança permite que a subclasse herde atributos e métodos da superclasse e, ao mesmo tempo, adicione ou modifique seu próprio comportamento.

###### Sintaxe em Java:

![](Images/Captura%20de%20tela%202023-12-15%20043636.png)

###### Exemplo em Java:

![](Images/Captura%20de%20tela%202023-12-15%20043748.png)

#### **Herança em C++:**

O conceito de herança em C++ é semelhante ao de Java, mas a sintaxe é um pouco diferente.

###### Sintaxe em C++:

![](Images/Captura%20de%20tela%202023-12-15%20044024.png)

###### Exemplo em C++:

![](Images/Captura%20de%20tela%202023-12-15%20044132.png)

Aqui estão mais quatro exemplos para ilustrar diferentes aspectos da herança em C++:

![](Images/Captura%20de%20tela%202023-12-15%20044344.png)

Esses exemplos mostram a diversidade de situações em que a herança pode ser aplicada em C++, desde herdar atributos até trabalhar com construtores, métodos e herança múltipla.

### 4. Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto.

Essa afirmação não é precisa. Em Java, as variáveis de tipos primitivos (como int, float, etc.) armazenam diretamente o valor, não um ponteiro para o valor. Em contraste, em Java, quando lidamos com objetos, o que realmente está sendo manipulado é uma referência ao objeto, não o objeto em si. No entanto, isso é diferente de um ponteiro em C++, pois não oferece o mesmo nível de manipulação de memória e aritmética de ponteiros que o C++ permite.

#### **Java:**

![](Images/Captura%20de%20tela%202023-12-15%20045251.png)

#### **C++:**

![](Images/Captura%20de%20tela%202023-12-15%20045450.png)

Em Java, a manipulação de objetos é feita por meio de referências, enquanto em C++ a manipulação pode ser feita diretamente com o objeto ou usando ponteiros, dependendo do que é necessário.

Em C++, você pode usar ponteiros para gerenciar diretamente a memória, o que proporciona mais controle sobre o uso da memória. No entanto, isso também aumenta a complexidade e a possibilidade de erros relacionados à gestão de memória. Java, por sua vez, oferece gerenciamento automático de memória (coleta de lixo), o que simplifica o desenvolvimento, mas pode ter um custo de desempenho.

Em resumo, em Java, não é correto dizer que todas as variáveis são ponteiros. No entanto, quando se trabalha com objetos, você está lidando com referências a esses objetos, e essa diferença é importante para entender o comportamento do sistema de tipos e a gestão de memória em Java.