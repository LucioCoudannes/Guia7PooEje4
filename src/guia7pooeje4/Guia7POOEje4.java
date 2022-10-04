/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooeje4;

import Entidades.Rectangulo;
import Servicios.RectanguloService;



/**
 *
 * @author A288808
 */
public class Guia7POOEje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      RectanguloService rs = new RectanguloService();
      
      Rectangulo R = rs.crearRectangulo();
      
      rs.calcperimetro(R);
      rs.calcsuperficie(R);
      rs.dibujarectangulo(R);
      
      
      
     
    }
    
}
