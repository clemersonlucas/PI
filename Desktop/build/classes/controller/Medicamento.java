package controller;

public class Medicamento {
       
    private String nome;
    private String dataInicial, dataFinal;
    private int intervaloHoras;
    private String id;
    private String cpfPaciente, matriculaProfissional;

    public Medicamento(String nome, String dataInicial, String dataFinal, int intervaloHoras, String id, String cpfPaciente, String matriculaProfissional) {
        this.nome = nome;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.intervaloHoras = intervaloHoras;
        this.id = id;
        this.cpfPaciente = cpfPaciente;
        this.matriculaProfissional = matriculaProfissional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getIntervaloHoras() {
        return intervaloHoras;
    }

    public void setIntervaloHoras(int intervaloHoras) {
        this.intervaloHoras = intervaloHoras;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getMatriculaProfissional() {
        return matriculaProfissional;
    }

    public void setMatriculaProfissional(String matriculaProfissional) {
        this.matriculaProfissional = matriculaProfissional;
    }
    
    
    
}
