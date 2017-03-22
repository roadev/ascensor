/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JHONCANO
 */
public class Ubicacion {

    private String nombreUbicacion;
    private int capacidad = 1;
    public Boton botonUbicacion;
    public Puerta puertaUbicacion;

    public void establecerNombreUbicacion(String nombreUbicacion){
        this.nombreUbicacion = nombreUbicacion;
    }

    public String obtenerNombreUbicacion(){
        return nombreUbicacion;
    }

    public Boton obtenerBoton(){
        return botonUbicacion;
    }

    public Puerta obtenerPuerta(){
        return puertaUbicacion;
    }
}
