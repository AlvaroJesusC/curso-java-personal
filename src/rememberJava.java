public class rememberJava {
    public static void main(String[] args) {

     int num1 = 1;
     int num2 = 2;
     System.out.println(num1+num2);
     double num3 = 3.12;
     boolean miBoolean = true;
     float mifloat = 3.0158f;
    char michar = 'A';
    byte miByte = 1; //solo recibe hasta 127 no es muy usado
    Long milong = 10277788944L;
/*
Elige los tipos adecuados: Utiliza el tipo de datos más adecuado a tus necesidades para optimizar el rendimiento y el uso de memoria.
Por defecto int: Utiliza int para cálculos con números enteros, a menos que haya una necesidad específica de otros tipos de números enteros.
Utiliza doble para Precisión: Prefiere double para los valores decimales, a menos que las limitaciones de memoria dicten lo contrario.
Booleano para Condiciones: Utiliza siempre boolean para los indicadores y las condiciones, a fin de mejorar la legibilidad del código.
Prefiere tipos de referencia para mayor flexibilidad: Utiliza tipos de referencia cuando necesites la flexibilidad de los métodos y las propiedades.
 */
        System.out.println(num3);
        System.out.println(miBoolean);
        System.out.println(mifloat);
        System.out.println(michar);
        System.out.println(miByte);
        System.out.println(milong);


        final int numero = 25;
        // numero = 28;
        System.out.println(numero);

        //asignacion
         num1 += 5;
        System.out.println(num1);
    }
}
