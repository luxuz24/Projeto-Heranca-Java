package model;

public class AdministradorModel extends EmpregadoModel{
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public AdministradorModel(String nome, String telefone, EnderecoModel endereco, int codigoSetor, double valorSalarioBase, double ajudaDeCusto) {
        super(nome, telefone, endereco, codigoSetor, valorSalarioBase);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalarioLiquido(double ValorSalarioBaseParametro) {
        return super.calcularSalarioLiquido(ValorSalarioBaseParametro) + this.getAjudaDeCusto();
    }



    @Override
    public String toString() {

        String infoPessoa = super.toString().split("--------")[0];

        double salarioLiquidoBase = super.calcularSalarioLiquido(this.getValorSalarioBase());

        double salarioFinalAdmin = this.calcularSalarioLiquido(this.getValorSalarioBase());

        return infoPessoa +
                "-------- Informações do Empregado -------------\n" +
                "Código do Setor: " + this.getCodigoSetor() + "\n" +
                "Salário Base: R$ " + String.format("%.2f", this.getValorSalarioBase()) + "\n" +
                "Salário Líquido (pós-imposto): R$ " + String.format("%.2f", salarioLiquidoBase) + "\n" +
                "----------- Detalhes do Administrador ---------\n" +
                "Ajuda de Custo: R$ " + String.format("%.2f", this.getAjudaDeCusto()) + "\n" +
                "Salário Final (com bônus): R$ " + String.format("%.2f", salarioFinalAdmin);
    }
}
