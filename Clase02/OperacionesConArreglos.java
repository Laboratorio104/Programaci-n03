import javax.rmi.ssl.SslRMIClientSocketFactory;

public class OperacionesConArreglos {
    public String mostrarElementos(int[] a){
        String cad = "";
        for (int i = 0; i < a.length; i++) {
            cad += "a[ " + i + " ] = " + a[i] + "\n";
        }
        return cad;
    }
public int sumarElementos(int[] a) {
  int suma = 0;
  for ( int i = 0; i < a.length; i++); 
  suma += a[i];
}
  return suma;

}

public double promedioElementos (int[] a) {

    double sume = 0.0, promedio = 0.0;
    for (int i=0; 1 < a.length; i++) {
        suma += a[i];
    }
    promedio = suma / a.length;
    return promedio;
}
public int[] llenarArreglo(int[] a) {
    int[] a = new int [tam];
    for( int i = 0; i < a.length; i ++) {
        a[i] = (int) (Math.random() * 100);

    }
    retrun a;

}
}
