/**************************************
 *     Timothy Shine                  * 
 *     AP Lab 04 - Curve Line         * 
 *     9/30/2015                      * 
 *                                    *
 **************************************/


import java.awt.*;
import java.applet.*;

public class CurveLine extends Applet{
    public void init(){
        setSize(1000,650);
    }
    
    public void paint(Graphics g)
        {
            int width = 980;
            int height = 630;
            g.drawRect(10,10,width,height);
            
            // Draw bottom-right corner
            int x = 10;
            int y = 640;
            int x1= 990;
            int y1 = 640;
            for (int k = 0;k<61; k++){
                g.drawLine(x, y, x1, y1);
                x+=16;
                y1-=10;
            
            }
                    
            
            // Draw bottom-left corner
            x = 990;
            y = 640;
            x1 = 10;
            y1 = 640;
            for(int k =0; k<61; k++){
                g.drawLine(x,y,x1,y1);
                x -=16;
                y1 -=10;
            }
            
            
            // Draw top-left corner
            x = 10;
            y = 10;
            x1= 990;
            y1 = 10;
            for (int k = 0;k<61; k++){
                g.drawLine(x, y, x1, y1);
                x1-=16;
                y+=10;
            
            }
            
                
            // Draw top-right corner
            x = 990;
            y = 10;
            x1= 10;
            y1 = 10;
            for (int k = 0;k<61; k++){
                g.drawLine(x, y, x1, y1);
                x1+=16;
                y+=10;
            
            }
            
            
            /***********************************
             *          INSIDE BOX             *
             ***********************************/
            //Draw Box
            g.drawRect(275,150,450,350);
             
            // Draw top-right corner
            x = 275;
            y = 150;
            x1= 725;
            y1 = 150;
            for (int k = 0;k<56; k++){
                g.drawLine(x, y, x1, y1);
                x+=8;
                y1+=6;
            
            }
                    
            
            // Draw top-left corner
            x = 725;
            y = 150;
            x1= 275;
            y1 = 150;
            for (int k = 0;k<56; k++){
                g.drawLine(x, y, x1, y1);
                x-=8;
                y1+=6;
            
            }
            
            
            
            // Draw bottom-right corner
            x = 275;
            y = 500;
            x1= 725;
            y1 = 500;
            for (int k = 0;k<56; k++){
                g.drawLine(x, y, x1, y1);
                x+=8;
                y1-=6;
            
            }
            
            
            
                
            // Draw bottom-left corner
            x = 725;
            y = 500;
            x1= 275;
            y1 = 500;
            for (int k = 0;k<56; k++){
                g.drawLine(x, y, x1, y1);
                x-=8;
                y1-=6;
            
            }
            
           
            
        }
    

}


