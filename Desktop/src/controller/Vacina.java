package controller;

public class Vacina {
    private String data;
    private String id;
    private String matriculaProfisional;
    private String cpfPaciente;
    private int idEstoque;

    private Vacina (){}
    
    public Vacina(String data, String id, String cpfPaciente, String matriculaProfisional, int idEstoque) {
        this.data = data;
        this.id = id;
        this.cpfPaciente = cpfPaciente;
        this.matriculaProfisional = matriculaProfisional;
        this.idEstoque = idEstoque;
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

    public String getMatriculaProfisional() {
        return matriculaProfisional;
    }

    public void setMatriculaProfisional(String matriculaProfisional) {
        this.matriculaProfisional = matriculaProfisional;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }
    
    
    

    
}
