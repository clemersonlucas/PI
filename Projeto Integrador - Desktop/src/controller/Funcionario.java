package controller;

public interface Funcionario{
    
    // método para o usuario adicionar uma consulta para o usuario
    public boolean criarUmaConsulta (String turno, String data, Funcionario funcionario);
    public void adicionaRemedio (Paciente paciente, Medicamento medicamento); 
   
    
    public Paciente buscaPaciente (String cpf);
    public boolean cadastraPaciente (Paciente paciente);
    public Estoque acessarEstoque ();
    public boolean adicionarEventos (Evento evento);
    
    // não tenho ideia de como vamos fazer
    public ListaConsultas confirmarConsultas ();
    public void editarProntuario (Paciente paciente);

    public String getProfissao();
}
