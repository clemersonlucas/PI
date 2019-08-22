package controller;

import java.util.ArrayList;
import java.util.Objects;


    /*   OBSERVAÇÕES:
     *   O NÚMERO DO PRONTUÁRIO SERÁ DESCARTADO PARA QUE TÃO SOMENTE O CPF 
     *   JA SEJA O SUFICIENTE COMO CHAVE PRIMÁRIA
     */
    
public class Paciente {
    
    // ATRIBUTOS DO PACIENTE    
    private String cpf, senha;            // NOSSA CHAVE PRIMÁRIA SERÁ O CPF
    private String nome, sexo, etnia;
    private String rg, dataEmissao, uf, orgaoEmissor;
    private String estadoCivil, anotacoes; 
    private String nomePai, nomeMae, nomeResponsavel, grauParentesco;
    private String sus, foto, nacionalidade, naturalidade, dataNasciento;
    
    // PARA ARMAZENAR TODOS OS TELEFONES DO USUÁRIO
    private ArrayList<String> telefones;
    
    
    // VAMOS DEIXAR A CRIAÇÃO DE PACIENTE PRIVADAS SEM AS INFORMAÇÕES NECESSÁRIAS
    public Paciente (){}    
    
    /*   OBSERVAÇÕES:
     *   HAVERA UM MÉTODO CONSTRUTOR PARA O PACIENTE DE MENOR
     *   E UM SEGUNDO PARA QUE NÃO HAJA A NECESSIDADE DE RESPONSÁVEL
     */

    public Paciente(String cpf, String senha, String nome, String sexo, 
            String etnia, String rg, String dataEmissao, String uf, String orgaoEmissor, 
            String estadoCivil, String anotacoes, String nomePai, String nomeMae, 
            String sus, String foto, String nacionalidade, String naturalidade, 
            String dataNasciento, ArrayList<String> telefones) {
       
        this.cpf = cpf;                       // NOSSA CHAVE PRIMÁRIA SERÁ O CPF
        this.senha = senha;
        this.nome = nome;
        this.sexo = sexo;
        this.etnia = etnia;
        this.rg = rg;
        this.dataEmissao = dataEmissao;
        this.uf = uf;
        this.orgaoEmissor = orgaoEmissor;
        this.estadoCivil = estadoCivil;
        this.anotacoes = anotacoes;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.sus = sus;
        this.foto = foto;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.dataNasciento = dataNasciento;
        this.telefones = telefones;
    }
    

    // CASO O PACIENTE SEJA DE MENOR
    public Paciente(String cpf, String senha, String nome, String sexo, 
            String etnia, String rg, String dataEmissao, String uf, 
            String orgaoEmissor, String estadoCivil, String anotacoes, 
            String nomePai, String nomeMae, String nomeResponsavel, 
            String grauParentesco, String sus, String foto, String nacionalidade, 
            String naturalidade, String dataNasciento, ArrayList<String> telefones) {
        
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.sexo = sexo;
        this.etnia = etnia;
        this.rg = rg;
        this.dataEmissao = dataEmissao;
        this.uf = uf;
        this.orgaoEmissor = orgaoEmissor;
        this.estadoCivil = estadoCivil;
        this.anotacoes = anotacoes;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.nomeResponsavel = nomeResponsavel;
        this.grauParentesco = grauParentesco;
        this.sus = sus;
        this.foto = foto;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.dataNasciento = dataNasciento;
        this.telefones = telefones;
    }

    
    // MÉTODOS GETTERS E SETTERS PARA A CLASSE PACIENTE

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEtnia() {
        return etnia;
    }
    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }
    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getAnotacoes() {
        return anotacoes;
    }
    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
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
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
    public String getGrauParentesco() {
        return grauParentesco;
    }
    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }
    public String getSus() {
        return sus;
    }
    public void setSus(String sus) {
        this.sus = sus;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNaturalidade() {
        return naturalidade;
    }
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    public String getDataNasciento() {
        return dataNasciento;
    }
    public void setDataNasciento(String dataNasciento) {
        this.dataNasciento = dataNasciento;
    }
    public ArrayList<String> getTelefones() {
        return telefones;
    }
    public void setTelefones(ArrayList<String> telefones) {
        this.telefones = telefones;
    }
    
    
    // VAMOS MODIFICAR O METODO EQUALS PARA A CLASSE FAZER A COMPARAÇÃO
    // APENAS DOS ATRIBUTOS SENHA E CPF PARA USAR PARA LOGAR
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
}
