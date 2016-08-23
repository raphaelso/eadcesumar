
package com.cadastros.mapa;

import java.util.Scanner;

public class Principal {
        
    static Aluno aluno = new Aluno();
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        
        int opcao;
                                        
        do {            
            menu();
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcao) {
                case 1:
                    cadastro.aluno(entrada);
                    //cadastraAluno();
                    break;
                case 2:
                    cadastro.professor(entrada);
                    //cadastraProfessor();
                    break;
                case 0:
                    break;
                default:
                    if (opcao != 0) {
                        System.out.println("\nOpção digitada é inválida!\nDigite uma das opções do menu.\n");
                    }
            }
            
        } while (opcao != 0);
        
    }

    private static void menu() {
        System.out.println("\n************MENU DE CADASTRO************");
        System.out.println("Digite o número da opção desejada: ");
        System.out.println("1 - Inserir um Aluno");
        System.out.println("2 - Inserir um Professor");
        System.out.println("0 - Sair");
    }
    
 /*   private static void cadastraAluno() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n************CADASTRO DE ALUNO************");
        
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(entrada.nextLine());
        
        System.out.println("Digite a idade do aluno: ");
        aluno.setIdade(Integer.parseInt(entrada.nextLine()));
        while (aluno.getIdade() < 18) {
            System.out.println("Não é permitido cadastro de alunos menores de 18 anos \n"
                            + "Entre com uma idade válida: ");
            aluno.setIdade(Integer.parseInt(entrada.nextLine()));
        }
        
        System.out.println("Digite o gênero do aluno(M ou F): ");
        char[]genero = entrada.nextLine().toCharArray();
        aluno.setGenero(genero[0]);
        
        System.out.println("Digite o telefone do aluno: ");
        aluno.setTelefone(entrada.nextLine());
        
        System.out.println("Digite o endereço do aluno: ");
        aluno.setEndereco(entrada.nextLine());
        
        System.out.println("Digite o CPF do aluno: ");
        aluno.setCpf(entrada.nextLine());        
        
        System.out.println("Digite o RG do aluno: ");
        aluno.setRg(entrada.nextLine());
        
        System.out.println("Digite o bairro do aluno: ");
        aluno.setBairro(entrada.nextLine());
        
        System.out.println("Digite o cidade do aluno: ");
        aluno.setCidade(entrada.nextLine());
        
        System.out.println("Digite o estado do aluno: ");
        aluno.setUf(entrada.nextLine());
        
        System.out.println("Digite o RA do aluno: ");
        aluno.setRa(entrada.nextLine());
        
        System.out.println("Digite o curso do aluno: ");
        aluno.setCurso(entrada.nextLine());
        
        System.out.println("\n**************IMPRESSÃO DE DADOS DO ALUNO***************");
        System.out.println(aluno.toString());
        System.out.println("************FIM DA IMPRESSÃO DE DADOS DO ALUNO************\n");
        
        identificacao();
        
    }
    
    private static void cadastraProfessor() {
        Professor professor = new Professor();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n************CADASTRO DE PROFESSOR************");
        System.out.println("Digite o nome do professor: ");
        professor.setNome(entrada.nextLine());
        
        System.out.println("Digite a idade do professor: ");
        professor.setIdade(entrada.nextInt());
        while (professor.getIdade() < 21) {
            System.out.println("Não é permitido cadastro de professores menores de 21 anos \n"
                            + "Entre com uma idade válida: ");
            professor.setIdade(entrada.nextInt());
        }
        
        System.out.println("Digite o gênero do professor(M ou F): ");
        professor.setGenero(entrada.next().charAt(0));
        
        System.out.println("Digite o telefone do professor: ");
        professor.setTelefone(entrada.nextLine());
        
        System.out.println("Digite o endereço do professor: ");
        professor.setEndereco(entrada.nextLine());
        
        System.out.println("Digite o CPF do professor: ");
        professor.setCpf(entrada.nextLine());        
        
        System.out.println("Digite o RG do professor: ");
        professor.setRg(entrada.nextLine());
        
        System.out.println("Digite o bairro do professor: ");
        professor.setBairro(entrada.nextLine());
        
        System.out.println("Digite o cidade do professor: ");
        professor.setCidade(entrada.nextLine());
        
        System.out.println("Digite o estado do professor: ");
        professor.setUf(entrada.nextLine());
        
        System.out.println("Digite o RP do professor: ");
        professor.setRp(entrada.nextLine());
        
        System.out.println("Digite a disciplina ministrada do professor: ");
        professor.setDisciplinaMinistrada(entrada.nextLine());
        
        System.out.println("Digite o salário do professor: ");
        professor.setSalario(entrada.nextDouble());
        
        System.out.println("\n**************IMPRESSÃO DE DADOS DO PROFESSOR***************");
        System.out.println(professor.toString());
        System.out.println("************FIM DA IMPRESSÃO DE DADOS DO PROFESSOR************\n");
    }*/
    
    public static void identificacao() {
        System.out.println("**************IDENTIFICAÇÃO**************");
        System.out.println(aluno.getNome() + " - " + aluno.getRa());
        System.out.println("*****************************************");
    }
    
}
