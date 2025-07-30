package ejerciciosPractice;

import javax.swing.JOptionPane;

public class entradaDatospart3 {
    public static void main(String[] args) {
        String texto;
        int numero;
        double miDouble;
        char letra;


        texto = JOptionPane.showInputDialog("Inserta una cadena de texto: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entero: "));
        miDouble = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero decimal: "));
        letra = JOptionPane.showInputDialog("Ingresa una letra: ").charAt(0);

        JOptionPane.showMessageDialog(null, "La cadena es: "+texto);
        JOptionPane.showMessageDialog(null, "El numero ingresado es: "+numero);
        JOptionPane.showMessageDialog(null, "Tu numero decimal es: "+miDouble);
        JOptionPane.showMessageDialog(null, "Tu letra es: "+letra);


    }
}
