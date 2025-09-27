package model;

import model.EmpregadoModel;
import model.EnderecoModel;

public class VendedorModel extends EmpregadoModel {

    private double valorVendas;
    private double comissao;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public VendedorModel(String nome, String telefone, EnderecoModel endereco, int codigoSetor, double valorSalarioBase, double valorVendas, double comissao) {
        super(nome, telefone, endereco, codigoSetor, valorSalarioBase);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }



    public double getValorMonetarioComissao() {
        return this.getValorVendas() * this.getComissao();
    }



    @Override
    public double calcularSalarioLiquido( double valorSalarioBaseParametro){
        double salarioBaseLiquido = super.calcularSalarioLiquido(this.getValorSalarioBase());
        return salarioBaseLiquido + this.getValorMonetarioComissao();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "----------- Detalhes do Vendedor ---------\n" +
                "Valor das Vendas: R$ " + String.format("%.2f", this.getValorVendas()) + "\n" +
                "Comissão (" + String.format("%.1f%%", this.getComissao() * 100) + "): R$ " + String.format("%.2f", this.getValorMonetarioComissao()) + "\n" +
                "Salário Final (com comissão): R$ " + String.format("%.2f", this.calcularSalarioLiquido(this.getValorSalarioBase()));
    }
}