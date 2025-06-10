package view;

import java.util.Scanner;
import controller.ClienteController;

public class MenuView {
    public static void exibirMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- Sistema de Entrega ---");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha
            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone do cliente: ");
                    String telefone = sc.nextLine();
                    ClienteController.cadastrarCliente(nome, telefone);
                    break;
                case 2:
                    ClienteController.listarClientes();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
        sc.close();
    }
}