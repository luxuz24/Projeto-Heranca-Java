package model;

import model.EmpregadoModel;
import model.EnderecoModel;

public class OperarioModel extends EmpregadoModel {


    private double valorProducao; // Valor monetário dos itens produzidos
    private double comissao;      // Porcentagem sobre o valor de produção (ex: 0.05 para 5%)


    public OperarioModel(String nome, String telefone, EnderecoModel endereco, int codigoSetor, double valorSalarioBase, double valorProducao, double comissao) {
        super(nome, telefone, endereco, codigoSetor, valorSalarioBase);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    public double getValorMonetarioComissao() {
        return this.getValorProducao() * this.getComissao();
    }

    @Override
    public double calcularSalarioLiquido(double ValorSalarioBaseParametro) {
        double salarioBaseLiquido = super.calcularSalarioLiquido(this.getValorSalarioBase());
        return salarioBaseLiquido + this.getValorMonetarioComissao();
    }

    @Override
    public String toString() {
        String infoBaseEmpregado = super.toString();

        return infoBaseEmpregado + "\n" +
                "----------- Detalhes do Operário ---------\n" +
                "Valor da Produção: R$ " + String.format("%.2f", this.getValorProducao()) + "\n" +
                "Comissão (" + String.format("%.1f%%", this.getComissao() * 100) + "): R$ " + String.format("%.2f", this.getValorMonetarioComissao()) + "\n" +
                "Salário Final (com comissão): R$ " + String.format("%.2f", this.calcularSalarioLiquido(this.getValorSalarioBase()));
    }
}