package ejerciciosPractice;

public class operadoresPlus {
    public static void main(String[] args) {
        int numero = 10;


        numero += 5;

        System.out.println(numero);

        numero -= 2;
        System.out.println(numero);

        numero *= 5;
        System.out.println(numero);

        numero /= 5;
        System.out.println(numero);

        numero %= 5;
        System.out.println(numero);

        System.out.println("----------------------");
        //OPERADOR DE INCREMENTO Y DECREMENTO
        int x = 5;


        x++; //autmenta 1

        System.out.println(x);

        int b = 10; //diminuye 1

        b--;
        System.out.println(b);

        int a = 20;
        int y;

        //y = --a; // si se poner el prefijo primero osea "--" entonces diminuira 1 no es lo mismo que a++
        //System.out.println(y);

        y = ++a;
        System.out.println(y);

    }
}
