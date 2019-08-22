package controller;

public class Consulta {
    private String id;
    private String descricao;
    private String diagnostico;
    private String status;
    
    private String entrada;
    private String fim;
    private String comeco;
    
    // especialização do funcionario
    private String especializacao;
    private String dataMarcada;
    
    // construtor
    public Consulta(String id, String descricao, String diagnostico, 
            String status, String entrada, String fim, String comeco, String especializacao, 
            String dataMarcada) {
        this.id = id;
        this.descricao = descricao;
        this.diagnostico = diagnostico;
        this.status = status;
        this.entrada = entrada;
        this.fim = fim;
        this.comeco = comeco;
        this.especializacao = especializacao;
        this.dataMarcada = dataMarcada;
    }
    
    // métodos getters e setters 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public String getComeco() {
        return comeco;
    }

    public void setComeco(String comeco) {
        this.comeco = comeco;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getDataMarcada() {
        return dataMarcada;
    }

    public void setDataMarcada(String dataMarcada) {
        this.dataMarcada = dataMarcada;
    }

    @Override
    public String toString() {
        return "Consulta com " + this.especializacao + " às " + this.dataMarcada;
    }
}
