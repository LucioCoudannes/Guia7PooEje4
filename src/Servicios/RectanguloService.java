/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class RectanguloService {
    
    Scanner leer = new Scanner(System.in);
    
    
    public Rectangulo crearRectangulo(){
        
        Rectangulo r1 = new Rectangulo();
    
            System.out.println("Ingrese la base del rectangulo");
            r1.setBase(leer.nextFloat());
            System.out.println("Ingrese la altura del rectangulo");
            r1.setAltura(leer.nextFloat());
            
            return r1;
            
}
    
    public float calcsuperficie(Rectangulo x){
        
        float superficie;
        
        superficie = x.getBase() * x.getAltura();
        
        return superficie;
    }
    
    public float calcperimetro(Rectangulo x){
        
        float perimetro;
        
        perimetro = (x.getBase() + x.getAltura()) * 2;
        
        return perimetro;
    }

    public void dibujarectangulo(Rectangulo x){
        
        for (int i = 0; i < x.getAltura(); i++) {
            
            
            
            for (int j = 0; j < x.getBase(); j++) {
               
                if (i==0 || j==0) {
                    
                    System.out.print("*");
 
                }
                else System.out.print(" ");
                
                
                
            }
            
            System.out.println("");
            
        }
        
        
        
    }


    
}
