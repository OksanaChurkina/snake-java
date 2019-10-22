/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import snake.pak.apple;
import snake.pak.snakeClass;

/**
 *
 * @author User
 */
public  class Snake extends JPanel implements ActionListener
{

    public static final int SCALE = 32;
     public static final int WIDTH = 20;
      public static final int HIGTH = 20;
      public static final int SPEED = 5;
      
      apple a = new apple((int) (Math.random()*WIDTH), (int)(Math.random()*HIGTH));
      snakeClass s = new snakeClass(10,10, 9, 10);
      Timer t = new Timer(1000/SPEED,  this);
    
      
      public Snake()
      {
      t.start();
   addKeyListener(new KeyBoard());
      setFocusable(true);
      }
      
      public void paint(Graphics g)
      {
      g.setColor( color(15,50,120));
      g.fillRect(0, 0, WIDTH*SCALE, HIGTH*SCALE);
      g.setColor(color(255, 216, 0));
          for(int x = 0; x <= WIDTH*SCALE; x+=SCALE)
          {
          g.drawLine(x, 0, x, HIGTH*SCALE);
          }
          for(int y = 0; y <= HIGTH*SCALE; y+=SCALE)
          {
          g.drawLine(0, y, WIDTH*SCALE, y);
          }
          for(int d = 0; d < s.length; d++)
          { 
              g.setColor(color(200,150, 0));
          g.fillRect(s.snakeX[d]*SCALE + 1, s.snakeY[d]*SCALE+1, SCALE - 1, SCALE-1);
         
          }
          g.setColor(color(255, 0, 0));
          g.fillRect(a.posX*SCALE + 1, a.posY*SCALE+1, SCALE - 1, SCALE-1);
      }
      
      public Color color(int red, int green, int blue)
      {
      return new Color(red, green, blue);
          
      }
    public static void main(String[] args) {
       JFrame fr = new JFrame();
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fr.setResizable(false);
       fr.setLocationRelativeTo(null);
       fr.setSize(WIDTH*SCALE + 7, HIGTH*SCALE + 27 );
       fr.add(new Snake());
       fr.setVisible(true);
    }
    
    
   

  private   class KeyBoard extends KeyAdapter
{
public void keyPressed(KeyEvent kEvt)
{
int key = kEvt.getKeyCode();
if ((key == KeyEvent.VK_RIGHT)& s.direction!=2) {s.direction = 0;}
if ((key == KeyEvent.VK_DOWN)& s.direction!=3) {s.direction = 1;}
if ((key == KeyEvent.VK_LEFT)& s.direction!=0) {s.direction = 2;}
if ((key == KeyEvent.VK_UP)& s.direction!=1) {s.direction = 3;}

}
} 
    
   
     public void actionPerformed(ActionEvent e) {
     
        s.move();
        if((s.snakeX[0] == a.posX) & (s.snakeY[0] == a.posY))
        {
        a.setRandom();
        s.length ++;
        }
        for(int k = 1; k < s.length; k ++)
        {
        if((s.snakeX[k] == a.posX) & (s.snakeY[k] == a.posY))
        {
        a.setRandom();
        s.length ++;
        }
        }
        repaint();
    }
    
}
    


    
   
    
