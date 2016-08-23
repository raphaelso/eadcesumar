
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
                    System.out.println("Você escolheu cadastrar um aluno(Opção: " + opcao + ")");
                    cadastro.aluno(entrada);
                    break;
                case 2:
                    System.out.println("Você escolheu cadastrar um professor(Opção: " + opcao + ")");
                    cadastro.professor(entrada);
                    break;
                case 0:
                    System.out.println("Você escolheu a sair do sistema(Opção: " + opcao + ")");
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
 
    public static void identificacao() {
        System.out.println("**************IDENTIFICAÇÃO**************");
        System.out.println(aluno.getNome() + " - " + aluno.getRa());
        System.out.println("*****************************************");
    }
    
}
