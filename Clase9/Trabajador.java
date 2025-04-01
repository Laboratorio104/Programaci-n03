public class Trabajador {
     private String Cedula; 
     private String Nombre;
     private double Salario;

     publi Trabajador(String Cedula, String Nombre, double Salario){
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Salario = Salario;

     }

      public String getCedula(){
        return cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public double getSalario(){
        return salario;
    }

    public String toString(){
        return "Trabajador { Cedula: " + cedula + " Nombre: " + nombre + " Salario: " + salario + "}"; 
    }

    public double pagar(double incremento){
        return salario + (salario * incremento);
}