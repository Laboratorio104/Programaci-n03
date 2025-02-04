public class Ejecutar {

    public static void main (String[] args) {
        System.out.println("Hola mundo UNIAJC");

        int[] a = {4, 8, 2, 1, 6, 7};
        System.out.println(sumaParesImparesarreglo(a));
    
        }
        public static String sumaParesImparesarreglo (int[] a){

            int sumaPares = 0, sumaImpares = 0;
            String cad ="";

            for(int i = 0; i < a.length; i++ ){
                if(a [i]%2 == 0){
                    sumaPares = sumaPares +a[i]; 

                }else{
                    sumaImpares += a[i];
                }
            }
            cad = "La suma de los numeros pares = " + sumaPares + "suma de los numeros impares = " + sumaImpares;
            return cad;

        }

        public static String sumaExtremosArreglo(int[] a){
            String cad="";
            if(a.length%2 ==0) {

                for (int i = 0; i < a.length/2; i++){
                    cad +=(a[i] + (a[a.length-1-i]))+ "";
                }
            }else{
                cad += "Arreglo impar";
            }

            return cad;

        }



    }


