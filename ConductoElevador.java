/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JHONCANO
 */
public class ConductoElevador {

    public Luz luz;
    public Puerta puerta;
    public Boton boton;
    public Elevador elevador;

    public ConductoElevador(Luz luz, Puerta puerta, Boton boton, Elevador elevador) {
        this.luz = luz;
        this.puerta = puerta;
        this.boton = boton;
        this.elevador = elevador;
    }

    public Boton getBoton() {
        return boton;
    }

    public void setBoton(Boton boton) {
        this.boton = boton;
    }

    public Elevador getElevador() {
        return elevador;
    }

    public void setElevador(Elevador elevador) {
        this.elevador = elevador;
    }

    public Luz getLuz() {
        return luz;
    }

    public void setLuz(Luz luz) {
        this.luz = luz;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    
}
