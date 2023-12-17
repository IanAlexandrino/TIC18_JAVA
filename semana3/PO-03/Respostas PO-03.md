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

Lidar com exceções em Java envolve o uso de blocos try, catch, finally, além das palavras-chave throw e throws. Aqui estão algumas práticas comuns e palavras-chave associadas ao tratamento de exceções em Java:

### **try, catch, e finally:**

    * O bloco try é usado para envolver o código que pode gerar uma exceção.

    * O bloco catch é usado para capturar exceções específicas e fornecer um bloco de código para tratamento.

    * O bloco finally é opcional e é usado para conter código que será executado independentemente de uma exceção ter sido lançada ou não.

![](images/Captura%20de%20tela%202023-12-16%20234733.png)

### **throw:**

    * A palavra-chave throw é usada para explicitamente lançar uma exceção em um programa. Isso geralmente é feito quando uma condição de erro é detectada e o programador deseja sinalizar a ocorrência de uma exceção.

![](images/Captura%20de%20tela%202023-12-16%20234837.png)

### **throws:**

    * A palavra-chave throws é usada na assinatura de um método para indicar que o método pode lançar uma ou mais exceções verificadas. Isso alerta o chamador do método de que ele deve lidar com essas exceções ou declarar que ele também pode lançá-las.

![](images/Captura%20de%20tela%202023-12-16%20234939.png)

### **Práticas Comuns:**

#### * Capture Exceções Específicas:

        * Use blocos catch para capturar exceções específicas. Isso permite que você lide de maneira diferente com diferentes tipos de exceções.

#### * Mantenha o Tratamento Mínimo no Bloco try:

        * Coloque apenas o código que pode gerar exceções reais no bloco try. Mantenha o código mínimo nesse bloco para reduzir a possibilidade de pegar exceções que não são relevantes para o código em questão.

#### * Log e/ou Relance Exceções (se apropriado):

        * Em alguns casos, é apropriado logar informações sobre a exceção ou relançá-la após o tratamento. Isso pode ajudar na depuração e na compreensão do fluxo do programa.

#### * Use finally para Liberação de Recursos:

        * O bloco finally é frequentemente usado para liberar recursos, como fechar conexões de banco de dados, arquivos ou sockets, independentemente de uma exceção ter sido lançada ou não.

![](images/Captura%20de%20tela%202023-12-16%20235303.png)

Essas práticas e palavras-chave formam a base para lidar efetivamente com exceções em Java, permitindo que você crie código robusto e resiliente.

### 4. O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?

O bloco try-catch em Java é uma construção usada para lidar com exceções. Ele permite que você envolva um bloco de código que pode gerar exceções em um bloco try e forneça um ou mais blocos catch para tratar essas exceções de maneira controlada. A estrutura básica é a seguinte:

![](images/Captura%20de%20tela%202023-12-16%20235558.png)

Aqui está uma explicação de como o bloco try-catch funciona:

1. **try:**

    * O bloco try envolve o código que pode gerar exceções.

    * Se uma exceção ocorrer dentro do bloco try, a execução do bloco será interrompida e o controle será transferido para o bloco catch correspondente.

2. **catch:**

    * Os blocos catch especificam o tipo de exceção que podem tratar.

    * Se uma exceção ocorrer no bloco try e coincidir com o tipo de exceção em algum bloco catch, o bloco catch correspondente será executado.

    * Você pode ter vários blocos catch para lidar com diferentes tipos de exceções.

3. **finally (opcional):**

    * O bloco finally é opcional e é usado para conter código que será executado independentemente de ocorrer ou não uma exceção.

    * Este bloco é útil para liberar recursos, como fechar conexões com bancos de dados ou arquivos, garantindo que certas ações ocorram, independentemente do resultado do bloco try.

O uso do bloco try-catch é importante ao lidar com exceções por várias razões:

* **Controle de Fluxo:**

    * O bloco try-catch permite que você controle o fluxo de execução do programa, fornecendo uma maneira de lidar com exceções de maneira controlada, em vez de deixar o programa terminar abruptamente em caso de erros.

* **Tratamento de Exceções:**

    * Permite que você trate diferentes tipos de exceções de maneira específica. Cada bloco catch pode lidar com um tipo específico de exceção, o que facilita a implementação de lógicas de tratamento diferentes para diferentes situações.

* **Prevenção de Interrupções Não Controladas:**

    * Sem o bloco try-catch, se uma exceção ocorrer, ela pode interromper a execução normal do programa, levando a comportamentos inesperados ou indesejados. O bloco try-catch ajuda a evitar essas interrupções não controladas.

Ao usar o bloco try-catch de forma apropriada, você pode criar código mais robusto e resiliente, lidando de maneira eficaz com situações excepcionais e garantindo um comportamento mais previsível do seu programa.

### 5. Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada.