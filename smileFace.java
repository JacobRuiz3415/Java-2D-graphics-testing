import java.awt.*;
import javax.swing.*;

public class smileFace extends JComponent {
    protected  void  smileComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g.setColor(new Color(255,255,255));
        g.fillOval(150, 150, 100, 100);

        //eyes
        g.drawOval(50, 30, 50, 50);
        g.drawOval(100, 30, 50, 50);
        g.drawOval(150, 30, 50, 50);

        //mouth
        g.drawArc(100, 100, 50, 50, 25, 15);

        
    }
}
