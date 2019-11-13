package ws;

import com.google.gson.Gson;
import com.hospitaid.webservice.controller.*;
import com.hospitaid.webservice.dao.*;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("hospitaid")
public class HospitaidWS {

    @Context
    private UriInfo context;

    public HospitaidWS() {
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    
    
    // TESTE INSERT 
    @GET
    @Produces("application/text")
    @Path ("inserirPaciente/{sexo}/{etnia}/{senha}/{estadoCivil}/{rg}/{orgaoEmissor}/{dataExpedicao}/"
            + "{uf}/{observacoes}/{nomePai}/{nomeMae}/{nome}/{sus}/{fotoPerfil}/{nacionalidade}"
            + "/{naturalidade}/{nascimento}/{cpf}")
    public String inserirPaciente (
        @PathParam("sexo") String sexo,
        @PathParam("etnia") String etnia,
        @PathParam("senha") String senha,
        @PathParam("estadoCivil") String estadoCivil,
        @PathParam("rg") String rg,
        @PathParam("orgaoEmissor") String orgaoEmissor,
        @PathParam("dataExpedicao") String dataExpedicao,
        @PathParam("uf") String uf,
        @PathParam("observcaoes") String observcaoes,
        @PathParam("nomePai") String nomePai,
        @PathParam("nomeMae") String nomeMae,
        @PathParam("nome") String nome, 
        @PathParam("sus") String sus, 
        @PathParam("fotoPerfil") String fotoPerfil, 
        @PathParam("nacionalidade") String nacionalidade,
        @PathParam("naturalidade") String naturalidade,
        @PathParam("nascimento") String nascimento,
        @PathParam("cpf") String cpf){
        
        Paciente paciente = new Paciente(sexo, etnia, senha, estadoCivil, 
                rg, orgaoEmissor, dataExpedicao, uf, observcaoes, nomePai, nomeMae, nome, sus, 
                fotoPerfil, nacionalidade, naturalidade, nascimento, cpf);
        
        PacienteDAO.inserir(paciente);
        return "succes1!";        
    }
    
    @GET
    @Produces("application/text")
    @Path ("inserirConsulta/{data}/{descricao}/{diagnostico}/{hora}/{status}/"
            + "{incioConsulta}/{fimConsulta}/{entrada}/{especialidade}/{id}/{quemAgendou}/{paraPaciente}/")
    public String inserirConsulta (
        @PathParam("data") String data, 
        @PathParam("descricao") String descricao, 
        @PathParam("diagnostico") String diagnostico, 
        @PathParam("hora") String hora,
        @PathParam("status") String status,
        @PathParam("incioConsulta") String incioConsulta,
        @PathParam("fimConsulta") String fimConsulta,
        @PathParam("entrada") String entrada,
        @PathParam("especialidade") String especialidade,
        @PathParam("id") int id,
        @PathParam("quemAgendou") String quemAgendou,
        @PathParam("paraPaciente") String paraPaciente){
        
        
        ConsultaDAO.inserir(new Consulta(data, diagnostico, hora, descricao, status, 
                incioConsulta, fimConsulta, entrada, especialidade, id, quemAgendou, paraPaciente));
        return "succes2!";
    }
    
    @GET
    @Produces("application/text")
    @Path ("inserirMedicamento/{nome}/{dataInicial}/{dataFinal}/{intervaloHoras}/{id}/"
            + "{cpfPaciente}/{matriculaProfissional}/")
    public String inserirMedicamento (
        @PathParam("nome") String nome, 
        @PathParam("dataInicial") String dataInicial,
        @PathParam("dataFinal") String dataFinal, 
        @PathParam("intervaloHoras") int intevaloHoras, 
        @PathParam("id") String id,
        @PathParam("cpfPaciente") String cpfPaciente,
        @PathParam("matriculaProfissional") String matriculaProfissional){
        
        MedicamentoDAO.insert(new Medicamento(nome, dataInicial, dataFinal, 
                intevaloHoras, id, cpfPaciente, matriculaProfissional));
        return "succes3!";
    }
    
    
    // TESTE DELETE 
    @GET
    @Produces("application/text")
    @Path ("deleteConsulta/{id}")
    public String deleteConsulta (@PathParam("id") int id){
        ConsultaDAO.delete(id);
        return "succes!";
    }
    @GET
    @Produces("application/text")
    @Path ("deleteMedicamento/{id}")
    public String deleteMedicamento (@PathParam("id") int id){
        MedicamentoDAO.delete(id);
        return "succes!";
    }
    
    
    
    
    
    
    
    
    
    @GET
    @Produces("application/json")
    @Path("getMedicamentoAll")
    public String getMedicamentoAll (){
        ArrayList<Medicamento> lista = MedicamentoDAO.listaMedicamento();
        Gson gson = new Gson();
        return gson.toJson(lista);
    }
    
    @GET
    @Produces ("application/json")
    @Path("getConsultaAll")
    public String getConsultaAll (){
        ArrayList<Consulta> lista = ConsultaDAO.listaConsulta();
        Gson gson = new Gson();
        return gson.toJson(lista);
    }
    
    @GET
    @Produces("application/json")
    @Path("getEventoAll")
    public String getEventoAll() {
        ArrayList<Evento> lista = EventoDAO.listaEvento();
        Gson gson = new Gson();
        return gson.toJson(lista);
    }
    @GET
    @Produces("application/json")
    @Path("getExameAll")
    public String getExameAll() {
        ArrayList<Exame> lista = ExameDAO.listaExame();
        Gson gson = new Gson();
        return gson.toJson(lista);
    }

    @GET
    @Produces("application/json")
    @Path("getPacienteAll")
    public String getPacienteAll() {
        ArrayList<Paciente> lista = PacienteDAO.listaPaciente();
        Gson gson = new Gson();
        return gson.toJson(lista);
    }

    

    
   
    @GET
    @Produces("application/json")
    @Path("getMedicamento/{id}")
    public String getMedicamento (@PathParam("id") int id){
        Medicamento m = MedicamentoDAO.select(id);
        Gson gson = new Gson();
        return gson.toJson(m);
    }
    
    @GET
    @Produces("application/json")
    @Path("getConsulta/{id}")
    public String getConsulta (@PathParam("id") int id){
        Consulta c = ConsultaDAO.select(id);
        Gson gson = new Gson();
        return gson.toJson(c);
    }
    
    @GET
    @Produces("application/json")
    @Path("getExame/{id}")
    public String getExame(@PathParam("id") String id) {
        Exame e = ExameDAO.select(id);
        Gson gson = new Gson();
        return gson.toJson(e);
    }

    @GET
    @Produces("application/json")
    @Path("getEvento/{id}")
    public String getEvento(@PathParam("id") int id) {
        Evento e = EventoDAO.select(id);
        Gson gson = new Gson();
        return gson.toJson(e);
    }

    @GET
    @Produces("application/json")
    @Path("getPaciente/{cpf}")
    public String getPaciente(@PathParam("cpf") String cpf) {
        Paciente p = PacienteDAO.select(cpf);
        Gson gson = new Gson();
        return gson.toJson(p);
    }

}
