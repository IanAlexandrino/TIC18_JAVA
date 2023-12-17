# Respostas PO-03

### 1. O que é uma exceção em Java e qual é o propósito de usá-las em programas?

Em Java, uma exceção é um evento que ocorre durante a execução de um programa e que interrompe o fluxo normal de instruções. As exceções são geralmente eventos indesejados ou inesperados que podem ocorrer durante a execução de um programa. Elas podem ser causadas por erros de programação, condições imprevistas ou situações fora do controle do programa.

O propósito de usar exceções em programas Java é fornecer um mecanismo para lidar com erros e situações excepcionais de forma controlada e elegante. Quando ocorre uma exceção, o Java cria um objeto de exceção que contém informações sobre o erro, como o tipo de exceção, a mensagem de erro e a pilha de chamadas (rastreamento de pilha). Este objeto é então "lançado" (thrown) e o programa procura um bloco de código que pode "capturar" (catch) essa exceção e lidar com ela.

Os benefícios de usar exceções incluem:

#### **Separação de Código Normal e Código de Tratamento de Erro:**

As exceções permitem que você separe o código que trata condições excepcionais do código normal. Isso ajuda a manter o código mais limpo e legível.

#### **Gestão Centralizada de Erros:**

O tratamento de exceções permite que você centralize o código de tratamento de erros em um ou mais blocos catch, facilitando a manutenção do código.

#### **Propagação de Erros:**

As exceções podem ser propagadas através das chamadas de método, permitindo que os erros sejam gerenciados em um nível superior da hierarquia de chamadas.

#### **Recuperação Controlada:**

Você pode fornecer mecanismos para recuperar ou lidar com erros de maneira controlada, em vez de simplesmente encerrar o programa abruptamente.

#### **Melhoria na Legibilidade do Código:**

O uso de exceções pode tornar o código mais claro e legível, pois as condições normais de execução não são intercaladas com o código de tratamento de erros.

Um exemplo simples de uso de exceções em Java seria o bloco try-catch:

![](images/Captura%20de%20tela%202023-12-16%20233244.png)

Isso permite que você escreva código que lida com situações excepcionais de uma maneira mais controlada e estruturada.

### 2.  Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma. 

Em Java, as exceções podem ser classificadas em dois tipos principais: exceções verificadas (checked exceptions) e exceções não verificadas (unchecked exceptions).

#### **Exceções Verificadas (Checked Exceptions):**

    * Essas são exceções que o compilador obriga a lidar explicitamente, seja usando um bloco try-catch para capturar a exceção ou declarando que o método que pode lançar a exceção usa a palavra-chave throws.

    * Geralmente, as exceções verificadas indicam condições que o programador pode antecipar e lidar de maneira apropriada.

    * Exemplos comuns de exceções verificadas incluem IOException, FileNotFoundException, SQLException, entre outras.

![](images/Captura%20de%20tela%202023-12-16%20233741.png)

#### **Exceções Verificadas (Checked Exceptions):**

    * Essas são exceções que o compilador não obriga a lidar explicitamente. Geralmente, são erros de programação, como divisão por zero, acesso a um índice inválido em um array, entre outros.

    * Exceções não verificadas são subclasses de RuntimeException ou Error (ou suas subclasses).

    * Exemplos comuns de exceções não verificadas incluem ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, entre outras.

![](images/Captura%20de%20tela%202023-12-16%20234118.png)

Em resumo, a diferença principal entre exceções verificadas e não verificadas em Java é que as exceções verificadas devem ser tratadas explicitamente no código (usando try-catch ou declarando throws), enquanto as exceções não verificadas podem ser tratadas opcionalmente. Exceções verificadas normalmente representam condições que o programador pode prever e lidar, enquanto exceções não verificadas geralmente indicam erros de programação ou situações imprevisíveis.

### 3. Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções?