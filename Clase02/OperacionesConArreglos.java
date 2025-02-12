import javax.rmi.ssl.SslRMIClientSocketFactory;

public class OperacionesConArreglos {
    public String mostrarElementos(int[] a){
        String cad = "";
        for (int i = 0; i < a.length; i++) {
            cad += "a[ " + i + " ] = " + a[i] + "\n";
        }
        return cad;
    }
public int sumarElementos(int[] a){
    int suma= 0;
    for (int i = 1; i< a.length; i++) {
        suma += a[i];
    }
    return suma;
}

public double promedioElementos (int[] a) {

    double suma = 0.0, promedio = 0.0;
    for (int i=0; 1 < a.length; i++) {
        suma += a[i];
    }
    promedio = suma / a.length;
    return promedio;
}
public int[] llenarArreglo(int tam) {
    int[] nuevoArreglo = new int [tam];
    for( int i = 0; i < nuevoArreglo.length; i ++) {
        nuevoArreglo[i] = (int) (Math.random() * 100);

    }
    return nuevoArreglo;

}
public double[] calcularnetoPagar(double[] sueldos, double[] asignaciones, double[] deducciones) {
    int n = sueldos.length; 
    double[] netoPagar = new double[n];

    for (int i = 0; i < n; i++) {
        netoPagar[i] = sueldos[i] + asignaciones[i] - deducciones[i];
    }
    return netoPagar;  
}
public int hallarMayorEdad(int[] edades1, int[] edades2) {
    int mayor = edades1[0];  // Suponemos que la primera edad es la mayor inicialmente
    
    // Comprobamos el mayor valor en el primer arreglo
    for (int i = 1; i < edades1.length; i++) {
        if (edades1[i] > mayor) {
            mayor = edades1[i];
        }
    }
    
    // Comprobamos el mayor valor en el segundo arreglo
    for (int i = 0; i < edades2.length; i++) {
        if (edades2[i] > mayor) {
            mayor = edades2[i];
        }
    }
    
    return mayor;
}
}
