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


    }
    
}
