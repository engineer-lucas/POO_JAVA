package Aula19_BancoBrasil2;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autenticador auth = new Autenticador();
        ContaBancaria contaUsuario = null;

        boolean executando = true;
        String usuarioLogado = null;

        // --- 1. LOOP DE AUTENTICAÇÃO E CADASTRO ---
        while (executando) { // O loop principal continua rodando

            if (usuarioLogado == null) {
                // Menu de Login/Cadastro
                System.out.println("------------------------------------");
                System.out.println("  BEM-VINDO AO BANCO JAVA-POO  ");
                System.out.println("------------------------------------");
                System.out.println("1. Login");
                System.out.println("2. Cadastrar Novo Usuário");
                System.out.println("3. Sair do Sistema");
                System.out.print("Escolha uma opção: ");

                int opcaoLogin = 0;
                if (scanner.hasNextInt()) {
                    opcaoLogin = scanner.nextInt();
                }
                scanner.nextLine();

                switch (opcaoLogin) {
                    case 1:
                        System.out.print("Usuário: ");
                        String user = scanner.nextLine();
                        System.out.print("Senha: ");
                        String pass = scanner.nextLine();

                        if (auth.autenticar(user, pass)) {
                            usuarioLogado = user;
                            System.out.println("\nLogin bem-sucedido! Bem-vindo(a), " + usuarioLogado + ".");

                            // Cria uma conta de teste com número aleatório após o login.
                            Random rand = new Random();
                            contaUsuario = new ContaBancaria();
                            contaUsuario.abrirConta(1000 + rand.nextInt(9000), "CC", usuarioLogado);
                        } else {
                            System.out.println("\nErro de autenticação. Verifique suas credenciais.");
                        }
                        break;

                    case 2:
                        System.out.print("Novo Usuário: ");
                        String novoUser = scanner.nextLine();
                        System.out.print("Nova Senha: ");
                        String novaPass = scanner.nextLine();

                        if (auth.cadastrar(novoUser, novaPass)) {
                            System.out.println("\n Usuário " + novoUser + " cadastrado com sucesso! Faça login.");
                        } else {
                            System.out.println("\n Falha no cadastro. Usuário " + novoUser + " já existe.");
                        }
                        break;

                    case 3:
                        executando = false;
                        break;

                    default:
                        System.out.println("\nOpção inválida. Tente novamente.");
                }

            } else {
                // --- 2. MENU DE OPERAÇÕES BANCÁRIAS (Se estiver logado) ---
                System.out.println("\n====================================");
                System.out.println("  MENU DA CONTA DE " + usuarioLogado.toUpperCase());
                System.out.println("====================================");
                System.out.println("1. Exibir Estado Atual da Conta");
                System.out.println("2. Depositar");
                System.out.println("3. Sacar");
                System.out.println("4. Pagar Anuidade");
                System.out.println("5. Fechar Conta");
                System.out.println("7. Voltar ao Menu Inicial (Logoff)"); // Opção de Logoff
                System.out.println("8. SAIR DO SISTEMA"); // Opção de Saída
                System.out.print("Escolha uma operação: ");

                int opcaoMenu = 0;
                if (scanner.hasNextInt()) {
                    opcaoMenu = scanner.nextInt();
                }
                scanner.nextLine();
                double valor;

                switch (opcaoMenu) {
                    case 1:
                        contaUsuario.estadoAtual();
                        break;
                    case 2:
                        System.out.print("Valor para depositar: R$");
                        valor = scanner.nextDouble();
                        scanner.nextLine();
                        contaUsuario.depositar(valor);
                        break;
                    case 3:
                        System.out.print("Valor para sacar: R$");
                        valor = scanner.nextDouble();
                        scanner.nextLine();
                        contaUsuario.sacar(valor);
                        break;
                    case 4:
                        contaUsuario.pagarAnuidade();
                        break;
                    case 5:
                        contaUsuario.fecharConta();
                        break;
                    case 7: // LOGOFF (Volta ao Menu Inicial)
                        usuarioLogado = null;
                        contaUsuario = null; // Zera o objeto conta para forçar a criação de uma nova no próximo login
                        System.out.println("\n Logoff realizado com sucesso.");
                        break;
                    case 8:
                        executando = false;
                        break;
                    default:
                        System.out.println("\nOpção inválida. Tente novamente.");
                }
            }
        }

        // --- MENSAGEM DE SAÍDA ---
        System.out.println("\n Sistema encerrado. Obrigado por utilizar o Banco Java-POO!");
        scanner.close();
    }
}