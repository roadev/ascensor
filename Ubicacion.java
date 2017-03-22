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
    public Boton botonUbicacion;
    public Puerta puertaUbicacion;

    public Ubicacion(String nombreUbicacion){
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
