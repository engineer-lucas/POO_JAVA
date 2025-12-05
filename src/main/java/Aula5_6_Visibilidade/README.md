---

## 📚 Aulas 05 e 06: Encapsulamento e Visibilidade em POO Java

Estas aulas, ministradas pelo **Prof. Lucas Santos**, abordam um dos pilares fundamentais da Programação Orientada a Objetos: **Encapsulamento** e o controle de **Visibilidade** em atributos e métodos.

---

### 🔑 Aula 05: O que é Visibilidade em um Objeto (Teoria)

Esta aula foca na base teórica do encapsulamento e dos modificadores de acesso em Java.

#### 1. Encapsulamento
* É a capacidade de **esconder os detalhes internos** de um objeto, protegendo seus atributos e métodos de acessos externos diretos e não controlados.
* É comparado a um controle remoto de TV, onde o usuário interage apenas com a parte pública (botões), sem precisar saber como a parte privada (circuito interno) funciona.

#### 2. Modificadores de Acesso
São palavras-chave que definem quem pode acessar os membros de uma classe:

| Modificador | Nível de Acesso | Descrição |
| :--- | :--- | :--- |
| **`public`** | Acesso total | Acessível por todos, de qualquer lugar. |
| **`protected`** | Herança | Acessível pela própria classe, classes no mesmo pacote e subclasses (classes filhas). |
| **`default`** (pacote) | Pacote | Acessível pela própria classe e por todas as classes no mesmo pacote. |
| **`private`** | Restrito | Acessível **apenas** pela própria classe onde foi declarado. |

#### 3. Métodos Especiais: Getters, Setters e Construtores
Para controlar o acesso a atributos **`private`**, utilizam-se métodos específicos:
* **Getters (`get`):** Métodos que permitem **ler** (obter) o valor de um atributo privado.
* **Setters (`set`):** Métodos que permitem **modificar** (atribuir) o valor de um atributo privado, sendo ideais para incluir regras de validação.
* **Construtores (`Construct`):** Métodos chamados no momento da **instanciação** do objeto (`new`), usados para definir o estado inicial dos atributos.

---

### ⚙️ Aula 06: Configurando Visibilidade (Prática)

Esta aula aplica os conceitos teóricos, reestruturando a classe `Caneta` para utilizar o encapsulamento.

#### 1. Aplicação dos Modificadores na Classe `Caneta`
* Alguns atributos são definidos como **`private`** (e.g., `ponta` e `tampada`), enquanto outros podem ser **`public`** (e.g., `modelo`) para demonstração.

#### 2. Implementação de Getters e Setters
* São criados os métodos `getPonta()` e `setPonta(float p)`.
* O método `setPonta()` inclui uma **validação** simples para garantir que a ponta seja maior que zero (`if (p > 0.0f)`) antes de atribuir o valor.
* O getter para o atributo booleano `tampada` é convencionalmente chamado de `isTampada()`.

#### 3. Implementação do Construtor
* É adicionado um **construtor** padrão `Caneta()` que define valores iniciais para os atributos do objeto, como `ponta = 0.5f`, `tampada = true` e `cor = "Vermelho"`.

#### 4. Demonstração Prática
A classe principal demonstra como interagir com o objeto agora encapsulado:
* Criação do objeto usando o novo construtor: `Caneta c1 = new Caneta();`.
* Acesso direto a atributos `public`: `c1.modelo = "Bic";`.
* Uso dos métodos **`set`** para alterar atributos `private` de forma controlada: `c1.setPonta(0.7f);`.
* O método `status()` é modificado para utilizar os próprios métodos `get` da classe para leitura, garantindo o acesso correto aos atributos privados.