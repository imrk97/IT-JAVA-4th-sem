Java

import java.awt.Graphics;
import java.applet.Applet;    
public class ThreeStyles extends Applet
{
  public void paint (Graphics g)
  {                 // using drawRoundRect()
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
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
import java.awt.Graphics;
import java.applet.Applet;    
public class ThreeStyles extends Applet
{
  public void paint (Graphics g)
  {                 // using drawRoundRect()
    g.drawRoundRect(40, 50, 90, 90, 200, 200);
    g.fillRoundRect(40, 160, 90, 90, 200, 200);
                 // using drawOval()
    g.drawOval(150, 50, 90, 90);
    g.fillOval(150, 160, 90, 90);
                // using drawArc()
    g.drawArc(270, 50, 90, 90, 0, 360);
    g.fillArc(270, 160, 90, 90, 0, 360);
  }
