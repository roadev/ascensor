
/**
 *
 * @author JHONCANO
 */
public class Boton {

    private boolean oprimido;

    public Boton(boolean oprimido) {
      this.oprimido = oprimido;
    }

    public void restablecerBoton(){
      oprimido = false;
    }

    public void oprimirBoton(){
      oprimido = true;
    }

    public boolean getEstado() {
      return oprimido;
    }
}
