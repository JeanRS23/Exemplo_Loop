package br.senai.sp.jandira;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        String[] carros = {"x1", "fusca", "ferrari", "uno"};

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("------- Bem Vindo --------");
        System.out.println("--------------------------");
        System.out.println("Escolha seu Carro: ");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/");


        for (int i = 0; i < carros.length; i++) {

            System.out.println("Carro" + (i + 1) + ":" + carros[i]);
        }


        String opcaoUsuario = teclado.nextLine();

        boolean validaCar = false;


        for (int i=0; i<carros.length; i++){
            if (opcaoUsuario.equalsIgnoreCase(carros[i])){
                System.out.println("Este veiculo está disponivel");
                validaCar = true;
            }
        }

        if (!validaCar){
            System.out.println("Infelizmente este veiculo não está disponivel! ");
        }





//        for (int i=10; i>0;1--){
//            System.out.println("Java destroi sonhos");
//        }


        // Exemplo Loop doWhile

//        boolean testeDo = false;

//        do {
//            System.out.println("Amo o Senai Jandira!");
//        }    while (testeDo);


        // Exemplo While
//        boolean testeWhile = true;

//        while (testeWhile) {
//            System.out.println("Java é incrivel!");
//            testeWhile = false;
//          }


        // Exemplo For
//        for (int i=0; i<10; i++){
//            System.out.println("Java é top!");
//          }


    }
}
