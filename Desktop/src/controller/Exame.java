package controller;

public class Exame {
    private String tipo;
    private String data;
    private String id;
    private String cpfPaciente;
    private String matriculaProfissional;

    public Exame(String tipo, String data, String id, String cpfPaciente, String matriculaProfissional) {
        this.tipo = tipo;
        this.data = data;
        this.id = id;
        this.cpfPaciente = cpfPaciente;
        this.matriculaProfissional = matriculaProfissional;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
