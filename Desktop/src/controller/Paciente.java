package controller;

import java.util.ArrayList;

public class Paciente {

    // atributos da classe Paciente
    private String sexo, etinia, senha;
    private String estadoCivil, rg, orgaoEmissor;
    private String dataExpedicao, uf, observacoes;
    private String nomePai, nomeMae, nome;
    private String sus, fotoPerfil, nacionalidade;
    private String naturalidade, nascimento, cpf;

    // para os telefones do usuário
    public static ArrayList<String> telefones = new ArrayList<>();
    
    
    public Paciente(String sexo, String etinia, String senha, 
            String estadoCivil, String rg, String orgaoEmissor, 
            String dataExpedicao, String uf, String observacoes, 
            String nomePai, String nomeMae, String nome, String sus, 
            String fotoPerfil, String nacionalidade, String naturalidade, 
            String nascimento, String cpf) {
        
        this.sexo = sexo;
        this.etinia = etinia;
        this.senha = senha;
        this.estadoCivil = estadoCivil;
        this.rg = rg;
        this.orgaoEmissor = orgaoEmissor;
        this.dataExpedicao = dataExpedicao;
        this.uf = uf;
        this.observacoes = observacoes;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.nome = nome;
        this.sus = sus;
        this.fotoPerfil = fotoPerfil;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEtinia() {
        return etinia;
    }

    public void setEtinia(String etinia) {
        this.etinia = etinia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(String dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSus() {
        return sus;
    }

    public void setSus(String sus) {
        this.sus = sus;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static ArrayList<String> getTelefones() {
        return telefones;
    }

    public static void setTelefones(ArrayList<String> telefones) {
        Paciente.telefones = telefones;
    }
    
    
            
    



}