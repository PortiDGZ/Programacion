package Proyecto;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    static Scanner entrada;
    static String[] tablero;
    static String turno;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        tablero = new String[9];
        turno = "X";
        String ganador = null;
        tablaVacia();

        System.out.println("Tres en raya");
        System.out.println("--------------------------------");
        printTablero();
        System.out.println("X empieza:");

        while (ganador == null) {
            int num;
            try {
                num = entrada.nextInt();
                if (!(num > 0 && num <= 9)) {
                    System.out.println("Casilla inválida, introduce una casilla válida:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Casilla inválida, introduce una casilla válida:");
                continue;
            } //Lanza error si el tipo de dato introducido no corresponde con el que se debe introducir
            if (tablero[num-1].equals(String.valueOf(num))) {
                tablero[num-1] = turno;
                if (turno.equals("X")) {
                    turno = "O";
                } else {
                    turno = "X";
                }
                printTablero();
                ganador = compruebaGanador();
            } else {
                System.out.println("Casilla inválida, introduce una casilla válida:");
                continue;
            }
        }
        if (ganador.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + ganador + "'s have won! Thanks for playing.");
        }
    }

    static String compruebaGanador() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = tablero[0] + tablero[1] + tablero[2];
                    break;
                case 1:
                    line = tablero[3] + tablero[4] + tablero[5];
                    break;
                case 2:
                    line = tablero[6] + tablero[7] + tablero[8];
                    break;
                case 3:
                    line = tablero[0] + tablero[3] + tablero[6];
                    break;
                case 4:
                    line = tablero[1] + tablero[4] + tablero[7];
                    break;
                case 5:
                    line = tablero[2] + tablero[5] + tablero[8];
                    break;
                case 6:
                    line = tablero[0] + tablero[4] + tablero[8];
                    break;
                case 7:
                    line = tablero[2] + tablero[4] + tablero[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(tablero).contains(String.valueOf(a+1))) {
                break;
            }
            else if (a == 8) return "draw";
        }

        System.out.println(turno + "'s turn; enter a slot number to place " + turno + " in:");
        return null;
    }

    static void printTablero() {
        System.out.println("/---|---|---\\");
        System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " |");
        System.out.println("/---|---|---\\");
    }

    static void tablaVacia() {
        for (int a = 0; a < 9; a++) {
            tablero[a] = String.valueOf(a+1);
        }
    }
}
