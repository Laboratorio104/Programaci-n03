package Clase02;

public class Ejercicio1 {
    public static void main(String args){

    OperacionesConArreglos op = new OperacionesConArreglos();
    /* 
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < a.length; i++) {
            System.out.println(op.mostrarElementos(a));
            System.out.println("La suma del arreglo es: " + op.sumarElementos(a));
            System.out.println("Ele promedio del arreglo es: " + op.promedioElementos(a));

        }
    
    */
    int n = 5;
    int[] a = op.llenarArregloAleatorios(n);
    System.out.println(op.mostrarElementos(a));

    int min = -10;
    int max = 20;
    int random = min + (int)(Math.random() * (max-min)+ 1));
    System.out.println("Numero generado entre " + min + " y " + max + ": " + randomNum);


    }
}
