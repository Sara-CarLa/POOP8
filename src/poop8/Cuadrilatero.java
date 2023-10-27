/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *Clase que guarda datos de un cuadrilatero
 * @author Cardenas Lagui Sara Alejandra
 */
public class Cuadrilatero extends Poligono {
    private int alfa, beta, gamma;
    private int a,b,c, base, altura;

    /**
     * Constructor vacío
     */
    public Cuadrilatero() {
    }

    /**
     * Constructor lleno
     * @param alfa primer angulo del cuadrilatero
     * @param beta segundo angulo del cuadrilatero
     * @param gamma tercer angulo del cuadrilatero
     * @param a lado a del cuadrilatero
     * @param b lado b del cuadrilatero
     * @param c lado c del cuadrilatero
     * @param base base del cuadrilatero
     * @param altura altura del cuadrilatero
     */
    public Cuadrilatero(int alfa, int beta, int gamma, int a, int b, int c, int base, int altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo get
     * @return angulo alfa del cuadrilatero
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Método set que recibe el angulo alfa de tipo int
     * @param alfa 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Metodo get
     * @return  regresa el angulo beta del cuadrilatero
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Metodo set que recibe el angulo beta de tipo int
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Metodo get
     * @return regresa el angulo gamma del cuadrilatero
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * Metodo set que recibe el angulo gamma de tipo int
     * @param gamma 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * Metodo get
     * @return regresa el lado a del cuadrilatero
     */
    public int getA() {
        return a;
    }

    /**
     * Metodo set que recibe el lado a de tipo int
     * @param a 
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * Metodo get
     * @return regresa el lado b del cuadrilatero
     */
    public int getB() {
        return b;
    }

    /**
     * Metodo set que recibe el lado b de tipo int
     * @param b 
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * Metodo get
     * @return regresa el lado c del cuadrilatero
     */
    public int getC() {
        return c;
    }

    /**
     * Metodo set que recibe el lado c de tipo int
     * @param c 
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * Metodo get
     * @return regresa la base del cuadrilatero
     */
    public int getBase() {
        return base;
    }

    /**
     * Metodo set que recibe la base de tipo int
     * @param base 
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Metodo get
     * @return regresa la altura del cuadrilatero
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Metodo set que recibe la altura de tipo int
     * @param altura 
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion del area de un cuadrilatero
     */
    @Override
    public int area(){
        return(int)(base*altura);//el int se pone como casteo para indicar que quiero un entero
    }
    
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion del perimetro de un cuadrilatero
     */
    @Override
    public int perimetro(){
        return(int)(2*a+2*b);
    }

    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
