package miPrincipal;

import miPrincipal.Alumno;

public class Principal {
   

    public static void main(String[] args) {

     Alumno alumno1 = new Alumno();
     Alumno alumno2 = new Alumno("Juan", 24170650, 95, "Sistemas");


     
     alumno1.cargarMateria();

     alumno2.cargarMateria();

     double prom = alumno2.obtenerPromedio();

     System.out.println("El promedio = "+prom);
    }
}