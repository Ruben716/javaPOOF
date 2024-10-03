/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author ruben daniel nuñez quispe 
 */
public class principal  {
    public static void main(String[] args) {
        //inbocar o llamar a alguien 
        
        moto motos = new moto("1700",2,"ninya","verde","kawasaki",2,2024);
        motos.encender();
        motos.transportar();
        motos.frenar();
        motos.retrocediento();
        motos.acelerar();
        motos.prendiendoFaros();
        motos.informacion();
        moto motoss = new moto ("2500",2,"sport","rojo","BMV",2,2025);
        
        motoss.informacion();
        //motoss.encender();
        //motoss.transportar();
        //motoss.frenar();
        //motoss.retrocediento();
        //motoss.acelerar();
        //motoss.prendiendoFaros();
        
        Auto auto = new Auto ("2500",2,"sport","rojo","BMV",2,2025,5);
        
        auto.informacion();
        
        
            
               
}
}