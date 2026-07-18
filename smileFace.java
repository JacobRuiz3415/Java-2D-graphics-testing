import java.awt.*;
import javax.swing.JComponent;

public class smileFace extends JComponent {
    public void  smile(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        super.paint(g);

        g.drawOval(150, 150, 100, 100);
        g.drawOval(50, 30, 50, 50);

        g.drawOval(150, 30, 50, 50);
        g.drawArc(100, 100, 50, 50, 25, 15);

        
    }
}
