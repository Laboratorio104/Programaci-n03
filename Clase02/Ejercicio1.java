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
    
    /*
    int n = 5;
    int[] a = op.llenarArreglo(n);
    System.out.println(op.mostrarElementos(a));

    int min = -10;
    int max = 20;
    int random = min + (int)(Math.random() * (max-min)+ 1);
    System.out.println("Numero generado entre " + min + " y " + max + ": " + random);

/* 

    double[] sueldos = {3000, 2500, 4000, 3500, 2800};  // Ejemplo de sueldos
    double[] asignaciones = {500, 400, 600, 450, 550};  // Ejemplo de asignaciones
    double[] deducciones = {200, 150, 300, 250, 180};  // Ejemplo de deducciones

   
    double[] netoPagar = op.calcularnetoPagar(sueldos, asignaciones, deducciones);{

    for (int i = 0; i < netoPagar.length; i++) {
        System.out.println("Neto a pagar de cada empleado" + "Empleado " + (i + 1) + ": " + netoPagar[i]);
*/        
    
    int[] edadesGrupo1 = {25, 30, 22, 28, 35};
    int[] edadesGrupo2 = {40, 45, 29, 50, 38};

    // Hallamos la mayor edad entre los dos grupos
    int[] mayorEdad = op.hallarMayorEdad(edadesGrupo1, edadesGrupo2);
    
    System.out.println("La mayor edad entre ambos grupos es: " + mayorEdad);
}
}
    






