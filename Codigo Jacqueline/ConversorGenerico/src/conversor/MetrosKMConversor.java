/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Usuario
 */
public class MetrosKMConversor extends Conversor {
    public static final double UNA_PULGADA = 2.54;

    @Override
    public String getLabelValor1() {
        return "Metros";
        
    }

    @Override
    public String getLabelValor2() {
        return "KM";
    }
    
     @Override
    public String toString() {
        return "Metros - KM";
    }

   public double convertirValor1Valor2(Double Cent) {
       
         //To change body of generated methods, choose Tools | Templates.
         return Cent/ UNA_PULGADA;
    }

    
    public double convertirValor2Valor1(Double Cent) {
         //To change body of generated methods, choose Tools | Templates.
         return Cent * UNA_PULGADA;
    }
    

    
}
