/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import Interfaz.INegocio;

/**
 *
 * @author Alejandro
 */
public class NegocioFactory {
    
    public static INegocio crearNegocio(){
        return  new Negocio();
    }
}
