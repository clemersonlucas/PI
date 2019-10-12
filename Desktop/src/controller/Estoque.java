package controller;

public class Estoque {
    private String nome;
    private String validade;
    private int quantidade;
    private String descricao;
    private String fabricacao;
    private int id;
    private String matriculaProfissional;

    public Estoque(String nome, String validade, int quantidade, String descricao, String fabricacao, int id, String matriculaProfissional) {
        this.nome = nome;
        this.validade = validade;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.fabricacao = fabricacao;
        this.id = id;
        this.matriculaProfissional = matriculaProfissional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatriculaProfissional() {
        return matriculaProfissional;
    }

    public void setMatriculaProfissional(String matriculaProfissional) {
        this.matriculaProfissional = matriculaProfissional;
    }
}
