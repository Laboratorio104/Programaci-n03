package Clase03;

public class EjemploMatrices {
    public static void main (String[] args){
        int[][] m = {{9, 3, 5}, 
                     {1, 4, 2},
                    {8, 7, 6}};
                 for (int i = 0; i < m.length; i++){
                    for (int j = 0; j < m.length; j++){
                        System.out.println("m[" + i + "][" + j + "]=" + m[i][j]);

                    }
                 }
                    System.out.println("\nSuma de cada fila:");
                    for (int i = 0; i < m.length; i++) {
                        int sumaFila = 0;
                        for (int j = 0; j < m[i].length; j++) {
                            sumaFila += m[i][j];
                        }
                        System.out.println("Fila " + i + ": " + sumaFila);
                    }
                    
                
                    System.out.println("\nSuma de cada Columna:");
                    for (int j = 0; j < m.length; j++) {
                        int sumaColumnas = 0;
                        for (int i = 0; i < m[j].length; i++) {
                            sumaColumnas += m[i][j];
                        }
                        System.out.println("Columna " + j + ": " + sumaColumnas);
                    }
        
                 }


    }
    

