public String nombresSueldos (String[] n, int[] s){
    int suma = 0;

    for (int i = 0; i< s.length; i++){
        suma += s[i];
    }
    double promedio = suma/s.length; 
    String cad="";
    for(int i = 0; i < s.length; i++){
        if (s[i]>=promedio){
            cad += n[i]+"\n";
            con ++;
        }
    }
    cad += "Fueron: " +  contador  + "Los empleados ";

    return cad;
}