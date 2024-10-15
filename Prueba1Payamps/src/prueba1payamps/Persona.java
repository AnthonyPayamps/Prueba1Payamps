
package prueba1payamps;

public class Persona {
     private String nombre;
    private int edad;

   
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

 
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

   
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

