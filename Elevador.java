/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JHONCANO
 */

import java.util.ArrayList;

public class Elevador extends Ubicacion{

    private boolean movimiento = false;
    private boolean llamado = false;
    private Ubicacion pisoActual;
    private Ubicacion pisoDestino;
    private int tiempoRecorrido = 5;

    private Puerta puertaElevador;
    private Boton botonElevador;
    private Timbre timbre;
    private Ubicacion ubicacion;
    private int capacidad;

    private ArrayList<Persona> personas = new ArrayList<>();

    public void viajar() {
        movimiento = true;
    }

    public void solictarElevador() {
        llamado = true;
    }

    public void entrarElevador(Persona persona) {
      personas.add(persona);
      establecerCapacidad(obtenerCapacidad() - 1);
    }

    public void salirElevador() {

    }

    public void partidaElevador() {

    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public void establecerCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    @Override
    public Boton obtenerBoton(){
        return botonElevador;
    }

    @Override
    public Puerta obtenerPuerta(){
        return puertaElevador;
    }

}
