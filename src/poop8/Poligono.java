/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *Creación de interfaz poligono
 * @author Cardenas Lagui Sara Alejandra
 */
public abstract class Poligono extends Object {

    /**
     * Constructor vacío
     */
    public Poligono() {
    }
    /**
     * Método abstracto
     * @return regresa el area de un poligono
     */
    public abstract int area();//los hacemos abstract ya que el metodo no recibe nada
    /**
     * Método abstracto
     * @return regresa el perimetro de un poligono
     */
    public abstract int perimetro();
    
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion del area y perimetro de un poligono
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
    
    
}
