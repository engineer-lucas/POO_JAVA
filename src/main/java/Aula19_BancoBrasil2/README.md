## 🚀 Desafio Extra: Módulo Interativo e Segurança (Continuação POO)

Este desafio é uma extensão do projeto `ContaBancaria`, focando na integração de conceitos de **controle de fluxo**, **interatividade** e **segurança básica** em um sistema console. O objetivo é transformar a classe puramente lógica em uma aplicação utilizável.

---

### 🔑 Enunciado do Desafio

**Implemente um módulo de segurança e interatividade para a classe `ContaBancaria`, criando as seguintes estruturas:**

#### 1. Classe de Suporte: `Autenticador`

Crie a classe `Autenticador` para gerenciar as credenciais do sistema:

* Utilize um `HashMap` (`Map<String, String>`) para armazenar os usuários e senhas de teste.
* Implemente o método `autenticar(usuario, senha)`: Verifica se as credenciais fornecidas correspondem a um registro existente.
* Implemente o método `cadastrar(usuario, senha)`: Adiciona um novo usuário ao mapa, prevenindo a duplicação.

#### 2. Classe Principal: `Main` Interativa

Modifique a classe `Main` para orquestrar o sistema em três fases distintas:

| Fase | Controle de Fluxo | Requisitos Funcionais |
| :--- | :--- | :--- |
| **I. Autenticação** | Loop `while` inicial (menu de login). | 1. Use `Scanner` para capturar `usuário` e `senha`. 2. Ofereça opções de **Login**, **Cadastro** e **Sair** do sistema. 3. Utilize a classe `Autenticador` para validar o acesso. |
| **II. Criação de Conta** | Executada somente após um login bem-sucedido. | 1. Crie uma nova instância de `ContaBancaria`. 2. Utilize a classe `java.util.Random` para gerar um **`numConta`** único de 4 dígitos (ex: 1000 a 9999). 3. Chame o método `abrirConta()` com os dados do usuário logado. |
| **III. Menu de Operações** | Loop `while` interno (acessível apenas se logado). | 1. Exiba um menu com todas as ações da `ContaBancaria` (`depositar`, `sacar`, `estadoAtual`, etc.). 2. Permita que o usuário insira valores para as transações usando `Scanner`. 3. **Novo Requisito:** Inclua uma opção explícita para **Voltar ao Menu Inicial (Logoff)**, limpando a sessão do usuário logado e retornando à Fase I. |

#### 4. Saída do Sistema

O sistema deve incluir uma opção final de **Sair**, que encerre todos os loops e exiba uma mensagem de despedida, como "Obrigado por utilizar o Banco Java-POO!".