package ejerciciosPractice;

import java.util.Scanner;

public class entradaDatos2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingresa el numero: ");
        numero = entrada.nextInt();
        System.out.println("el numero es: "+numero);

        char letra;
        System.out.print("Ingresa una letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("Tu letra es: "+letra);

        entrada.nextLine(); //se usa para limpiar lo de arriba si no no funciona

        String cadena;

        System.out.println("Ingresa una cadena de texto: ");
        cadena = entrada.nextLine();
        System.out.println("Tu cadena de texto es: "+cadena);

        double miDouble;
        System.out.println("Ingresa un decimal: ");
        miDouble = entrada.nextDouble();
        System.out.println("tu double es: "+miDouble);

    }
}
