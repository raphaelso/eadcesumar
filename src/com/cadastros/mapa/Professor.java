package com.cadastros.mapa;

public class Professor extends Pessoa {
 
    private String rp;
    private String disciplinaMinistrada;
    private double salario;
 
    public String getRp() {
        return rp;
    }
    public void setRp(String rp) {
        this.rp = rp;
    }
    
    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }
    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada.toUpperCase();
    }
    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String professor = "RP: " + getRg() + "\n"
                         + "Disciplina: " + getDisciplinaMinistrada() + "\n"
                         + "Salário: " + getSalario();
        
        return String.valueOf(super.toString() + professor.toString());
    }
    
    
}
