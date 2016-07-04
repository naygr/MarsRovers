
import java.util.ArrayList;
import java.util.List;
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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        String n = null;  
       
        char[] continuar = null;
        char c = 'n';
        
        //New lista
        List lista = new ArrayList();
        
        Plan plan = new Plan();
        
        //Coordenadas superior direito e inferior esquerdo do plano
        String A = plan.planXY();
        
        do{
            //New Rover 
            Rover rover = new Rover();
            //New Navigation
            Navigation nav = new Navigation();
                       

            try{
              
                 //Informação do Rover
                String B = rover.coordenadasXYdirection();
                //Intruções do Rover
                String instructionRover = rover.instructions(); 
                //Navegação do Rover
                String navigationRoverXY = nav.NavigRover(A,B,instructionRover);
                
                //add a saída da navegação do Rover na lista
                lista.add(navigationRoverXY);
                
                System.out.printf("Possui mais Rovers? (s/n)\n");
                n = ler.next();
                continuar = n.toCharArray();
                c = continuar[0];

            }catch(NumberFormatException e){
                System.out.println("'README!!'" + e.getMessage());
            }
        }while(c == 's' || c == 'S');
        
        //imprime lista com as saídas
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
          }
        
        
        
    }
    
}
