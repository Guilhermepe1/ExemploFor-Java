package br.senai.sp.jandira;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        boolean temFruta = false;
        String[] frutas = {"uva", "pera", "maçã", "banana"};

        /** Instancia teclado */
        Scanner teclado = new Scanner(System.in);

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("/-          Bem Vindo              -/");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        for (int i=0; i<frutas.length; i++) {
            System.out.println("Fruta: "+frutas[i]);
        }

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Qual fruta deseja comprar: ");
        String opcaoUsuario = teclado.nextLine();

        for (int i=0; i<frutas.length; i++) {

            if (opcaoUsuario.equals(frutas[i])) {
                System.out.println("Temos essa fruta.");
                temFruta = true;
            }
        }
        if (!temFruta) {
            System.out.println("Nâo temos essa fruta em estoque!");
        }











        //Exemplo while
//        while (!teste) {
//            System.out.println("Bom dia!");
//        }

        // Exemplo for
//        for (int i=10; i>=0; i--) {
//            System.out.println("Java é fácil!");
//        }

        // Exemplo do - while
//        do {
//            System.out.println("Java é Incrivel!");
//            teste = false;
//        } while (teste);
    }
}
