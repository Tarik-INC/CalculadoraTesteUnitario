/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author aluno
 */
public class Calculadora {
    
    public double add(String num) {
        String num1;
        String num2;
        
        num1 = num.split(",")[0];
        num2 = num.split(",")[1];
        
        return (Integer.getInteger(num1) + Integer.getInteger(num2));
    }
    
    
    
}
