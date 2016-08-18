
import javax.swing.*;

public class usoArreglo {

    public static void main(String[] args) {
        Arreglo correr = new Arreglo();
        String [] opciones = {"Elije una opcion...", "Llenar el arreglo","Imprimir arreglo","Imprimir diagonal","Imprimir inversa" ,"Salir","Hacer las impresiones"};

        try {
            String opcion = ((String)JOptionPane.showInputDialog(null, "Elije una opción", "Menú", 1,null,opciones,opciones[0]));

          
            if (opcion==opciones[1]) {
                correr.llenarArreglo();
            }
            if (opcion==opciones[2]) {
                correr.impimirArreglo();
            }
            if (opcion==opciones[3]) {
                
                correr.impimirDiagonal();
            }
            if(opcion==opciones[4]){
                correr.imprimirInversa();
            }
            if (opcion==opciones[5]) {
                System.exit(0);
            }
            if(opcion==opciones[6]){
                 System.out.println("\tArreglo completo");
                correr.impimirArreglo();
                System.out.println("\n\n\n\tDiagonal del arreglo");
                correr.impimirDiagonal();
                System.out.println("\tInversa del arreglo");
                correr.imprimirInversa();
                System.out.println("");
            }
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Sólo acepta como dato un valor numérico", "Información", JOptionPane.ERROR_MESSAGE);
        }

    }

}
