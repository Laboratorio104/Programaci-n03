package Clase02;
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
    for (int i = 0; i< a.length; i++) {
        suma += a[i];
    }
    return suma;
}

public double promedioElementos (int[] a) {

    double suma = 0.0, promedio = 0.0;
    for (int i=0; i < a.length; i++) {
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
    int mayor = edades1[0]; 
    
    
    for (int i = 1; i < edades1.length; i++) {
        if (edades1[i] > mayor) {
            mayor = edades1[i];
        }
    }
    
  
    for (int i = 0; i < edades2.length; i++) {
        if (edades2[i] > mayor) {
            mayor = edades2[i];
        }
    }
    
    return mayor;
}
public double[] calcularTotalGastado(double[] precios, int[] cantidades) {
    int n = precios.length;
    double[] totalGastado = new double[n];

    for (int i = 0; i < n; i++) {
        totalGastado[i] = precios[i] * cantidades[i];
    }
    return totalGastado;
}

public double calcularTotalGeneral(double[] totalGastado) {
    double totalGeneral = 0;
    for (double gasto : totalGastado) {
        totalGeneral += gasto;
    }
    return totalGeneral;
}
public String productoMayorGasto(String[] descripciones, double[] totalGastado) {
    if (descripciones.length == 0 || totalGastado.length == 0) {
        return "No hay productos registrados.";
    }

    int indiceMayor = 0;
    double mayorGasto = totalGastado[0];

    for (int i = 1; i < totalGastado.length; i++) {
        if (totalGastado[i] > mayorGasto) {
            mayorGasto = totalGastado[i];
            indiceMayor = i;
        }
    }

    return "Producto con mayor gasto: " + descripciones[indiceMayor] + " - Total gastado: " + mayorGasto;
}
public double[] calcularGanancias(double[] alquileres, double[] porcentajes) {
    int n = alquileres.length;
    double[] ganancias = new double[n];

    for (int i = 0; i < n; i++) {
        ganancias[i] = alquileres[i] * (porcentajes[i] / 100);
    }
    return ganancias;
}
public int[] obtenerPares(int[] arreglo) {
    int countPares = 0;

    
    for (int num : arreglo) {
        if (num % 2 == 0) {
            countPares++;
        }
    }

    int[] pares = new int[countPares];
    int index = 0;
    
    for (int num : arreglo) {
        if (num % 2 == 0) {
            pares[index++] = num;
        }
    }

    return pares;
}

public int[] obtenerImpares(int[] arreglo) {
    int countImpares = 0;

    
    for (int num : arreglo) {
        if (num % 2 != 0) {
            countImpares++;
        }
    }

    int[] impares = new int[countImpares];
    int index = 0;

    for (int num : arreglo) {
        if (num % 2 != 0) {
            impares[index++] = num;
        }
    }

    return impares;
}
public int encontrarMayor(int[] numeros) {
    int mayor = numeros[0];

    for (int num : numeros) {
        if (num > mayor) {
            mayor = num;
        }
    }

    return mayor;
}

public int encontrarMenor(int[] numeros) {
    int menor = numeros[0];

    for (int num : numeros) {
        if (num < menor) {
            menor = num;
        }
    }

    return menor;
}

public int contarRepeticiones(int[] numeros, int valor) {
    int contador = 0;

    for (int num : numeros) {
        if (num == valor) {
            contador++;
        }
    }

    return contador;
}
public int contarNumeroEnArreglo(int[] arreglo, int numero) {
    int contador = 0;

    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] == numero) {
            contador++;
        }
    }

    return contador;
}
}

