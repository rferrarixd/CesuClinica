package modelDatabase;
// Generated 11/04/2013 09:30:34 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Paciente generated by hbm2java
 */
public class Paciente  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private String profissao;
     private Boolean sexo;
     private Date dataNascimento;
     private String rg;
     private String cpf;
     private String cartaoSus;
     private String endereco;
     private String bairro;
     private String cidade;
     private String cep;
     private String telefone;
     private String celular;
     private String email;
     private String observacoes;

    public Paciente() {
    }

    public Paciente(String nome, String profissao, Boolean sexo, Date dataNascimento, String rg, String cpf, String cartaoSus, String endereco, String bairro, String cidade, String cep, String telefone, String celular, String email, String observacoes) {
       this.nome = nome;
       this.profissao = profissao;
       this.sexo = sexo;
       this.dataNascimento = dataNascimento;
       this.rg = rg;
       this.cpf = cpf;
       this.cartaoSus = cartaoSus;
       this.endereco = endereco;
       this.bairro = bairro;
       this.cidade = cidade;
       this.cep = cep;
       this.telefone = telefone;
       this.celular = celular;
       this.email = email;
       this.observacoes = observacoes;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public Boolean getSexo() {
        return this.sexo;
    }
    
    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCartaoSus() {
        return this.cartaoSus;
    }
    
    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getObservacoes() {
        return this.observacoes;
    }
    
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }




}


