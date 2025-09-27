package model;

public class PessoaModel {
    private String nome;
    private String telefone;
    private EnderecoModel endereco;

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public PessoaModel(String nome, String telefone, EnderecoModel endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public PessoaModel() {
    }

    @Override
    public String toString() {
        return "-------------- Informacoes Pessoais --------------" + "\n" +
                "Nome: "+ this.getNome()+"\n" +
                "Telefone: "+this.getTelefone()+"\n" +
                "-------------- Informacoes de Endereco -------------- "
                + this.getEndereco()+"\n";
    }
}
