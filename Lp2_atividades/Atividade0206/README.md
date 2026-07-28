# Respostas - Questão 2

# a) O que acontece quando a ação da linha 5 é executada?

**Resposta:**

Na Linha 5, é criado o Objeto "Funcionario" que receberá: Zé, 25 e 44 como parâmetros.

# b) Porque a construção das linhas 7 e 8 é permitida?

**Respostas**

Por que essas linhas executam uma atribuição direta de valores aos atributos do objeto. Isso só é permitido pelo compilador porque os atributos numRG e cpf na classe Funcionario possuem um modificador de acesso permissivo.

# c) Nas linhas 9 e 10, acessamos os atributos salário e matrícula do funcionário. Essa construção é permitida pelo objeto funcionário? Justifique sua resposta.

Tendo em vista as boas práticas de programação, o código não dedveria ser permitido. Pois, a forma como o código foi escrito, mantendo atributos íntegros como públicos, pode gerar uma série de complicações sobre segurança dos dados e encapsulamento.

