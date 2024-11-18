package main;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("*** GERENCIADOR CONSULTÓRIO MÉDICO: *** \n" +
                    "1 - CADASTRAR MÉDICO \n" +
                    "2 - CADASTRAR PACIENTE \n" +
                    "3 - AGENDAR CONSULTA \n" +
                    "4 - ATUALIZAR CONSULTA \n" +
                    "5 - REMOVER CONSULTA \n" +
                    "6 -  \n" +
                    "7 - SAIR");
            int op = sc.nextInt();

            switch (op) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:
                    break;
            }

        } while (true);

    }
}