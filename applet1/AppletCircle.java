

import java.awt.Graphics;
import java.applet.*;    
public class AppletCircle extends Applet
{
  public void paint (Graphics g)
  {			                
    g.drawOval(150, 50, 90, 90);
    g.drawOval(300,60,90,60);
	g.drawRect(450,60,60,40);
	g.drawRect(600,60,60,60);
			               
    
  }
}
