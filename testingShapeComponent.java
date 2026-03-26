
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

public class testingShapeComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2d= (Graphics2D) g;
        g2d.setPaint(Color.BLUE);
        g2d.draw(new Rectangle2D.Double(10, 10, 100, 100));

    }
}
