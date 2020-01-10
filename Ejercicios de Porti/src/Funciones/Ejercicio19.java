import javax.swing.*;

public class Ejercicio19 {

    public static void main(String[] args){



        String alto = JOptionPane.showInputDialog("Introduce el alto: ");
        int altoint = Integer.parseInt(alto);
        String ancho = JOptionPane.showInputDialog("Introduce el ancho: ");
        int anchoint = Integer.parseInt(ancho);
        int x = (int)((Math.random()*(anchoint-1))+1);
        int y = (int)((Math.random()*(altoint-1))+1);
        for (int ver = 0; ver < altoint; ver++){
            for (int hor = 0; hor < anchoint; hor++){
                if ((hor == 0) || (hor == anchoint-1) || (ver == 0) || (ver == altoint-1)){
                    System.out.print("* ");
                } else if ((hor == x) && (ver == y)){
                    System.out.print("&");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}