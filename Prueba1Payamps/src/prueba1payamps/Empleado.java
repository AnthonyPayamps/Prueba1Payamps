/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1payamps;

public class Empleado extends Persona{
       private String puesto;

   
    public Empleado(String nombre, int edad, String puesto) {
        super(nombre, edad);
        this.puesto = puesto;
    }


    public String solicitudPermiso() {
        return "Permiso solicitado por " + getNombre() + " en el puesto de " + puesto;
    }


    public String reporteHorasExtra(int horas) {
        return "Empleado " + getNombre() + " ha reportado " + horas + " horas extra.";
    }
}
