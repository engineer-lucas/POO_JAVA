## 💡 Nova Tarefa POO: Simulador de Pedido Online (App de Comida) 🍔

Este desafio simula uma situação real e de fácil entendimento: o gerenciamento de um item em um pedido de aplicativo de entrega. O objetivo é aplicar os conceitos de **Programação Orientada a Objetos (POO)** em um contexto de comércio eletrônico, focando em **Encapsulamento** e **Lógica de Negócio**.

---

### 📋 Enunciado da Questão

**Crie e implemente uma classe chamada `Pedido` em Java que represente um item único dentro de um carrinho de compras de um aplicativo de comida.**

#### 1. Classe Principal: `Pedido.java`

Defina a classe `Pedido` com os seguintes atributos, todos eles **privados** para garantir o encapsulamento:

| Atributo | Tipo | Descrição |
| :--- | :--- | :--- |
| `item` | `String` | Nome do produto (Ex: "Hambúrguer Clássico"). |
| `quantidade` | `int` | Quantidade pedida do item. |
| `precoUnitario` | `double` | Preço de uma unidade do item. |
| `adicionais` | `String` | Lista de ingredientes extras (Ex: "Bacon, Cheddar"). |
| `status` | `String` | Estado do pedido (Ex: "Recebido", "Em Preparação", "Pronto"). |

#### 2. Construtor

Crie um **método construtor** que receba o `item`, a `quantidade` e o `precoUnitario` como argumentos. O construtor deve definir automaticamente:

* `adicionais` como `"Nenhum"`.
* `status` como `"Recebido"`.

#### 3. Métodos Especiais (Getters e Setters)

Implemente os métodos **Getters e Setters** para todos os atributos.

* **Validação no Setter:** O **Setter** para `quantidade` (`setQuantidade`) deve incluir uma validação que só permita a atribuição de valores **maiores que zero**. Se o valor for inválido, exiba uma mensagem de erro.

#### 4. Métodos Personalizados (Lógica de Negócio)

Implemente os seguintes métodos para simular as funcionalidades do aplicativo:

| Método | Retorno | Descrição |
| :--- | :--- | :--- |
| `calcularTotal()` | `double` | Retorna o valor total do item (`quantidade * precoUnitario`). |
| `adicionarExtra(extra)` | `void` | Concatena o novo `extra` com os `adicionais` existentes. Se for o primeiro, substitui a palavra `"Nenhum"`. |
| `mudarStatus(novoStatus)` | `void` | Altera o `status` do pedido e exibe uma mensagem de confirmação. |
| `detalharPedido()` | `void` | Exibe no console todos os atributos do objeto, incluindo o **Total do Item** calculado. |

---

### 🚀 Desafio Extra: Classe `Main`

Crie uma classe `Main` para demonstrar o uso da classe `Pedido`:

1.  Crie pelo menos dois objetos `Pedido` diferentes usando o construtor.
2.  Use o método `adicionarExtra()` múltiplas vezes em pelo menos um dos pedidos.
3.  Use o Setter (`setQuantidade`) para **testar a validação**, tentando atribuir um valor menor ou igual a zero.
4.  Use o método `mudarStatus()` para simular a progressão do pedido (Ex: de "Recebido" para "Em Preparação").
5.  Exiba os detalhes completos usando o `detalharPedido()` para ambos os objetos.
