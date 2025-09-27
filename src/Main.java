import controller.FuncionarioController;
import model.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("\n---  EnderecoModel ---");
        EnderecoModel enderecoBase = new EnderecoModel("Rua Principal", "123", "Campo Grande", "MS");
        System.out.println(enderecoBase);

        System.out.println("\n--- PessoaModel ---");
        PessoaModel pessoa = new PessoaModel("Ana Carolina", "67912345678", enderecoBase);
        System.out.println(pessoa);


        System.out.println("\n--- FornecedorModel ---");
        EnderecoModel endFornecedor = new EnderecoModel("Avenida das Industrias", "987", "Dourados", "MS");
        FornecedorModel fornecedor = new FornecedorModel("Distribuidora XYZ", "6734215555", endFornecedor, 15000.00, 8500.00);
        System.out.println(fornecedor);


        System.out.println("\n--- EmpregadoModel ---");
        EmpregadoModel empregado = new EmpregadoModel("Bruno Silva", "11987654321", enderecoBase, 101, 3500.00);
        System.out.println(empregado);

        System.out.println("\n---  AdministradorModel ---");
        AdministradorModel admin = new AdministradorModel("Carlos Andrade", "21911112222", enderecoBase, 102, 7000.00, 800.00);
        System.out.println(admin);


        System.out.println("\n---  OperarioModel ---");
        OperarioModel operario = new OperarioModel("Fernanda Lima", "31933334444", enderecoBase, 201, 2800.00, 20000.00, 0.05);
        System.out.println(operario);


        System.out.println("\n--- VendedorModel ---");
        VendedorModel vendedor = new VendedorModel("Ricardo Mendes", "41955556666", enderecoBase, 301, 2500.00, 50000.00, 0.10);
        System.out.println(vendedor);

        FuncionarioController controller = new FuncionarioController();

        EnderecoModel end1 = new EnderecoModel("Rua das Industrias", "123", "Campo Grande", "MS");
        EnderecoModel end2 = new EnderecoModel("Avenida das Flores", "456", "São Paulo", "SP");
        EnderecoModel end3 = new EnderecoModel("Praça do Comércio", "789", "Rio de Janeiro", "RJ");

        controller.adicionarAdministrador("Carlos Silva", "67911112222", end1, 101, 6000.00, 500.00);
        controller.adicionarOperario("Joana Pereira", "11933334444", end2, 202, 2800.00, 15000.00, 0.05);
        controller.adicionarVendedor("Marcos Rocha", "21955556666", end3, 303, 2500.00, 40000.00, 0.10);

        System.out.println("\n");

        controller.exibirTodosOsFuncionarios();

    }
}