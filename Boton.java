
/**
 *
 * @author JHONCANO
 */
public class Boton {

    public boolean oprimido = false;

    public void restablecerBoton(){
        oprimido = false;
    }

    public void oprimirBoton(boolean oprimido){
        this.oprimido = oprimido;
    }
    
    public boolean getEstado() {
        return oprimido;
    }
}
