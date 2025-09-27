package model;

public class EmpregadoModel extends PessoaModel{
    private int codigoSetor;
    private double ValorSalarioBase;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getValorSalarioBase() {
        return ValorSalarioBase;
    }

    public void setValorSalarioBase(double valorSalarioBase) {
        ValorSalarioBase = valorSalarioBase;
    }

    public EmpregadoModel(String nome, String telefone, EnderecoModel endereco, int codigoSetor, double valorSalarioBase) {
        super(nome, telefone, endereco);
        this.codigoSetor = codigoSetor;
        ValorSalarioBase = valorSalarioBase;
    }

    public double calcularSalarioLiquido( double ValorSalarioBaseParametro) {
        double irpf = 0.0;
        if (ValorSalarioBaseParametro < 2259.21) {
            irpf = 0.0; // 0%
        } else if (ValorSalarioBaseParametro >= 2259.21 && ValorSalarioBaseParametro <= 2826.65) {
            irpf = 0.075; // 7,5%
        } else if (ValorSalarioBaseParametro >= 2826.66 && ValorSalarioBaseParametro <= 3751.05) {
            irpf = 0.15; /// 15%  15 / 100
        } else if (ValorSalarioBaseParametro >= 3751.06 && ValorSalarioBaseParametro <= 4664.68) {
            irpf = 0.225; // 22.5%
        } else if (ValorSalarioBaseParametro >= 4664.68) {
            irpf = 0.275; // 27.5%
        }
        double salarioLiquido = 0.0;
        // 10.000,00     - (10.000,00 * imposto);
        salarioLiquido = ValorSalarioBaseParametro - (ValorSalarioBaseParametro * irpf);
        return salarioLiquido;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "-------- Informações do Empregado -------------\n" +
                "Código do Setor: " + this.getCodigoSetor() + "\n" +
                "Salário Base: R$ " + String.format("%.2f", this.getValorSalarioBase()) + "\n" +
                "Salário Líquido: R$ " + String.format("%.2f", this.calcularSalarioLiquido(this.getValorSalarioBase()));
    }



}






