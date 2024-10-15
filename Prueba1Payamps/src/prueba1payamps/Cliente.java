/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1payamps;

public class Cliente extends Persona {
     private String numeroCliente;

  
    public Cliente(String nombre, int edad, String numeroCliente) {
        super(nombre, edad);
        this.numeroCliente = numeroCliente;
    }

    public String contactarRepresentante() {
        return "Cliente " + getNombre() + " está contactando a un representante.";
    }

    public String solicitarInformacion() {
        return "Cliente " + getNombre() + " ha solicitado información de su cuenta.";
    }
}
