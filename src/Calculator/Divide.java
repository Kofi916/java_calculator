/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author Patience
 */
public class Divide implements Operate {

    @Override
    public Double getResult(Double... numbers) {
        Double result = numbers[0];
        
        for (int i = 1; i < numbers.length; i++){
            result /= numbers[i];
        }
        return result;
        
    }

   
    
}
