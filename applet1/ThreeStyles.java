

import java.awt.Graphics;
import java.applet.*;    
public class AppletCircle extends Applet
{
  public void paint (Graphics g)
  {			                 // using drawRoundRect()
    g.drawRoundRect(40, 50, 90, 90, 200, 200);
    g.fillRoundRect(40, 160, 90, 90, 200, 200);
			                 // using drawOval()
    g.drawOval(150, 50, 90, 90);
    g.fillOval(150, 160, 90, 90);
			                // using drawArc()
    g.drawArc(270, 50, 90, 90, 0, 360);
    g.fillArc(270, 160, 90, 90, 0, 360);
  }
}
