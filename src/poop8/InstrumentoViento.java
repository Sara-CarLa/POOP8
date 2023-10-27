/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase que guarda metodos de un Instrumento de viento 
 * @author Cárdenas Lagui Sara Alejandra
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {

    /**
     * Constructor vacío
     */
    public InstrumentoViento() {
    }
    /**
     * Metodo sobre escrito
     * @return regresa un instrumento de viento
     */
    @Override
    public String tipoInstrumento(){
        return "instrumentoViento";
    }

    /**
     * Metodo sobre escrito que muestra el método tocar
     *      
     */
    @Override
    public void tocar() {
        System.out.println("Tocar instrumento de viento");
    }

    /**
     * Metodo sobre escrito que muestra el método afinar
     *
     */
    @Override
    public void afinar() {
        System.out.println("Afinar instrumento de viento");
    }

    /**
     * Metodo sobre escrito
     * @return regresa una concatenacion de los valores de instrumento de viento
     */
    @Override
    public String toString() {
        return "InstrimentoViento{" + '}';
    }

    
    
}
