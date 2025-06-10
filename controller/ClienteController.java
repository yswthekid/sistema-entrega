package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteController {
    private static List<Cliente> clientes = new ArrayList<>();

    public static void cadastrarCliente(String nome, String telefone) {
        clientes.add(new Cliente(nome, telefone));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("--- Lista de Clientes ---");
            for (Cliente c : clientes) {
                System.out.println("Nome: " + c.getNome() + ", Telefone: " + c.getTelefone());
            }
        }
    }
}