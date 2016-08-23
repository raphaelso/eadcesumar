package com.cadastros.mapa;

public class Aluno extends Pessoa {
    
    private String ra;
    private String curso;
    
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso.toUpperCase();
    }

    @Override
    public String toString() {
        String aluno = "RA: " + getRa() + "\n"
                     + "Curso: " + getCurso();
        return String.valueOf(super.toString() + aluno.toString());
    }

    
}
