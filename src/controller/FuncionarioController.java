package controller;

import model.*;
import java.util.ArrayList;

public class FuncionarioController {

    private ArrayList<EmpregadoModel> listaDeFuncionarios;

    public FuncionarioController() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    public void adicionarAdministrador(String nome, String telefone, EnderecoModel endereco, int codigoSetor, double valorSalarioBase, double ajudaDeCusto) {
        AdministradorModel admin = new AdministradorModel(nome, telefone, endereco, codigoSetor, valorSalarioBase, ajudaDeCusto);
        this.listaDeFuncionarios.add(admin);
        System.out.println("Administrador " + nome + " adicionado com sucesso!");
    }

    public void adicionarOperario(String nome, String telefone, EnderecoModel endereco, int codigoSetor, double valorSalarioBase, double valorProducao, double comissao) {
        OperarioModel operario = new OperarioModel(nome, telefone, endereco, codigoSetor, valorSalarioBase, valorProducao, comissao);
        this.listaDeFuncionarios.add(operario);
        System.out.println("Operário " + nome + " adicionado com sucesso!");
    }

    public void adicionarVendedor(String nome, String telefone, EnderecoModel endereco, int codigoSetor, double valorSalarioBase, double valorVendas, double comissao) {
        VendedorModel vendedor = new VendedorModel(nome, telefone, endereco, codigoSetor, valorSalarioBase, valorVendas, comissao);
        this.listaDeFuncionarios.add(vendedor);
        System.out.println("Vendedor " + nome + " adicionado com sucesso!");
    }

    public void exibirTodosOsFuncionarios() {
        System.out.println("\n--- LISTA DE TODOS OS FUNCIONÁRIOS CADASTRADOS ---");
        if (listaDeFuncionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (EmpregadoModel funcionario : listaDeFuncionarios) {
            System.out.println(funcionario);
            System.out.println("====================================================");
        }
    }
}