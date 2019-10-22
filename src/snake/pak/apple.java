/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake.pak;




import snake.Snake;



/**
 *
 * @author User
 */
public class apple {
    public int posX;
    public int posY;
    
    public apple(int startX, int startY)
    {
    posX = startX;
    posY = startY;
    }
    public void setRandom()
    {
    posX = (int)(Math.random()*Snake.WIDTH);
    posY = (int)(Math.random()*Snake.WIDTH);
    }
}
