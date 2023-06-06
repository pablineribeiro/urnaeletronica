/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class UrnaEletronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner= new Scanner(System.in);
        final int candidato1= 77123;//Pedro
        final int candidato2= 90321;//Maria
        final int candidato3=12345;//João
        
        int votosCandidato1=0;
        int votosCandidato2=0;
        int votosCandidato3=0;
       // String statusConfirmacao;
        
        int voto=0;
         //A urna eletronica apresenta três possíveis candidatos
        //com um numero correspondendo a cada candidato
        
        do{ 
            System.out.println("=====Eleições 2023 ======"
                    + "\nEscolha o numero do seu candidato:"
                    + "\n77123 Pedro\n90321 Maria"
                    + "\n12345 Joao\n");
               
        //o programa apresenta um campo de entrada de dados para
        //que digite a escolha do canditato
        
        
               
             voto=scanner.nextInt();//após, deve solicitar um novo voto
        //Ao digitar o numero escolhido pelo usuario, o programa irá somar um
        //voto para o candidato escolhido
        //o programa deve exibir ao usuario uma mensagem que o
        //voto foi computado com sucesso
            if(voto==77123){
                votosCandidato1=votosCandidato1+1;
                System.out.println("Você votou em Pedro\nSeu Voto foi Computado!\n");
                // String statusConfirmacao=scanner.next();
                //string statusConfirmacao=equals("s");
            }else if(voto==90321){
            votosCandidato2=votosCandidato2+1;
                System.out.println("Você votou em Maria\nSeu Voto foi Computado!\n");
            }else if (voto==12345){
                votosCandidato3=votosCandidato3+3;
                System.out.println("Votou em João\nSeu Voto foi Computado!\n");
            }else{
                if(voto!=00000)
                System.out.println("Invalido!");}        
        //quando o mesário digitar a senha secreta, o programa
        //irá parar de disponibilizar votos
          }while(voto!=00000); 
        //Logo após parar de disponiblizar votos, o programa deve exibir
        //a quantidade de votos para cada candidato
        System.out.println("Votação Encerrada!"
                + "\nVotos:"
                + "\nPedro:"+votosCandidato1
                + "\nMaria:"+votosCandidato2
                +"\nJoão:"+votosCandidato3);
      
    }
    
}
