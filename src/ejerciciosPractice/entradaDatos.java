package ejerciciosPractice;

import java.util.Scanner;

public class entradaDatos {
    public static void main(String[] args) {
        Scanner entradaD = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Ingresa un número: ");
        num1 = entradaD.nextInt();
        System.out.print("Ingresa el segundo número: ");
        num2 = entradaD.nextInt();
        int numg = num1 + num2;

        System.out.println("La suma de los números enteros es: " + numg);

        System.out.println("-----------------------------");

        //No es necesario crear otro Scanner, reutiliza el existente
        double num3;
        double num4;

        System.out.print("Ingresa un número decimal: ");
        num3 = entradaD.nextDouble(); // CORREGIDO: Usar el mismo Scanner (entradaD)
        System.out.print("Ingresa el segundo número decimal: ");
        num4 = entradaD.nextDouble(); // CORREGIDO: Usar el mismo Scanner
        double numg2 = num3 + num4;
        System.out.println("La suma de los números decimales es: " + numg2);

        // CORREGIDO: El segundo if dentro del primero era innecesario y nunca se iba a cumplir
        if (numg > numg2) {
            System.out.println("El número " + numg + " es mayor que " + numg2);
        } else if (numg < numg2) {
            System.out.println("El número " + numg2 + " es mayor que " + numg);
        } else {
            System.out.println("Ambos resultados son iguales.");
        }

        entradaD.close(); // CORREGIDO: Cerrar el Scanner al final
    }
}

