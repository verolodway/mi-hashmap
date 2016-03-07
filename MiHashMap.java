import java.util.Arrays;
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    //Variable que representa la palabra clave.
    private String[] clave;
    //Variable que hace referencia al valor de la clave.
    private int[] valor;
    /**
     * Constructor sin parámetros de la clase MiHashMap
     */
    public MiHashMap(){
        clave = new String[0];
        valor = new int[0];
    }
    
    /**
     * Método que asocia el valor especificado con la clave especificada. Si la clave existía, 
     * entonces sobreescribe su valor y devuelve el valor antiguo. Si no existía devuelve -1. 
     */
    public int put(String claves, int valores){
        int claveSi = -1;
        for (int cont = 0; cont > clave.length; cont++) {
          if (clave[cont] == claves) {
                claveSi = cont;
          }
        }
        return claveSi;
    }
}
