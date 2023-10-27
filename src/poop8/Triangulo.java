/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *Clase que guarda los datos sobre un triangulo
 * @author Cárdenas Lagui Sara Alejandra
 */
public class Triangulo extends Poligono {
    private int alfa, beta, gamma;
    private float a,b,c, base, altura;

    /**
     * Constructor vacío
     */
    public Triangulo() {
    }

    /**
     * Constructor lleno
     * @param alfa primer angulo de un triangulo
     * @param beta segundo angulo de un triangulo
     * @param gamma tercer angulo de un triangulo
     * @param a lado a de un triangulo
     * @param b lado b de un triangulo
     * @param c lado c de un triangulo
     * @param base base de un triangulo
     * @param altura altura de un triangulo
     */
    public Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
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
     * @return  regresa el angulo alfa del triangulo
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Metodo set que recibe el angulo alfa de tipo int
     * @param alfa 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Metodo set
     * @return regresa el angulo beta del triangulo
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
     * @return regresa el angulo gamma de un triangulo
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
     * @return regresa el lado a del triangulo
     */
    public float getA() {
        return a;
    }

    /**
     * Metodo set que recibe el lado a de tipo float
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Metodo get
     * @return regresa el lado b del triangulo
     */
    public float getB() {
        return b;
    }

    /**
     * Metodo set que recibe el lado b de tipo float
     * @param b 
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Metodo get
     * @return regresa el lado c de un triangulo
     */
    public float getC() {
        return c;
    }

    /**
     * Metodo set que recibe el lado c de tipo float
     * @param c 
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Metodo get
     * @return regresa la base de un triangulo
     */
    public float getBase() {
        return base;
    }

    /**
     * Metodo set que recibe la base de tipo float
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Metodo get
     * @return regresa la altura de un triangulo
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Metodo set que recibe la altura de tipo float
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion del area de un triangulo
     */
    @Override
    public int area(){
        return(int)(base*altura)/2;//el int se pone como casteo para indicar que quiero un entero
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion del perimetro de un triangulo
     */
    @Override
    public int perimetro(){
        return(int)(a+b+c);
    }
    
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
    
    
}
