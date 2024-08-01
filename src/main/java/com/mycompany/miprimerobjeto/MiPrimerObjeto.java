/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miprimerobjeto;

/**
 *
 * @author Andy Macnab
 */
public class MiPrimerObjeto {

    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Rojo", "Sedán", "Corolla", 5);

        miAuto.setMarca("Honda");
        miAuto.setColor("Azul");
        miAuto.setTipo("SUV");
        miAuto.setModelo("CR-V");
        miAuto.setCantidadPasajeros(7);

        miAuto.mostrarInformacion();
    }
}
