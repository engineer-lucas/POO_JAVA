## 💡 Desafio POO: Simulação de Conta Bancária (Encapsulamento Avançado)

Este desafio prático tem como objetivo aprimorar a compreensão e aplicação dos pilares da **Programação Orientada a Objetos (POO)** em Java, com foco em **Encapsulamento**, **Visibilidade** e **Lógica de Negócio**.

---

### 📋 Enunciado da Questão

**Crie e implemente uma classe chamada `ContaBancaria` em Java, seguindo o diagrama de classes (UML) e incorporando as regras de negócio descritas abaixo.**

#### 1. Estrutura da Classe

Defina a classe `ContaBancaria` utilizando os seguintes atributos (membros) e métodos:

| Membro | Visibilidade | Tipo/Descrição |
| :--- | :--- | :--- |
| `numConta` | `private` | Número da conta (inteiro). |
| `tipo` | `private` | Tipo da conta ("CC" para Corrente, "CP" para Poupança). |
| `proprietario` | `private` | Nome do titular da conta. |
| `saldo` | `private` | Saldo da conta (real). |
| `status` | `private` | Indica se a conta está aberta (`true`) ou fechada (`false`). |

#### 2. Métodos Especiais (Getters & Setters)

Implemente os métodos **Getters e Setters** para todos os atributos, garantindo que o acesso e a modificação dos dados privados sejam controlados.

* **Observação sobre `saldo`:** O `setter` de `saldo` deve ser `private` ou `protected`, pois o saldo deve ser alterado apenas pelos métodos de transação (`depositar`, `sacar`, `pagarAnuidade`).

#### 3. Métodos Personalizados (Regras de Negócio)

Implemente um **Construtor sem argumentos** que inicialize `saldo = 0` e `status = false`. Em seguida, implemente os seguintes métodos com as lógicas de negócio específicas:

| Método | Retorno | Lógica de Negócio |
| :--- | :--- | :--- |
| `abrirConta()` | `void` | 1. Define `numConta`, `tipo` e `proprietario` (recebidos como parâmetros). 2. Define `status = true`. 3. Se `tipo` for "CC", adiciona R$ 50,00 ao `saldo` como bônus. 4. Se `tipo` for "CP", adiciona R$ 150,00 ao `saldo` como bônus. |
| `fecharConta()` | `void` | 1. Só pode fechar se o `saldo` for zero. 2. Se `saldo > 0`, exibe "Erro: Saque o saldo". 3. Se `saldo < 0`, exibe "Erro: Pague o débito". 4. Se `saldo = 0`, define `status = false`. |
| `depositar()` | `void` | 1. Só pode depositar se a conta estiver aberta (`status = true`). 2. Se estiver aberta, adiciona o `valor` ao `saldo`. |
| `sacar()` | `void` | 1. Só pode sacar se a conta estiver aberta (`status = true`). 2. Só pode sacar se o `saldo` for suficiente (`saldo >= valor`). 3. Se as condições forem atendidas, subtrai o `valor` do `saldo`. |
| `pagarAnuidade()` | `void` | 1. Se `tipo` for "CC", o valor da anuidade é R$ 12,00. 2. Se `tipo` for "CP", o valor da anuidade é R$ 20,00. 3. O débito só pode ser realizado se a conta estiver aberta e houver `saldo` suficiente. |
| `estadoAtual()` | `void` | Exibe no console o valor de todos os atributos do objeto. |

---

### 🚀 Desafio Extra

Demonstre a funcionalidade da classe `ContaBancaria` na classe `Main`, criando pelo menos dois objetos e realizando diferentes transações (abrir conta, depositar, sacar, pagar anuidade e tentar fechar a conta em condições inválidas).