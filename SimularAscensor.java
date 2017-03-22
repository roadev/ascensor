/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JHONCANO
 */
public class SimularAscensor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //piso 1 del ascensor orpimir boton

        Boton boton = new Boton();

        boton.oprimirBoton(true);

        Ubicacion ubicacion = new Ubicacion();

        ubicacion.establecerNombreUbicacion("piso 1");
        
        Persona jhon = new Persona(1001, ubicacion, boton);

        System.out.println(jhon.getUbicacion().obtenerNombreUbicacion()+" "+jhon.getBoton().getEstado());



    }

}
