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
public class CentimetrosPulgadasConversor extends Conversor {
    
    public static final double UNA_PULGADA = 2.54;

    @Override
    public String getLabelValor1() {
        return "Centimetro";
        
    }

    @Override
    public String getLabelValor2() {
        return "Pulgadas";
    }
    
      @Override
    public String toString() {
        return "Centimetros - Pulgadas";
    }
  
    @Override
    public Double convertirvalor1valor2(double valor1) {
       return valor1/ UNA_PULGADA;
    }

    @Override
    public Double convertirvalor2valor1(double valor2) {
        return valor2 * UNA_PULGADA;
    }



  
}
