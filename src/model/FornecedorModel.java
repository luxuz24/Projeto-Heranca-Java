package model;

public class FornecedorModel extends PessoaModel{

    private double valorCredito;
    private double valorDivida;

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public FornecedorModel(String nome, String telefone, EnderecoModel endereco, double valorCredito, double valorDivida) {
        super(nome, telefone, endereco);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }


    public double obterValorSaldo () {
        return this.getValorCredito() - this.getValorDivida();
    }






}
