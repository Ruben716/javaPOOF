package vehiculo;

/**
 *
 * @author ACER
 */
import java.util.Date;
public class Vehiculo {
    //objeto vehiculo 
    //atributos = caracteristicas 
    private String hp ;
    private int ruedas ;
    private String modelo ;
    private  String color ;
    private String marca;
    private int capasidad ;
    private int  añoFabrica ;
    private  boolean encendido;
    
    //constructor sirve para inizializar 
    public Vehiculo (String hp,int ruedas,String modelo, String color,String marca,int capacidad,int añoFabrica ){
        this.hp= hp;
        this.ruedas =ruedas;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.capasidad = capacidad;
        this.añoFabrica =añoFabrica;
    } 
    
    //metodo 
    public void transportar (){
        System.out.println("el vehiculo esta en movimiento");
        
        
    }
    public void encender (){
        System.out.println("veiculo encendido");
        //this para llamar los private de arriba 
        this.encendido = true ;
    }
    public void informacion() {
    System.out.println("Información del Vehículo: " +
        "HP: " + this.hp + ", " +
        "Ruedas: " + this.ruedas + ", " +
        "Modelo: " + this.modelo + ", " +
        "Color: " + this.color + ", " +
        "Marca: " + this.marca + ", " +
        "Capacidad: " + this.capasidad + ", " +
        "Año de Fabricación: " + this.añoFabrica + ", " +
        "Encendido: " + (this.encendido ? "Sí" : "No"));
}
    
    public void prueva (){
        System.out.println("informacion de las llanatas  "+ruedas);
    }
    
}
