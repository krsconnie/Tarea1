package tarea1;
/**
 * Se declara Excepción personalizada,
 cuando no hay bebida en el deposito
 */
public class NoHayBebidaException extends Exception{
    /**
     * Se define método que etrega el mensaje de error
     * @param msg mensaje de error
     */
    public NoHayBebidaException(String msg){
        super(msg);
    }
}