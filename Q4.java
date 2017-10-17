/* Crie um programa Java para verificar se o aluno foi aprovado (média maior ou igual
a 7,0), se vai fazer final (média maior ou igual a 5,0 e menor do que 7,0) ou se foi
reprovado (média abaixo de 5,0). O usuário deverá informar 4 notas */

import java.util.Scanner;

class Q4 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float nota1, nota2, nota3,nota4,media;
        int i, contAluno = 0;
        
        for(i = 0; i < 1; i++){
            
            contAluno++;
            
            System.out.println("Aluno " + contAluno + " digite sua 1ª nota: ");
            nota1 = ent.nextFloat();
            
            
            System.out.println("Aluno " + contAluno + " digite sua 2ª nota: ");
            nota2 = ent.nextFloat();
            
            
            System.out.println("Aluno " + contAluno + " digite sua 3ª nota: ");
            nota3 = ent.nextFloat();
	
	   
	    System.out.println("Aluno " + contAluno + " digite sua 3ª nota: ");
            nota4 = ent.nextFloat();
            

            
            
            media = (nota1 + nota2 + nota3+nota4) / 4;
            System.out.println("A média do aluno " + contAluno + " é " + media);
            
            
            if(media >= 7){
                System.out.println("Aprovado");
            } else if((media >= 5) && (media < 7)){
                System.out.println("Final");
            } else if(media < 5){
                System.out.println("Reprovado");
           }
        }       
    }
}