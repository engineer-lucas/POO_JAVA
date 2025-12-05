package Aula19_BancoBrasil2;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe responsável por gerenciar credenciais de usuários (login/senha).
 * Esta classe simula um banco de dados de usuários usando um HashMap
 * e é crucial para o módulo de segurança do sistema.
 */
public class Autenticador {

    // Atributo privado: Armazena o mapeamento de Nome de Usuário (Chave) -> Senha (Valor).
    // O HashMap é ideal para buscas rápidas por chave (login).
    private Map<String, String> usuarios = new HashMap<>();

    /**
     * Construtor da classe Autenticador.
     * Inicializa o sistema com um conjunto de usuários de teste pré-definidos.
     */
    public Autenticador() {
        // Usuários para teste
        usuarios.put("admin", "1234");
        usuarios.put("Lucas", "senha123");
        usuarios.put("maria", "4321");
    }

    /**
     * Tenta autenticar um usuário no sistema.
     * * @param usuario Nome de usuário fornecido pelo usuário.
     * @param senha Senha fornecida pelo usuário.
     * @return true se o usuário existir e a senha for correta; false caso contrário.
     */
    public boolean autenticar(String usuario, String senha) {
        // 1. Verifica se o nome de usuário existe no mapa.
        if (usuarios.containsKey(usuario)) {
            // 2. Se existir, compara a senha fornecida com a senha armazenada (o valor no mapa).
            if (usuarios.get(usuario).equals(senha)) {
                return true; // Autenticação bem-sucedida
            }
        }
        return false; // Usuário não existe ou senha incorreta
    }

    /**
     * Cadastra um novo usuário no sistema.
     * * @param usuario Novo nome de usuário a ser cadastrado.
     * @param senha Nova senha associada ao usuário.
     * @return true se o cadastro foi realizado com sucesso; false se o usuário já existir.
     */
    public boolean cadastrar(String usuario, String senha) {
        // Verifica se o nome de usuário já está em uso
        if (usuarios.containsKey(usuario)) {
            return false; // Usuário já existe, não pode cadastrar novamente
        }

        // Adiciona o novo par (usuário, senha) ao mapa
        usuarios.put(usuario, senha);
        return true;
    }
}