/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake.pak;

/**
 *
 * @author User
 */
public class snakeClass {
    public int direction;
    public int length = 2;
    
    public int snakeX[] = new int[100];
     public int snakeY[] = new int[100];
     
     public snakeClass(int x0, int y0, int x1, int y1)
     {
         snakeX[0] = x0;
         snakeY[0] = y0;
         snakeX[1] = x1;
         snakeY[1] = y1;
         
     }
     public void move()
     {
     for(int d = length; d> 0; d--)
     {
     snakeX[d] = snakeX[d-1];
     snakeY[d] = snakeY[d-1];
     }
     
     if(direction == 0) snakeX[0]++;
     if(direction == 1) snakeY[0]++;
     if(direction == 2) snakeX[0]--;
     if(direction == 3) snakeY[0]--;
     }
    
    
}
