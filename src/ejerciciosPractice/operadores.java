package ejerciciosPractice;

import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1, num2, suma, resta, multi, div, residuo;

        System.out.println("Ingrese 2 numeros porfavor: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        residuo = num1 % num2;

        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multi);
        System.out.println("El resultado de la division es: "+div);
        System.out.println("El residuo es: "+residuo);

    }
}
