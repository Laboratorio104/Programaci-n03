package Clase02;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){

    OperacionesConArreglos op = new OperacionesConArreglos();
    
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < a.length; i++) {
            System.out.println(op.mostrarElementos(a));
            System.out.println("La suma del arreglo es: " + op.sumarElementos(a));
            System.out.println("Ele promedio del arreglo es: " + op.promedioElementos(a));

        }

    int n = 5;
    int[] b = op.llenarArreglo(n);
    System.out.println(op.mostrarElementos(b));

    int min = -10;
    int max = 20;
    int random = min + (int)(Math.random() * (max-min)+ 1);
    System.out.println("Numero generado entre " + min + " y " + max + ": " + random);



    double[] sueldos = {3000, 2500, 4000, 3500, 2800};
    double[] asignaciones = {500, 400, 600, 450, 550};
    double[] deducciones = {200, 150, 300, 250, 180}; 

   
    double[] netoPagar = op.calcularnetoPagar(sueldos, asignaciones, deducciones);{

    for (int i = 0; i < netoPagar.length; i++) {
        System.out.println("Neto a pagar de cada empleado" + "Empleado " + (i + 1) + ": " + netoPagar[i]);
     
    
    int[] edadesGrupo1 = {25, 30, 22, 28, 35};
    int[] edadesGrupo2 = {40, 45, 29, 50, 38};

    
    int mayorEdad = op.hallarMayorEdad(edadesGrupo1, edadesGrupo2);
    System.out.println("La mayor edad entre ambos grupos es: " + mayorEdad);

    String[] descripciones = {"Laptop", "Teléfono", "Tablet", "Monitor", "Teclado"};
    double[] precios = {1200.50, 500.75, 300.40, 200.00, 50.99};
    int[] cantidades = {2, 4, 3, 5, 10};

    
    double[] totalGastado = op.calcularTotalGastado( precios, cantidades);

    
    double totalGeneral = op.calcularTotalGeneral(totalGastado);
    System.out.println("Total general de todas las compras: " + totalGeneral);

    
    String productoMayor = op.productoMayorGasto(descripciones, totalGastado);
    System.out.println(productoMayor);
    }
    double[] alquileres = {1000, 1500, 2000, 1800, 2200};
    double[] porcentajes = {10, 12, 8, 15, 10}; 

    double[] ganancias = op.calcularGanancias(alquileres, porcentajes);

    System.out.println("Ganancias por vivienda:");
    for (int i = 0; i < ganancias.length; i++) {
        System.out.println("Vivienda " + (i + 1) + ": $" + ganancias[i]);
    }
    Scanner scanner = new Scanner(System.in);
    int[] A = {3, 8, 12, 7, 5, 10, 15, 20, 6, 1}; 

    int[] pares = op.obtenerPares(A);
    int[] impares = op.obtenerImpares(A);


    System.out.println("Números pares:");
    for (int num : pares) {
        System.out.print(num + " ");
    }

    System.out.println("\nNúmeros impares:");
    for (int num : impares) {
        System.out.print(num + " ");
    }
    int[] numeros = new int[30];

    System.out.println("Ingrese 30 números:");
    for (int i = 0; i < 30; i++) {
        numeros[i] = scanner.nextInt();
    }

    int mayor = op.encontrarMayor(numeros);
    int menor = op.encontrarMenor(numeros);

    int repeticionesMayor = op.contarRepeticiones(numeros, mayor);
    int repeticionesMenor = op.contarRepeticiones(numeros, menor);

    System.out.println("Número mayor: " + mayor + " (Repetido " + repeticionesMayor + " veces)");
    System.out.println("Número menor: " + menor + " (Repetido " + repeticionesMenor + " veces)");

    scanner.close();
}
    }
        }
    
    






