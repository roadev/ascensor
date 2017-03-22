/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JHONCANO
 */
public class Piso extends Ubicacion{

    public Piso() {
    }
    
    @Override
    public Boton obtenerBoton(){
        return botonUbicacion;
    }
    @Override
    public Puerta obtenerPuerta(){
        return puertaUbicacion;
    }
    
}
