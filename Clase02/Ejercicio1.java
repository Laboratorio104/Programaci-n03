package Clase02;

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

    // a. Calcular total gastado por producto
    double[] totalGastado = op.calcularTotalGastado( precios, cantidades);

    // b. Calcular total general de todas las compras
    double totalGeneral = op.calcularTotalGeneral(totalGastado);
    System.out.println("Total general de todas las compras: " + totalGeneral);

    // c. Encontrar el producto con mayor gasto
    String productoMayor = op.productoMayorGasto(descripciones, totalGastado);
    System.out.println(productoMayor);
}
}
    }
}
    






