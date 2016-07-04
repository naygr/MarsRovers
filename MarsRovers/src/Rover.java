
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nayara
 */
public class Rover {
    
   
      
     public String coordenadasXYdirection() {
               
        Scanner scanner = new Scanner( System.in );
        String coordenadaXYdirection = scanner.nextLine();
                
        return coordenadaXYdirection;
    }
     
     public String instructions() {
               
        Scanner scanner = new Scanner( System.in );
        String instructionsRover = scanner.nextLine();
       
        return instructionsRover;
    }
    
}
