/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nayara
 */
public class Navigation {
    public int x;    
    public int y;   
    public int xlimite;    
    public int ylimite;
    String result = null;
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

        
     public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

       
    public int getXlimite() {
        return xlimite;
    }

    public void setXlimite(int xlimite) {
        this.xlimite = xlimite;
    }

    public int getYlimite() {
        return ylimite;
    }

    public void setYlimite(int ylimite) {
        this.ylimite = ylimite;
    }
    
    
    public String NavigRover(String cXY, String xYdirection, String navigationRover){
        
        //separa a limite do plano pelo espaço 
         String[] coordenadaXY = cXY.split(" ");
        
         //limite do plano
         xlimite = Integer.parseInt(coordenadaXY[0]);
         ylimite = Integer.parseInt(coordenadaXY[1]);
        
         //separa as coordenadas e a direção pelo espaço
         String[] coordenadaXYdirection = xYdirection.split(" ");
         
         x = Integer.parseInt(coordenadaXYdirection[0]);
         y = Integer.parseInt(coordenadaXYdirection[1]);
         
         String aux = coordenadaXYdirection[2];
                  
         char[] directionXY = aux.toCharArray();
         //direção 
         char drx = directionXY[0];
           
         //instruções
         char[] navRover = navigationRover.toCharArray();
         
         if (x <= xlimite && y <= ylimite){
             if(drx == 'N' || drx == 'S' || drx == 'E' || drx == 'W'){
                        //para cada instrução executa uma ação
                        for (int i =0; i < navRover.length ; i++){

                           switch (navRover[i]){
                               //virar 90 graus p/ esquerda
                               case 'L':
                                   switch (drx) {
                                       case 'N':
                                           drx = 'W';
                                           break;
                                       case 'E':
                                           drx = 'N';
                                           break;
                                       case 'W':
                                           drx = 'S';
                                           break;
                                       case 'S':
                                           drx = 'E';
                                           break;
                                       
                                   }

                                   break;
                               //virar 90 graus p/direita
                               case 'R':
                                   switch (drx) {
                                       case 'N':
                                           drx = 'E';
                                           break;
                                       case 'E':
                                           drx = 'S';
                                           break;
                                       case 'W':
                                           drx = 'N';
                                           break;
                                       case 'S':
                                           drx = 'W';
                                           break;
                                       
                                   }

                                   break;
                               // move 1 no plano para a direção correspondente
                               //se chegar aos limites do plano não se movimenta (xlimite ylimite) ou (0 0)
                               case 'M':
                                   switch (drx) {
                                       case 'N':
                                           if(y != ylimite) 
                                               y++;
                                           break;
                                       case 'E':
                                           if(x != xlimite)
                                               x++;
                                           break;
                                       case 'W':
                                           if(x != 0)
                                               x = x - 1;                              
                                           break;
                                       case 'S':
                                           if(y != 0)
                                               y = y - 1;                    
                                           break;
                                      
                                       }
                                   break;
                               default:
                                 System.out.printf("Intrução %s informada incorretamente consulte 'README!!'\n", navRover[i] );  
                                 break;
                           }
                        }

                       String valueX = String.valueOf(x);
                       String valueY = String.valueOf(y);
                       String valueDXY = String.valueOf(drx);

                       result = valueX + " " + valueY + " " + valueDXY;
             }
             else
             {
                System.out.printf("Direção %s informada incorretamente consulte 'README!!'\n",drx);
             }
         }
         
         else{
             System.out.printf("Coordenadas %d %d ultrapassam os limites do plano consulte 'README!!'\n",x,y);
         }
        
        
        return result;
    }
}
