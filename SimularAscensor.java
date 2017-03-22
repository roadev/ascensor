
/**
 *
 * @author JHONCANO
 */
public class SimularAscensor {

    public static void main(String[] args) {
        // TODO code application logic here

        //piso 1 del ascensor orpimir boton

        Boton boton = new Boton(true);

        Ubicacion ubicacion = new Ubicacion("piso 1");
        Ubicacion ubicacion2 = new Ubicacion("piso 2");

        Elevador ascensor = new Elevador(10, "piso 1");

        Persona jhon = new Persona(1001, ubicacion, boton, "Jhon Cano");
        Persona robert = new Persona(1000, ubicacion2, boton, "Robergalarga");
        ascensor.entrarElevador(jhon);
        ascensor.entrarElevador(robert);

        System.out.println("Capacidad actual: " + ascensor.obtenerCapacidad() + "\nPersonas: " + "\n" + ascensor.imprimirPersonas());

        ascensor.salirElevador(ascensor.buscarPersonaPorId(1000));

        System.out.println("Capacidad actual: " + ascensor.obtenerCapacidad() + "\nPersonas: " + "\n" + ascensor.imprimirPersonas());

        System.out.println(jhon.getUbicacion().obtenerNombreUbicacion()+" "+jhon.getBoton().getEstado());



    }

}
