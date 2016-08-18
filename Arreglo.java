
import javax.swing.JOptionPane;

public class Arreglo {

    int[][] tabla = new int[5][5];

    public Arreglo() {
        tabla[0][0] = 0;
        tabla[0][1] = 1;
        tabla[0][2] = 2;
        tabla[0][3] = 3;
        tabla[0][4] = 4;

        tabla[1][0] = 5;
        tabla[1][1] = 6;
        tabla[1][2] = 7;
        tabla[1][3] = 8;
        tabla[1][4] = 9;

        tabla[2][0] = 10;
        tabla[2][1] = 11;
        tabla[2][2] = 12;
        tabla[2][3] = 13;
        tabla[2][4] = 14;

        tabla[3][0] = 15;
        tabla[3][1] = 16;
        tabla[3][2] = 17;
        tabla[3][3] = 18;
        tabla[3][4] = 19;

        tabla[4][0] = 20;
        tabla[4][1] = 21;
        tabla[4][2] = 22;
        tabla[4][3] = 23;
        tabla[4][4] = 24;
    }

    public void llenarArreglo() {

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un valor para la posición del Arreglo[" + i + "]" + "[" + j + "]" + " del arreglo", "Introduce dato", JOptionPane.INFORMATION_MESSAGE));
            }

        }
    }

    public void impimirArreglo() {

        for (int i = 0; i < tabla.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < tabla.length; j++) {

                System.out.print(tabla[i][j] + " \t");

            }

        }

    }

    public void impimirDiagonal() {
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(" \n");
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(" \t");
                if (i == j) {
                    System.out.print(tabla[i][j] + "\t");
                }

            }

        }
        System.out.println("");

    }

    public void imprimirInversa() {

        for (int i = 4; i >= 0; i--) {
             System.out.print("\n");
            for (int j = 4; j >= 0; j--) {
                System.out.print(tabla[i][j]+"\t");
            }
        }
    }
}