package model;

public class EnderecoModel {
    private String logradouro;
    private String numero;
    private String municipio;
    private String estado;


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public EnderecoModel(String logradouro, String numero, String municipio, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.municipio = municipio;
        this.estado = estado;
    }

    public EnderecoModel() {
    }

    @Override
    public String toString() {
        return "\n"+
                "Logradouro: " + this.getLogradouro() + "\n" +
                "Numero: "+ this.getNumero() + "\n" +
                "Municipio: "+ this.getMunicipio() + "\n" +
                "Estado: " + this.getEstado();
    }
}
