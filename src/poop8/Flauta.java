/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *Clase que hereda de Instrumento de viento
 * @author Cárdenas Lagui Sara Alejandra
 */
public class Flauta extends InstrumentoViento {
    
    /**
     * Metodo sobre escrito
     * @return regresa una concatenacion de flauta de tipo de instrumento
     */
    @Override
    public String tipoInstrumento() {
        return "flauta"; }

    /**
     * Metodo sobre escrito
     * @return regresa una concatenacion de los métodos de flauta
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
    
    
}
