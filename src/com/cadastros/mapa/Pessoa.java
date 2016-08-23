/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadastros.mapa;

/**
 *
 * @author raphael
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private char genero;
    private String telefone;
    private String endereco;
    private String cpf;
    private String rg;
    private String bairro;
    private String cidade;
    private String uf;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = Character.toUpperCase(genero);
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone.toUpperCase();
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco.toUpperCase();
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf.toUpperCase();
    }
    
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg.toUpperCase();
    }
    
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro.toUpperCase();
    }
    
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade.toUpperCase();
    }
    
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf.toUpperCase();
    }

    @Override
    public String toString() {
        String pessoa = "Nome: " + getNome() + "\n"
                       + "Idade: " + getIdade() + "\n"
                       + "Gênero: " + getGenero() + "\n"
                       + "Telefone: " + getTelefone() + "\n"
                       + "Endereço: " + getEndereco() + "\n"
                       + "CPF: " + getCpf() + "\n"
                       + "RG: " + getRg() + "\n"
                       + "Bairro: " + getBairro() + "\n"
                       + "Cidade: " + getCidade() + "\n"
                       + "UF: " + getUf() + "\n";

        return pessoa.toString();
    }
    
    
    
}
