/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author Patience
 */
public class ReadInput {
    public static String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input expression (for eg: 4*3/2");
        String inputLine = scanner.nextLine();
        
        scanner.close();
        return inputLine;
    }
}
