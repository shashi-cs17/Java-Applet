import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SwingApp extends Applet implements MouseMotionListener{
    
    String msg="";
    int xcor=0;
    int ycor=0;
    
    public void init()
    {
       addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent me)
    {
      msg="Moving";  
      xcor= 0;
      ycor= 10;

      repaint();
      showStatus("Being Moved at X:"+me.getX()+"|Y:"+me.getY());

    }

    public void mouseDragged(MouseEvent me)
    {
      msg="Dragging";  
      xcor= 0;
      ycor= 10;

      repaint();
      showStatus("Being Dragged at X:"+me.getX()+"|Y:"+me.getY());

    }


    public void start()
    {
        
    }
    
    public void paint(Graphics g)
    {
        g.drawString(msg,xcor,ycor);
    }
    
    public void stop()
    {
        
    }
    
    public void destory()
    {
        
    } 
}