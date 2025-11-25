## 📚 Aula 04: Criando Classes e Objetos em Java (Prática)

Esta aula, ministrada pelo **Prof. Lucas Santos**, foca na **Programação Orientada a Objetos (POO)** em Java, com um passo a passo prático sobre a **criação de classes e objetos**.

O conteúdo abrange desde a configuração inicial de um projeto no ambiente de desenvolvimento integrado (IDE) até a implementação de classes e a manipulação de objetos.

---

### 💻 Tópicos Abordados na Prática

#### 1. Configuração do Projeto no NetBeans (Exemplo Prático)
* **Criação de Novo Projeto:** Demonstração de como iniciar um "Novo Projeto" no IDE, escolhendo a categoria "Java" e o tipo "Aplicação Java".
* **Definição do Projeto:** Configuração do nome e localização do projeto , incluindo a opção de criar uma classe principal (main class).

#### 2. Criação da Classe Java
**Adicionar Nova Classe:** Instruções para criar uma nova classe Java , acessando o menu de contexto no pacote de códigos-fonte e selecionando **Novo > Classe Java...**.
**Nome e Localização:** Tela de configuração para o nome da classe e sua localização.

#### 3. Implementação e Uso da Classe `Caneta`
A aula utiliza a classe `Caneta` como exemplo para demonstrar os conceitos de POO.

* **Atributos (Características) da Classe `Caneta`:**
    * `String modelo`
    * `String cor`
    * `float ponta`
    * `int carga`
    * `boolean tampada`

* **Métodos (Ações) da Classe `Caneta`:**
    * `status()`: Exibe o estado atual da caneta, incluindo se está tampada ou não.
    * `rabiscar()`: Verifica se a caneta está tampada (`this.tampada == true`) para permitir ou negar a ação.
    * `tampar()`: Define o atributo `tampada` como `true`.
    * `destampar()`: Define o atributo `tampada` como `false`.

#### 4. Instanciação e Manipulação de Objetos
O código da classe principal demonstra como criar e interagir com objetos (`c1` e `c2`) da classe `Caneta`:

* **Objeto 1 (`c1`):** É criado , seus atributos são definidos (`cor = "Azul"`, `ponta = 0.5f`, `tampada = false`), e os métodos `tampar()`, `status()`, e `rabiscar()` são chamados.
* **Objeto 2 (`c2`):** É criado , seus atributos são definidos (`modelo = "Bic Cristal"`, `cor = "Preto"`), e os métodos `destampar()`, `status()`, e `rabiscar()` são chamados.

---

### 📝 Atividades Propostas

[cite_start]Ao final da aula, são sugeridas atividades para fixação dos conceitos:

1.  **Identificar e classificar um objeto físico** do seu ambiente.
2.  **Identificar e classificar um objeto conceitual/abstrato** do seu dia-a-dia.

---

Esta aula é essencial para quem está aprendendo a base da Programação Orientada a Objetos em Java, focando na criação e uso prático de classes para modelar o mundo real.

---