package controller;

public class Prontuario {
    private int numero;
    
    // dados tão somente do protuario
    private String nacionalidade;
    private String nomePai;
    private String nomeMae;
    private String estadoCivil;
    private String cor;
    
    private Prontuario (){}
    
    
    // método construtor parametrizado
    public Prontuario(int numero, String nacionalidade, String nomePai, String nomeMae, String estadoCivil, String cor) {
        this.numero = numero;
        this.nacionalidade = nacionalidade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.estadoCivil = estadoCivil;
        this.cor = cor;
    }
    
    
    //método getters e setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
}
