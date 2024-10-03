/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author ACER
 */
public class moto extends Vehiculo{
    //constructor de la moto 
    public moto(String hp,int ruedas,String modelo, String color,String marca,int capacidad,int añoFabrica ){
        //super hace referencia al padre 
       super (hp,ruedas,modelo,color,marca,capacidad,añoFabrica); 
    }
    
    public void frenar (){
        System.out.println("la moto frena :c");
    }
    public void acelerar (){
        System.out.println("la moto esta acelerando ");
    }
    public void retrocediento (){
        System.out.println("la moto esta retrocediendo");
    }
    public void prendiendoFaros (){
        System.out.println("la moto prendio sus faros ");
    }
}
