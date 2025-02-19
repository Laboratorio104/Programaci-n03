package Clase03;

import java.util.Scanner;

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


                    int[][] tabla = new int[10][10];

                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            tabla[i][j] = (i + 1) * (j + 1);
                        }
                    }
            
                    System.out.println("Tabla de multiplicar del 1 al 10:");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.printf("%4d", tabla[i][j]);
                        }
                    
                        System.out.println();
                    }
                }
                    {
                
                     Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el número de filas (n): ");
                int n = scanner.nextInt();
                System.out.print("Ingrese el número de columnas (m): ");
                int m = scanner.nextInt();
                
                int[][] matriz = new int[n][m];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (i == j) { 
                            matriz[i][j] = 1;
                        } else {
                            matriz[i][j] = 0;
                        }
                    }
                }

                System.out.println("Matriz generada:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
                
                scanner.close();
    }
        
                 }
                


    
    

