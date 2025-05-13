import java.util.ArrayList;
public class EjerciciodeAutos {
     static class  Categoria{
        String nombre;
        int cantidad;
        double gasolina, diesel, gas;

        Categoria (String Nombre, int cantidad, double gasolina, double diesel, double gas){
            this.nombre = Nombre;
            this.cantidad = cantidad;
            this.gasolina = gasolina;
            this.diesel = diesel;
            this.gas = gas;

        }
        void calcularEmisiones(){
            int litrosAnuales = 1000;
            double co2Gasolina = cantidad * gasolina * litrosAnuales * 2.31;
            double co2Diesel = cantidad *diesel * litrosAnuales * 2.68;
            double co2Gas = cantidad *  diesel * litrosAnuales * 2.00;

            System.out.println(nombre + (""));
            System.out.printf(" Gasolina: %.2f t CO%n", co2Gasolina / 1000 );
            System.out.printf(" Diesel: %.2f t CO%n", co2Diesel / 1000 );
            System.out.printf(" Gas: %.2f t CO%n", co2Gas / 1000 );

        }
        }
        public static void main (String[] args) {
            ArrayList <Categoria> categorias = new ArrayList<>();
            categorias.add(new Categoria ("Camiones livianos", 400000, 0.30, 0.40, 0.25));
            categorias.add(new Categoria ("Camiones Medianos", 280000, 0.25, 0.50, 0.25));
            categorias.add(new Categoria ("Camiones Pesados", 380000, 0.10, 0.80, 0.10));
            categorias.add(new Categoria ("Tractocamiones", 1150000, 0.05, 0.90, 0.05));
            categorias.add(new Categoria ("Volquetas", 936000, 0.40, 0.40, 0.20));

            for (Categoria c : categorias) c.calcularEmisiones();


        }
        
    }

    

        
