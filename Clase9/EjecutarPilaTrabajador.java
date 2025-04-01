import java.util.stack;
public class EjecutarPilaTrabajador{
    public static void main (String[] args){

        stack<Trabajador> t= new stack<>();

        Trabajador t1 = new Trabajador ("1234", "Juan", "2200.0"); 

        Trabajador t2 = new Trabajador ("2222", "Luis", "1200.0"); 

        Trabajador t3 = new Trabajador ("0000", "Brr", "3300.0"); 

        Trabajadores.push("t1");
        Trabajadores.push("t2");
        Trabajadores.push("t3");

        System.out.println("Trabajadores");

        for( int i = 0; i < Trabajadores.size(); i++);{
        System.out.println(Trabajadores.elementAt(i).getNombre());

        double inc = 0.20;

        for(int i =0; i < Trabajadores.size(); i++){
            System.out.println(Trabajadores.elementAt(i).getNombre() + "Salario inicial: " + Trabajadores.elementAt(i).getSalario() + "Salario final: " + 
            Trabajadores.elementAt(i).pagar(inc) + "\n");
        }

        }



    }
}