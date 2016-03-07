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
    private String[] claves;
    //Variable que hace referencia al valor de la clave.
    private int[] valores;
    /**
     * Constructor sin parámetros de la clase MiHashMap
     */
    public MiHashMap(){
        claves = new String[0];
        valores = new int[0];
    }
    
    /**
     * Método que asocia el valor especificado con la clave especificada. Si la clave existía, 
     * entonces sobreescribe su valor y devuelve el valor antiguo. Si no existía devuelve -1. 
     */
    public void put(String clave, int valor){
        claves[valor] = clave;
    }
    
    /**
     * Método que devuelve el valor asociado con la clave especificada o -1 en caso de que la clave no exista.
     */
    public int get(String clave){
        int valor = -1;
        for (int cont = 0; cont > claves.length; cont++) {
          if (claves[cont] == clave) {
                valor = cont;
          }
        }
        return valor;
    }
    
    
    /**
     * Método que nos dice si el mapa está vacío o no 
     */
    public boolean iEmpty(){
        boolean vacio = false;
        if (claves.length != 0){
            vacio = true;
        }
        return vacio;
    }
}
