package com.cadastros.mapa;

import static com.cadastros.mapa.Principal.aluno;
import java.util.Scanner;

public class Cadastro {
    
    public void aluno(Scanner entrada) {
        
        System.out.println("\n************CADASTRO DE ALUNO************");
        
        System.out.println("Digite o nome: ");
        aluno.setNome(entrada.nextLine());
                
        System.out.println("Digite a idade: ");
        aluno.setIdade(entrada.nextInt());
        while (aluno.getIdade() < 18) {
            System.out.println("Não é permitido cadastro de alunos menores de 18 anos \n"
                            + "Entre com uma idade válida: ");
            aluno.setIdade(entrada.nextInt());
        }
        entrada.nextLine();
        
        System.out.println("Digite o gênero(M - Masculino ou F - Feminino): ");
        aluno.setGenero(entrada.next().charAt(0));
        entrada.nextLine();
        
        System.out.println("Digite o telefone: ");
        aluno.setTelefone(entrada.nextLine());
        
        System.out.println("Digite o endereço: ");
        aluno.setEndereco(entrada.nextLine());
        
        System.out.println("Digite o CPF: ");
        aluno.setCpf(entrada.nextLine());        
        
        System.out.println("Digite o RG: ");
        aluno.setRg(entrada.nextLine());
        
        System.out.println("Digite o bairro: ");
        aluno.setBairro(entrada.nextLine());
        
        System.out.println("Digite o cidade: ");
        aluno.setCidade(entrada.nextLine());
        
        System.out.println("Digite o estado: ");
        aluno.setUf(entrada.nextLine());
        
        System.out.println("Digite o RA: ");
        aluno.setRa(entrada.nextLine());
        
        System.out.println("Digite o curso: ");
        aluno.setCurso(entrada.nextLine());
        
        System.out.println("\n*****************************************");
        
        
        System.out.println("\n**************IMPRESSÃO DE DADOS DO ALUNO***************");
        System.out.println(aluno.toString());
        System.out.println("**********************************************************\n");
        
        Principal.identificacao();
    }
        
    public void professor(Scanner entrada) {
        Professor professor = new Professor();
        
        System.out.println("\n************CADASTRO DE PROFESSOR************");
        
        System.out.println("Digite o nome: ");
        professor.setNome(entrada.nextLine());
        
        System.out.println("Digite a idade: ");
        professor.setIdade(entrada.nextInt());
        while (professor.getIdade() < 21) {
            System.out.println("Não é permitido cadastro de professores menores de 21 anos \n"
                            + "Entre com uma idade válida: ");
            professor.setIdade(entrada.nextInt());
        }
        entrada.nextLine();
        
        System.out.println("Digite o gênero(M - Masculino ou F - Feminino): ");
        professor.setGenero(entrada.next().charAt(0));
        entrada.nextLine();
        
        System.out.println("Digite o telefone: ");
        professor.setTelefone(entrada.nextLine());
        
        System.out.println("Digite o endereço: ");
        professor.setEndereco(entrada.nextLine());
        
        System.out.println("Digite o CPF: ");
        professor.setCpf(entrada.nextLine());        
        
        System.out.println("Digite o RG: ");
        professor.setRg(entrada.nextLine());
        
        System.out.println("Digite o bairro: ");
        professor.setBairro(entrada.nextLine());
        
        System.out.println("Digite o cidade: ");
        professor.setCidade(entrada.nextLine());
        
        System.out.println("Digite o estado: ");
        professor.setUf(entrada.nextLine());
        
        System.out.println("Digite o RP: ");
        professor.setRp(entrada.nextLine());
        
        System.out.println("Digite a disciplina ministrada: ");
        professor.setDisciplinaMinistrada(entrada.nextLine());
        
        System.out.println("Digite o salário: ");
        professor.setSalario(entrada.nextDouble());
        
        System.out.println("\n*********************************************");
        
        System.out.println("\n**************IMPRESSÃO DE DADOS DO PROFESSOR***************");
        System.out.println(professor.toString());
        System.out.println("**************************************************************\n");
    }
}
