## 🧠 Explicação Teórica da Classe `Caneta` e POO

A classe `Caneta` que você desenvolveu é um excelente exemplo prático dos pilares da **Programação Orientada a Objetos (POO)** em Java.

---

### 1. Encapsulamento (Encapsulation) 🛡️

O encapsulamento é o princípio de **esconder** os detalhes internos de um objeto e proteger seus dados.

* **Atributos Privados (`private`):** Atributos como `cor`, `ponta` e `tampada` foram definidos como **privados**. Isso significa que eles só podem ser acessados e modificados por métodos dentro da própria classe `Caneta`. Essa proteção evita que o estado interno do objeto seja alterado de forma inesperada ou incorreta a partir do código externo (`Main.java`).
* **Atributos Protegidos (`protected`):** Atributos como `modelo` e `carga` são `protected`. Eles podem ser acessados pela própria classe, por classes filhas (herança) e por classes dentro do mesmo pacote. Isso oferece um nível de acesso um pouco mais flexível que o `private`, mas ainda restrito.

---

### 2. Métodos Especiais (Getters e Setters) 📝

Para permitir que o mundo exterior interaja com os atributos privados de forma controlada, usamos os métodos especiais:

* **Getters (Métodos Acessores):**
    * Sua função é apenas **retornar** o valor de um atributo (ler o dado).
    * Exemplos: `getCor()`, `isTampada()` (o prefixo `is` é comum para *booleans*).
* **Setters (Métodos Modificadores):**
    * Sua função é **modificar** o valor de um atributo (escrever o dado), recebendo o novo valor como parâmetro.
    * Exemplo: `setPonta(double p)`.
    * Em um cenário real, o *setter* é o local ideal para adicionar **validações** (ex: garantir que a ponta não seja um valor negativo).

---

### 3. Construtor (Constructor) 🧱

O método construtor (`public Caneta(String cor, boolean tampada)`) é o responsável por **inicializar** o objeto quando ele é criado (instanciado) com a palavra-chave `new`.

* Ele garante que o objeto comece em um **estado válido** (neste caso, com uma cor e um estado de tampada definidos).

---

### 4. Métodos Personalizados (Comportamento) 🏃‍♀️

Os métodos como `rabiscar()`, `tampar()`, `destampar()` e `status()` definem o **comportamento** (ações) que o objeto `Caneta` pode realizar.

* **Lógica Interna:** O método `rabiscar()`, por exemplo, contém uma lógica interna (`if (this.tampada == true)`). Essa lógica é um ótimo exemplo de como o **encapsulamento** funciona: a caneta verifica o seu próprio estado privado (`tampada`) antes de executar a ação, garantindo que o comportamento seja consistente com a realidade do objeto.