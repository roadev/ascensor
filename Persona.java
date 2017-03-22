/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JHONCANO
 */
public class Persona {

    private int ID;
    private boolean movimiento = true;
    private Ubicacion ubicacion;
    private Boton boton;

    public Persona(int ID, Ubicacion ubicacion, Boton boton) {
        this.ID = ID;
        this.ubicacion = ubicacion;
        this.boton = boton;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Boton getBoton() {
        return boton;
    }

    public void setBoton(Boton boton) {
        this.boton = boton;
    }

    public boolean isMovimiento() {
        return movimiento;
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    
    public void puertaAbierta(){
        Puerta puertaUbicacion = new Puerta();
        puertaUbicacion.abierta = true;
    }

}
